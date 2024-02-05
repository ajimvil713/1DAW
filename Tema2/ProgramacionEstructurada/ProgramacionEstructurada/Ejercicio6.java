package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Introduce 3 números");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("hay tres números iguales a " + n1);
		} else if (n1 == n2 || n1 == n3) {
			System.out.println("Hay dos números iguales a " + n1);
		} else if (n2 == n1 || n2 == n3) {
			System.out.println("Hay dos números iguales a " + n2);
		} else {
			System.out.println("No hay números iguales");
		}

	}

}
