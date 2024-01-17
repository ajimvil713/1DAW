package EjerciciosRepaso;

import java.util.Scanner;
import static EjerciciosRepaso.ClaseColores.*;

public class Ejercicio3b {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.print("Introduce un número: ");
		numero1 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Introduce otro número: ");
		numero2 = sc.nextInt();
		
		separarUnidades(numero1, numero2);
	}
	
	public static void separarUnidades(int numero1, int numero2) {
		// Numeros en negrita
		System.out.printf(BOLD + "Numero: %d \n", numero1);
		System.out.printf(BOLD + "Numero: %d \n" + RESET, numero2);
		
		// Numeros normales
		System.out.printf("Unidades: %d Decenas: %d \n", numero1 % 10, (numero1 / 10) % 10);
		System.out.printf("Unidades: %d Decenas: %d \n", numero2 % 10, (numero2 / 10) % 10);
	}

}
