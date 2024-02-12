package FechaYHora;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio2 {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2024, 2, 11);
		DayOfWeek diaDeLaSemana = obtenerDiaDeLaSemana(fecha);
		
		System.out.println("El dia correspondiente a " + fecha + " es: " + diaDeLaSemana);
	}
	
	public static DayOfWeek obtenerDiaDeLaSemana(LocalDate fecha) {
		DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
		return diaDeLaSemana;
	}

}
