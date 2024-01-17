package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce el primer lado: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Introduce el segundo lado: ");
		int lado2 = sc.nextInt();
		
		System.out.print("Introduce el tercer lado: ");
		int lado3 = sc.nextInt();
		
		// Comprobamos si es equilátero, isósceles o escaleno
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("El triangulo es equilatero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			System.out.println("El triángulo es isósceles");
		} else {
			System.out.println("El triángulo es escaleno");
		}
	}

}
