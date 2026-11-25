package ud2.examen;

import java.util.Scanner;

public class ejercicio1 {
	
	class ParkingGratisExcepcion extends Exception{
		
		super (mensaje);
	}
	
	//Creamos la funcion que nos ayuda a formatear la matricula con .trim para los espacios y toUpperCase para las mayusculas
	public static String FormateaMatricula(String matricula) {
		return matricula.trim().toUpperCase();
	}
	//Funcion que va a validar si la matricula tiene el formato requerido o no con las expresiones regulares
	public static Boolean ValidaMatricula(String matricula) {
		FormateaMatricula(matricula)"^\d {4}\[A-z] {3}"; 
			
		
	}
	//Esta funcion nos permite asignar el valor del String matricula en un Integer y sumar sus 4 primeros numeros
	public static Integer SumaDigitos (String matricula) {
		Integer sumaDigitos = 0;
		Integer suma;
		for (int i = 0; i <4;i++) {
		char copia = matricula.charAt(i);
		suma = Integer.parseInt(matricula.valueOf(copia));
		sumaDigitos += suma;
		}
		
		 return sumaDigitos;
	}
	//Asigna una plaza, cogiendo la ultima letra de la matricula + la suma de los 4 primeros digitos que cogemos de la funcion de antes
	public static String AsignaPlaza (String matricula){
		char copia = matricula.charAt(6);
		matricula = String.valueOf(copia);
		
		return matricula + SumaDigitos(matricula);
	}
	//Funcion que utiliza el try catch para ver si la suma de los 4 digitos es 20 o las letras dicen DAW, para lanzar la excepcion de parking gratis
	public static void CompruebaPromocion (String matricula) throws ParkingGratisExcepcion {
		try {
			if(SumaDigitos(matricula) == 20) {
				System.out.println("Parking gratis");
			}
		}catch ParkingGratisExcepcion;
	}
	
	//Esta funcion mira si hay plazas suficientes y devuelve un valor u otro en funcion del valor de plaza ocupada
	public static int plazasLibres(Integer plazasOcupadas){
			final int plazasLibres = 2700;
			if(plazasOcupadas<plazasLibres) {
				return plazasLibres-plazasOcupadas;
			}else return 2700;
		}
	//En el main mostraremos por pantalla los distintos resultados que nos vaya dando las funciones
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String matricula;
		int plazasOcupadas = 0;
		
		//Un bucle para que si mete fin o se llenan las plazas disponibles terminara
		do {
			System.out.println("Introduce matricula (o fin para terminar)");
			matricula = sc.nextLine().toLowerCase();
			System.out.print("Matricula formateada: " +  FormateaMatricula(matricula));
			if(ValidaMatricula(matricula) == true) {
				System.out.println("Matriula Valida");
				System.out.println("Plaza asignada" + AsignaPlaza(matricula));
			} else {
				System.out.println("Error matricula no valida");
			}
			
			
			plazasOcupadas++;
		}while (matricula == "fin" || plazasLibres(plazasOcupadas) == 2700);
	}
}
