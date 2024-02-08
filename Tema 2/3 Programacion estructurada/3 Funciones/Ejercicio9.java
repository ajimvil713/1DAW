package Funciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el número de filas para el triángulo: ");
		int numFilas = sc.nextInt();
		
		imprimirPiramide(numFilas);
	}


	// Función para imprimir una pirámide con números
	public static void imprimirPiramide (int numFilas) {
		for (int i = 0; i < numFilas; i++) {
			
			for (int j = 0; j < numFilas - i - 1; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

}
