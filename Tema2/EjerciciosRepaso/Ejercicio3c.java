package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3c {
	
	/* Enunciado:
	 * 
	 * Realiza el mismo ejercicio indicando si algún número es menor que 10
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero1;
		
		System.out.println("Introduce un número");
		numero1 = sc.nextInt();
		
		menor10(numero1);

	}
	
	// Función que devuelve si el número es mayor o menor que 10
	public static void menor10(int numero1) {
		if (numero1 > 10) {
			System.out.println("El numero " + numero1 + " es mayor que 10");
		} else {
			System.out.println("El numero " + numero1 + " es menor que 10");
		}
	}
	
}