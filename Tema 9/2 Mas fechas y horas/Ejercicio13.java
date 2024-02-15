package MasFechasYHoras;

import java.time.LocalDate;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Creamos la fecha
		LocalDate fecha = LocalDate.ofYearDay(1989, 253);
		
		// Mostramos el resultado
		System.out.println("La fecha correspondiente al día 253 del año 1989 es: " + fecha);
	}

}
