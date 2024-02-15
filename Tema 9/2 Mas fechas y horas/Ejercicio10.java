package MasFechasYHoras;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Obtenemos la fecha actual
		LocalDate fechaActual = LocalDate.now();
		
		// Calculamos la fecha hace 3 dias
		LocalDate fecha3Dias = fechaActual.minusDays(3);
		
		// Obtenemos el dia de la semana correspondiente a la fecha de hace 3 dias
		DayOfWeek diaSemana = fecha3Dias.getDayOfWeek();
		
		// Mostramos el resultado
		System.out.println("Hace 3 dias fué " + diaSemana);
	}

}
