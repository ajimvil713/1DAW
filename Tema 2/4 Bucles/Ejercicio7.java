package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.println("Introduce un número tipo long");
		long numero = sc.nextLong();
		
		int contador = 0;
		
		if (numero == 0) {
			System.out.println("El numero tiene 1 cifra");;
		} else {
			while (numero != 0) {
				numero = numero / 10;
				contador++;
			}
			System.out.println("El numero tiene " + contador + " cifras.");
		}
	}

}
