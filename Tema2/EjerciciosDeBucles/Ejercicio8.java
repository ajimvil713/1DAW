package EjerciciosDeBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.println("Introduce un número decimal");
		long numero = sc.nextLong();
		
		// Si introduce el número 0
		if (numero == 0) {
			System.out.println("0");
		}
		
		// Variable para devolver el string
		String binario = "";
		
		// Si el número es mayor que 0
		while (numero > 0) {
			// Guardamos el resto
			long resto = numero % 2;
			// Lo acumulamos, poniendo el resto al principio
			binario = resto + binario;
			// Volvemos a dividir entre 2
			numero = numero / 2;
		}
		// Imprimimos el resultado
		System.out.println(binario);
	}

}
