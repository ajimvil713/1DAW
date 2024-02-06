package Bucles;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int numero;
		
		do {
			numero = random.nextInt(101);
			System.out.println("El numero generado es el " + numero);
		} while (numero % 9 != 0);
		
		System.out.println();
		System.out.println("El numero " + numero + " es multiplo de 9");
	}

}
