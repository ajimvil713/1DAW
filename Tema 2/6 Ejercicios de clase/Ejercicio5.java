package EjerciciosClase;

import java.util.Random;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		System.out.println(generaBinario(3));
	}
	
	public static String generaBinario(int longitud) {
		Random random = new Random();
		int numero = random.nextInt(1 - 0 + 1) + 0;
		String binario = String.valueOf(numero);
		
		if (longitud == 1) {
			return binario;
		} else {
			return generaBinario(longitud - 1) + binario;
		}
	}

}
