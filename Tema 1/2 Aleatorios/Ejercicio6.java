package Aleatorios;

import java.util.Random;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int mes = random.nextInt(12 - 1 + 1) + 1;
		
		System.out.println("El numero aleatorio (Mes) es: " + mes + " por lo tanto");
		if (mes == 6 || mes == 7) {
			System.out.println("Es verano");
		} else {
			System.out.println("No es verano");
		}
	}

}
