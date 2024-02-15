package MasFechasYHoras;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Creamos la fecha proporcionada
		LocalDate fechaInicio = LocalDate.of(1940, 10, 1);
		
		// Obtenemos el dia de la semana
		DayOfWeek diaSemana = fechaInicio.getDayOfWeek();
		
		// Mostramos el resultado
		System.out.println("El primer día de octubre de 1940 fue " + diaSemana);
	}
	
}
