package Aleatorios;

import java.util.Random;

public class Ejercicio6 {
	
	/* Enunciado:
	 * 
	 * Un mes del año y mostrar si es verano o no 
   * (entenderemos como verano los meses de julio y agosto).
	 */
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int mes = random.nextInt(12 - 1 + 1) + 1;
		
		System.out.println("El numero aleatorio (mes) es: " + mes + " por lo tanto");
		if (mes == 6 || mes == 7) {
			System.out.println("Es verano");
		} else {
			System.out.println("No es verano");
		}
	}

}
