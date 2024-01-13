package Aleatorios;

import java.util.Random;

public class Ejercicio7 {
	
	/* Enunciado:
	 * 
	 * Un día de la semana y mostrar qué día de la semana es.
	 */
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int dia = random.nextInt(7 - 1 + 1) + 1;
		
		System.out.println("El numero es: " + dia + " y corresponde al");
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error el numero de la semana no se ha generado correctamente");
			break;
		}
	}

}
