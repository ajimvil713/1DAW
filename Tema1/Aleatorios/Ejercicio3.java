package Aleatorios;

import java.util.Random;

public class Ejercicio3 {
	
	/* Enunciado:
	 * 
	 * Un número entre 34 y 68 ambos incluidos.
	 */
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int numero = random.nextInt(68 - 34 + 1) + 34;
		
		System.out.println(numero);
	}

}
