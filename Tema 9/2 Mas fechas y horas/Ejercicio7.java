package MasFechasYHoras;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Crear objetos LocalDateTime con las fechas y horas proporcionadas
		LocalDateTime fechaInicio = LocalDateTime.of(LocalDate.of(2001, 10, 7), LocalTime.MIDNIGHT);
		LocalDateTime fechaFin = LocalDateTime.of(LocalDate.of(2004, 5, 10), LocalTime.MIDNIGHT);
		
		// Calcular la duración entre las dos fechas y horas
		Duration duracion = Duration.between(fechaInicio, fechaFin);
		
		// Obtener el total de horas de la duración
		long horasTranscurridas = duracion.toHours();
		
		// Imprimir el resultado
		System.out.println("Horas transcurridas entre el 7/10/2001 y el 10/5/2004: " + horasTranscurridas);
	}

}
