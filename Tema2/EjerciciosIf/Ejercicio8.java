package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio8 {
	
	/* Enunciado:
	 * 
	 * Escribe un programa que reciba un año y nos diga si es bisiesto o no. 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce un año: ");
		int ano = sc.nextInt();
		
		// Con esta variable decidiremos si es bisiesto
		boolean resultado = false;
		
		// Comprobación
		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				if (ano % 400 == 0) {
					resultado = true;
				}
			} else {
				resultado = true;
			}
		}
		
		// Imprimimos el resultado
		if (resultado) {
			System.out.println("El año es bisiesto");
		} else {
			System.out.println("El año no es bisiesto");
		}
	}

}
