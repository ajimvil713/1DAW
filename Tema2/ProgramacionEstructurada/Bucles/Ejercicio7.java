package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		int n1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		int n2 = sc.nextInt();
		
		int sumaPar = 0, sumaImpar = 0;
		
		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				sumaPar = sumaPar + i;
			} else {
				sumaImpar = sumaImpar + i;
			}
		}
		
		System.out.println("La suma de los números pares entre " + n1 + " y " + n2 + " es " + sumaPar);
		System.out.println("La suma de los números impares entre " + n1 + " y " + n2 + " es " + sumaImpar);
	}

}
