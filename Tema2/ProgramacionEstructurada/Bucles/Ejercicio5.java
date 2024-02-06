package Bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer número");
		int n1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número");
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			for (int i = 0, j = 0; n1 < n2; i++, j++) {
				n1 = n1 * 2;
				n2 = n2 / 2;
			}
			
			System.out.println(n1 + " " + n2);
		} else {
			System.out.println("ERROR");
		}
	}

}
