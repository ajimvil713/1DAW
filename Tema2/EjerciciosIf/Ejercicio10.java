package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio10 {
	
	/* Enunciado:
	 * 
	 * El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
	 * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros.  
	 * De 30 a 49 alumnos, el costo es de 95 euros. 
	 * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje. 
	 */

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
