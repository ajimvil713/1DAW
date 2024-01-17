package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		
		// Miramos si es par
		if (numero % 2 == 0) {
			System.out.println(numero + " es un número par");
		} else {
			System.out.println(numero + " es un número impar");
		}
	}

}
