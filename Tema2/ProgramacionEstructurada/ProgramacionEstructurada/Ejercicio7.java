package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Introduce 3 números");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("El numero " + n1 + " es el mayor");
		} else if (n1 == n2 && n2 == n3) {
			System.out.println("Los tres números son iguales");
		} else {
			if (n2 > n3) {
				System.out.println("El numero " + n2 + " es el mayor");
			} else {
				System.out.println("El numero " + n3 + " es el mayor");
			}
		}
	}

}
