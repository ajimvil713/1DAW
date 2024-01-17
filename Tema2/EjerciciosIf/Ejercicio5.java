package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce la base: ");
		int base = sc.nextInt();
		
		System.out.print("Introduce el exponente: ");
		int exponente = sc.nextInt();
		
		// Comprobamos si el exponente es positivo, 0 o negativo
		if (exponente > 0) {
			System.out.println("El resultado es " + Math.pow(base, exponente));
		} else if (exponente == 0){
			System.out.println("El resultado es 1");
		} else {
			System.out.println("El resultado es " + 1 / Math.pow(base, -exponente));
		}
	}

}
