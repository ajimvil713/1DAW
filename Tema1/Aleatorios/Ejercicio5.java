package Aleatorios;

import java.util.Random;

public class Ejercicio5 {
	
	/* Enunciado:
	 * 
	 * Un día de la semana y mostrar si es fin de semana o no.
	 */
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int dia = random.nextInt(7 - 1 + 1) + 1;
		
		if (dia == 6 || dia == 7) {
			System.out.println("El dia de la semana es: " + dia);
			System.out.println("Es fin de semana");
		} else {
			System.out.println("El dia de la semana es: " + dia);
			System.out.println("No es fin de semana");
		}
	}

}
