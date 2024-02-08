package Bucles;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i < 20; i++) {
			int dado = random.nextInt(6 - 1 + 1) + 1;
			System.out.println(dado);
		}
		
		System.out.println("--- Programa finalizado ---");
	}

}
