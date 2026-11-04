package ud1.examen;
//Importamos el scanner para poder guardar los datos pedidos en el programa
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		//Declaramos el scanner y las variables necesarias para cada parte del programa
		Scanner sc = new Scanner (System.in);
		int temperatura = 22;
		int respuesta = 0;
		//Mostramos por pantalla el mensaje de incio del programa y declaramos el resto de variables
		System.out.println("Adivina la temperatura actual");
		int intentos = 6;
		int intentosUsados = 0;
		double temperaturaMedia = 0;
		//Preguntamos si desea ayuda y depende de la opcion los guardamos de una forma u otra en la variable
		System.out.println("Deseas recibir ayuda?: ");
			String opcion = sc.next().toLowerCase();
			boolean ayuda;
			if (opcion.equals("si")) {
				ayuda = true;
			}else if (opcion.equals("no")) {
				ayuda = false;
			}else {
				System.out.println("Opcion no valida");
			}
		//Creamos el bucle que se terminara segun las condiciones puestas en el while
		do {
			System.out.println("Introduce la temperatura actual");
			
			
			//si elegimos la ayuda nos enseñara una serie de mensajes  dependiendo de si la temperatura es mayor o menor
				respuesta = sc.nextInt();
				temperaturaMedia+= respuesta;
				if(ayuda = true && respuesta < temperatura) {
					System.out.println("Te has equivocado");
					System.out.println("La temperatura es mayor");
				} else if(ayuda = true && respuesta > temperatura) {
					System.out.println("Te has equivocado");
					System.out.println("La temperatura es menor");
				}
			//Al no elegir la ayuda no nos  saldran esos mensajes	
			if (ayuda = false){
				respuesta = sc.nextInt();
				temperaturaMedia+= respuesta;
			}
			//Este condicional se utilizara para restar los intentos disponibles y sumar los usados
			if ( respuesta != temperatura) {
				
				intentos--;
				intentosUsados++;
				System.out.println("Te quedan " + intentos + " intentos");
			} else {
			//En caso de acertar mostraremos una serie de mensajes, entre ellos la media de temperatura y los intentos usados
				System.out.println("Has acertado");
				System.out.println("Has usado " + intentosUsados + " intentos");
				if(intentosUsados > 0) {
					System.out.println("La temperatura media es " + temperaturaMedia/intentosUsados);
				}else {
					System.out.println("La media es " + respuesta);
				}
				
			}
			
		} while (respuesta != temperatura && intentos >0);
		
		
	}
}
