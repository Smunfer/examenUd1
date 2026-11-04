package ud1.examen;
//Importamos el scanner para poder guardar los datos pedidos en el programa
import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		//Declaramos el scanner y la variable de edad que nos pide el programa
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		//Declaramos el precio base de la entrada que sera de 15 euros
		int precio = 15;
		//Creamos una estructura que comprobara si es mayor de edad o no
		if (edad >=18) {
		/*Declaramos la variable String de invitacion que nos pide el programa, poniendola 
		a lowerCase para que si la escribe en mayusculas se ponga en 
		minusculas para comprobarlo en el switch case*/
			System.out.println("Tienes invitacion: ");
			String invitacion = sc.next().toLowerCase();
		/*Creamos la estructura del switch que comprobara si tenemos o no invitacion, comprobando 
		 * si el String es: si, no o default en caso de que se escriba algo que no es*/	
			switch (invitacion) {
		/*Por ultimo en cada caso hacemos una cosa u otra dependiendo de la opcion elegida
		 actualizando las variables y mostrando los mensajes oportunos por pantalla */
		case "si":
			precio = 0;
			System.out.println("Puedes entrar");
			System.out.println("El precio de la entrada es  de " + precio + " euros, es gratis");
		break;
		case "no":
			precio = 15;
			System.out.println("Puedes entrar");
			System.out.println("El precio de la entrada es de " + precio + " euros");
		break;
		default :
			System.out.println("Opcion no valida");
		break;
		}
		//Si es menor de edad o la edad es invalida ponemos el mensaje correspondiente
		}else if (edad>0 && edad<18){
			System.out.println("Eres menor de edad");
		}else {
			System.out.println("Edad no valida");
		}
		
	}
}
