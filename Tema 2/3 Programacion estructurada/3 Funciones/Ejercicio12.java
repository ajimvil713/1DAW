package Funciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Solicitar al usuario la casilla del tablero
		System.out.print("Ingrese la casilla del tablero: ");
		String casilla = scanner.nextLine();


		// Obtenemos las coordenadas de la casilla
		int fila = 8 - Character.getNumericValue(casilla.charAt(1));
		int columna = casilla.toLowerCase().charAt(0) - 'a';
			
		// Llamamos a la función
		tableroAjedrez(8, fila, columna);
		}


	public static void tableroAjedrez (int tamano, int fila, int columna) {
		// Caracteres para representar las casillas
		char blanco = '\u2B1B';
		char negro = '\u2B1C';
		char alfil = '\u265D';
		
		// Bucle para dibujar el tablero
		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				char caracter;
				if (i == fila && j == columna) {
					caracter = alfil;
				} else {
					caracter = (i + j) % 2 == 0 ? blanco:negro;
				}
				System.out.print(caracter + " ");
			}
			System.out.println();
		}	
	}
	
}
