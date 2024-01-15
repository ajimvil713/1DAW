package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio6 {
	
	/* Enunciado:
	 * 
	 * Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo. 
	 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
	 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
	 * Otros casos -> NO ACEPTADA 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce la nota: ");
		int nota = sc.nextInt();
		
		System.out.print("Introduce la edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Introduce el sexo (M o F): ");
		String sexo = sc.next();
		
		// Comprobamos si el exponente es positivo, 0 o negativo
		if (nota >= 5 && edad >= 18 && sexo.charAt(0) == 'M' ) {
			System.out.println("Posible");
		} else if (nota >= 5 && edad >= 18 && sexo.charAt(0) == 'F'){
			System.out.println("Aceptada");
		} else {
			System.out.println("No aceptada");
		}
	}

}
