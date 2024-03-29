package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String letra = ""; // Variable donde se guardan las letras que introducimos
		
		boolean fin = false; // Indica el fin del programa
		int contador = 0; // Cuenta las ejecuciones
		String cadena = ""; // Acumula las letras ya introducidas
		
		// Mientras fin sea falso, vamos haciendo el bucle
		while (!fin) {
			// Pedimos los datos al usuario y los almacenamos
			System.out.println("Introduce una cadena");
			letra = sc.nextLine();
			
			// La cadena está vacía?
			if (letra.isEmpty()) {
				// finalizamos el bucle
				fin = true;
			// La cadena tiene algún valor?
			} else {
				// Contamos el bucle
				contador++;
				// Concatenamos la cadena
				cadena = cadena + letra + " ";
			}
		}
		
		// Imprimimos las soluciones
		System.out.println("Se han introducido " + contador + " cadenas.");
		System.out.println(cadena);
	}

}
