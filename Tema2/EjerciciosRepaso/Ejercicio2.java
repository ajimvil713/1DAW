package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio2 {
	
	/* Enunciado:
	 * 
	 * Realiza un procedimiento que pida un número por teclado y devuelva si tiene más de una cifra.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Declaramos las variables
		int numero;
		
		// Pedimos datos al usuario
		System.out.println("Introduce la cadena a analizar");
		numero = sc.nextInt();
		
		// Enviamos cadena a la función
		nCifras(numero);
	}
	
	// Función que devuelve si el numero tiene mas de una cifra
	public static void nCifras(int numero) {
		if (numero > -10 && numero < 10) {
			System.out.println("El numero solo tiene 1 cifra");
		} else {
			System.out.println("El numero tiene mas de una cifra");
		}
	}
  
}
