package If;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce un número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Introduce un número: ");
		int numero2 = sc.nextInt();
		
		// Miramos si es par
		if (numero2 == 0) {
			System.out.println("Error no se puede dividir entre 0");
		} else {
			System.out.println("El resultado de la división es " + numero1 / numero2);
		}
	}

}
