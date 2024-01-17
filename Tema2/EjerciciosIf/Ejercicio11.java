package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce la duración de la llamada, en minutos: ");
		int duracion = sc.nextInt();
		
		System.out.print("Introduce el dia de la semana: ");
		String dia = sc.next();
		
		System.out.print("Introduce el turno: ");
		String turno = sc.next();
		
		double costo = 0;
		
		// Comprobamos la duración de la llamada
		if (duracion <= 5) {
			costo = 1;
		} else if (duracion <= 8) {
			costo = 1 + (duracion - 5) * 0.8;
		} else if (duracion <= 10) {
			costo = 1 + 3 * 0.8 + (duracion - 8) * 0.7;
		} else {
			costo = 1 + 3 * 1.8 + 2 * 0.7 + (duracion - 10) * 0.5;
		}
		
		// Comprobamos que dia de la semana es
		if (dia.equals("domingo")) {
			costo *= 1.03;
		} else {
			// Comprobamos el turno de llamada
			if (turno.equals("mañana")) {
				costo *= 1.15;
			} else {
				costo *= 1.1;
			}
		}
		
		// Imprimimos el precio final
		System.out.printf("El costo de la llamada es de %.2f euros.", costo);
	}

}
