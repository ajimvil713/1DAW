package Aleatorios;

import java.util.Random;

public class Ejercicio2 {
	
	/* Enunciado:
	 * 
	 * El lanzamiento de un dado.
	 */
	
	public static void main(String[] args) {
		Random random = new Random();
		
		// Numero aleatorio entre 1 y 6, ambos incluidos
		int dado = random.nextInt(6 - 1 + 1) + 1;
		
		System.out.println(dado);
	}

}
