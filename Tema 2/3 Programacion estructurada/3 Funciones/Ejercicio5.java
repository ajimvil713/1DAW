package Funciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// 1º Parte
		System.out.print("Introduce el número que quieres comprobar: ");
		int numero = sc.nextInt();
		
		boolean resultado = esPrimo(numero);
		System.out.println(resultado);
		
		// 2º parte
		System.out.println();
		mostrarPrimos();
		
		// 3º parte
		factorizar(18);
		factorizar(11);
		factorizar(35);
		factorizar(40);
	}


	// Función que devuelve si un número es primo
	public static boolean esPrimo(int numero) {
		
		int indice = 2;
		
		while (indice < numero) {
			if (numero % indice == 0) {
				return false;
			}
			indice++;
		}
		
		return true;
	}
	
	// Función para devolver los números primos del 1 hasta el 10.000
	public static void mostrarPrimos() {
		
		int maximo = 10000;
		
		for (int numero = 2; numero <= maximo; numero++) {
			if (esPrimo(numero)) {
				System.out.println(numero + " es primo.");
			}
		}
	}
	
	public static void factorizar (int numero) {
		
		int indice = 2;
		int numero2 = numero;
		String resultado = numero + " = ";
		
		while (indice <= numero) {
			if (numero2 % indice == 0) {
				numero2 = numero2 / indice;
				resultado = resultado + indice + " * ";
			} else {
				indice++;
			}
		}
		
		resultado = resultado.substring(0, resultado.length() - 2);
		System.out.println(resultado);
	}

}
