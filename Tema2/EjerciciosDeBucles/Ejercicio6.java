package EjerciciosDeBucles;

import java.util.Scanner;

public class Ejercicio6 {
	
	/* Enunciado:
	 * 
	 * Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce una letra (Espacio para finalizar)");
		
		boolean fin = false;
		
		// Mientras fin sea falso, ejecutamos el bucle
		while (!fin) {
			// Almacenamos las letras que se introduzcan en minúscula
			String letra = sc.nextLine().toLowerCase();
			
			// Si se ha introducido un espacio
			if (letra.equals(" ")) {
				// Terminamos el bucle
				fin = true;
			// Si la letra tiene 1 carácter
			} else if (letra.length() == 1){
				// El String lo convertimos a carácter
				char caracter = letra.charAt(0);
				// Comprobamos si es una vocal
				if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
					System.out.println("VOCAL");
				// Si es consonante
				} else {
					System.out.println("NO VOCAL");
				}
			// Si ha introducido más de una letra
			} else {
				System.out.println("Error: Ingresa solo un carácter");
			}
		}
		System.out.println("Programa finalizado");
	}

}
