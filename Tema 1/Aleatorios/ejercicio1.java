package Aleatorios;

import java.util.Random;

public class ejercicio1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		boolean moneda = random.nextBoolean();
		
		if (moneda) {
			System.out.println("Cara");
		} else {
			System.out.println("Cruz");
		}
	}
	
}
