package MasFechasYHoras;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crear objetos LocalDate con las fechas proporcionadas
		LocalDate fechaInicio = LocalDate.of(2001, 10, 7);
		LocalDate fechaFin = LocalDate.of(2004, 5, 10);

		// Calcular la diferencia en días entre las dos fechas
		long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

		// Imprimir el resultado
		System.out.println("Días transcurridos entre el 7/10/2001 y el 10/5/2004: " + diasTranscurridos);
	}

}
