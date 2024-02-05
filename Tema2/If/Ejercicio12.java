package If;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Ingrese el número obtenido al lanzar el dado: ");
		int numero = sc.nextInt();
		
		String caraOpusta = "";
		
		// Comprobamos la duración de la llamada
		switch (numero) {
		case 1:
			caraOpusta = "6";
			break;
		case 2:
			caraOpusta = "5";
			break;
		case 3:
			caraOpusta = "4";
			break;
		case 4:
			caraOpusta = "5";
			break;
		case 5:
			caraOpusta = "3";
			break;
		case 6:
			caraOpusta = "1";
			break;
		default:
			System.out.println("Error numero incorrecto");
			break;
		}
		
		// Imprimimos el resultado final
		System.out.printf("La cara opuesta al numero %d es el %s.", numero, caraOpusta);
	}

}
