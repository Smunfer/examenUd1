package ud1.examen;
//importamos el scanner
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		//creamos el scanner y las variables de altura y anchura
		Scanner sc = new Scanner (System.in);
		int altura = 6;
		int anchura = 6;
		//Pedimos que elija que carcter quiere que pinte con un switch lo guardamos
		System.out.println("Introduce el caracter para pintar la letra Z: 1: * | 2: #");
		int opcion = sc.nextInt();
		String caracter = "";
		switch (opcion) {
		case 1:
			caracter = "*";
		break;
		
		case 2: 
			caracter = "#";
		break;
		default :
			System.out.println("Error");
		break;
		}
		//Ahora creamos la figura con los bucles  y los condiconales que dependeran de la altura y la anchura para crearla
		for (int i = 1;i<=altura;i++) {
			if (i == 1) {
				for (int j = 0;j<anchura;j++) {
					System.out.print(caracter);
				}
			}else if (i == 2) {
				for (int j = 0;j<anchura-2;j++) {
					System.out.print(" ");
				}
				for (int j = anchura-1;j<anchura;j++) {
					System.out.print(caracter);
				}
				
			}
			else if (i == 3) {
				for (int j = 0;j<anchura-3;j++) {
					System.out.print(" ");
				}
				for (int j = anchura-1;j<anchura;j++) {
					System.out.print(caracter);
				}
			}
			else if (i == 4) {
				for (int j = 0;j<anchura-4;j++) {
					System.out.print(" ");
				}
				for (int j = anchura-1;j<anchura;j++) {
					System.out.print(caracter);
				}
			}
			else if (i == 5) {
				for (int j = 0;j<anchura-5;j++) {
					System.out.print(" ");
				}
				for (int j = anchura-1;j<anchura;j++) {
					System.out.print(caracter);
				}
			}		
			else if (i == 6) {
				for (int j = 0;j<anchura;j++) {
					System.out.print(caracter);
				}
			}
			System.out.println("");
		}
	}
}
