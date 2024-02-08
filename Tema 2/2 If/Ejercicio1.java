package If;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce un número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		int numero2 = sc.nextInt();
		
		// Miramos cual es el mayor
		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		} else if (numero1 < numero2){
			System.out.println(numero2 + " es mayor que " + numero1);
		} else {
			System.out.println("Has introducido 2 numeros iguales");
		}
	}

}
