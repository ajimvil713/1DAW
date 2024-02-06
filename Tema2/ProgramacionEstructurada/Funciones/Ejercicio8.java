package Funciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el número de líneas: ");
		int fin = sc.nextInt();
		
		for (int i = 0; i <= fin; i++) {
			imprimirRombo(i);
		}
		
		for (int i = fin - 1; i >= 0; i--) {
			imprimirRombo(i);
		}
	}


	// Función para imprimir un rombo con *
	public static void imprimirRombo (int lineas) {
		String cadena = "";
		int posicionInicial = 5 - lineas;
		
		for (int i = 0; i <= posicionInicial; i++) {
			cadena = cadena + " ";
		}
		
		for (int i = 1; i <= lineas; i++) {
			cadena = cadena + "* ";
		}
		
		System.out.println(cadena);
	}

}
