package EjerciciosClase;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0, acumulador = 0, contador = 0, pares = 0;
		System.out.println("Introduce un número, negativo para salir");
		numero = sc.nextInt();
		
		while(numero > 0) {
			acumulador = acumulador + numero;
			contador++;
			System.out.println("Introduce un número, negativo para salir");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println("La suma de los números es " + acumulador);
		System.out.println("Has introducido " + contador + " numeros");
		System.out.println("La media es " + acumulador / contador);
	}

}
