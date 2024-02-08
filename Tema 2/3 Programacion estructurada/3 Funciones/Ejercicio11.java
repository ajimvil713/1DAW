package Funciones;

public class Ejercicio11 {

	public static void main(String[] args) {
		tableroAjedrez(8);
	}

	
	public static void tableroAjedrez (int tamano) {
		// Caracteres para representar las casillas
		char blanco = '\u2B1B';
		char negro = '\u2B1C';
		
		// Bucle para dibujar el tablero
		for (int i = 0; i < tamano; i++) {
			for (int j = 0; j < tamano; j++) {
				// Alternamos los caracteres
				char caracter = (i + j) % 2 == 0 ? blanco : negro;
				System.out.print(caracter + " ");
			}
			System.out.println();
		}
	}

}
