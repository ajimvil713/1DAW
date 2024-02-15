package MasFechasYHoras;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Creamos los objetos para representar las horas
		LocalTime horaInicio = LocalTime.of(10, 15);
		LocalTime horaFin = LocalTime.of(12, 30);
		
		// Calculamos la duración de entre las horas
		Duration duracion = Duration.between(horaInicio, horaFin);
		
		// Obtenemos el total de segundos
		long segundos = duracion.getSeconds();
		
		// Mostramos el resultado
		System.out.println("Han pasado " + segundos + " segundos entre las 10:15 y las 12:30.");
	}

}
