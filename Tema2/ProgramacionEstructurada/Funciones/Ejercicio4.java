package Funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		int num2 = sc.nextInt();
		
		// Enviamos los datos a la función y almacenamos el resultado
		int resultado = mcd(num1, num2);
		
		// Imprimimos el resultado
		System.out.println("El resultado es: " + resultado);
	}


	// Funcion que calcula el maximo común divisor
	public static int mcd(int num1, int num2) {
		
		// mientras el número 2 (El más pequeño), sea distinto de 0
		while (num2 != 0) {
			// creamos una variable temporal con el valor del num2 para luego seguir dividiendo
			int tmp = num2;
			
			// Dividimos el número y nos quedamos con su resto
			num2 = num1 % num2;
			
			// A num 1 le asignamos el valor de temp para seguir dividiéndolo
			num1 = tmp;
		}
		
		// Una vez finalice el bucle (Cuando num2 sea 0) devolvemos el num1
		return num1;
	}

}
