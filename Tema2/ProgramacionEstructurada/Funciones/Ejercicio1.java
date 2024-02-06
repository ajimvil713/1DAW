package Funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario
		System.out.println("Introduce la base");
		int base = sc.nextInt();
		
		System.out.println("Introduce el exponente");
		int exponente = sc.nextInt();
		
		// Enviamos los datos a la función y almacenamos el resultado
		int resultado = potencia(base, exponente);
		
		// Imprimimos el resultado
		System.out.println("El resultado es: " + resultado);
	}
	
	// Función recursiva que calcula la potencia
	public static int potencia(int base, int exponente) {
		
		int resultado;
		
		if (exponente == 0) {
			resultado = 1;
		} else {
			resultado = base * potencia(base, exponente - 1);
		}
		
		return resultado;
	}


}
