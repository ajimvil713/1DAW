package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce el número de alumnos: ");
		int alumnos = sc.nextInt();
		
		int precio = 0;
		
		// Comprobación
		if (alumnos > 100) {
			precio = 65;
		} else if (alumnos >= 50 && alumnos <= 99) {
			precio = 70;
		} else if (alumnos >= 30 && alumnos <= 49) {
			precio = 95;
		} else if (alumnos < 30) {
			precio = 4000;
		} else {
			System.out.println("Error el número de alumnos no es correcto");
		}
		
		// Imprimimos el resultado en pantalla
		System.out.println("Hay que pagarle a la compañía de autobuses un total de " + precio + " €");
	}

}
