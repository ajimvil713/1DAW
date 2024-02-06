package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		do {
			// Pedimos los datos al usuario
			System.out.println("Introduce el número para multiplicar");
			numero = sc.nextInt();
		// Hacemos la comprobación
		} while (!((numero >= 0) && (numero <= 10)));
		
		// Imprimimos las tablas de multiplicar
		for (int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

}
