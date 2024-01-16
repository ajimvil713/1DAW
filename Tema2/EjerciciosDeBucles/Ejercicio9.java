package EjerciciosDeBucles;

import java.util.Scanner;

public class Ejercicio9 {
	
	/* Enunciado:
	 * 
	 * Algoritmo que lea dos números float por teclado e indique  los números enteros que hay entre ellos: por ejemplo 34,54 y 37,5 daría 35, 36, 37.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.println("Introduce el primer número decimal");
		long num1 = sc.nextLong();
		
		System.out.println("Introduce el segundo número decimal");
		long num2 = sc.nextLong();
		
		// Ordenamos
		int limiteInferior = (int) Math.min(num1, num2);
		int limiteSuperior = (int) Math.max(num1, num2);
		
		// Imprimimos resultados
		System.out.println("Los número que hay entre " + num1 + " y " + num2);
		for (int i = limiteInferior; i < limiteSuperior; i++) {
			System.out.print(i + " ");
		}
	}

}
