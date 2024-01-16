package EjerciciosDeBucles;

import java.util.Scanner;

public class Ejercicio5 {
	
	/* Enunciado:
	 * 
	 * Realiza un programa que dada un número long, imprima sus cifras separadas.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.println("Introduce un número de tipo Long:");
		long numero = sc.nextLong();
		
		// Convertimos el número a String
		String numeroCadena = String.valueOf(numero);
		
		for (int i = 0; i < numeroCadena.length(); i++) {
			char cifra = numeroCadena.charAt(i);
			System.out.print(cifra + " ");
		}
	}

}
