package EjerciciosClase;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i;
		
		// Pedimos los datos y los almacenamos
		System.out.println("Introduce el número por el cual quieras multiplicar");
		int opcion = sc.nextInt();
		
		// Nos recorremos el valor minimo (1) hasta el maximo (10).
		for (i = 1; i <= 10; i++) {
			System.out.println(i + " x " + opcion + " = " + i * opcion);
		}
	}

}
