package If;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce la nota: ");
		int nota = sc.nextInt();
		
		System.out.print("Introduce la edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Introduce el sexo (M o F): ");
		String sexo = sc.next();
		
		// Comprobamos si el exponente es positivo, 0 o negativo
		if (nota >= 5 && edad >= 18 && sexo.charAt(0) == 'M' ) {
			System.out.println("Posible");
		} else if (nota >= 5 && edad >= 18 && sexo.charAt(0) == 'F'){
			System.out.println("Aceptada");
		} else {
			System.out.println("No aceptada");
		}
	}

}
