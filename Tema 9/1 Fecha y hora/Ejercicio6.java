package FechaYHora;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejercicio6 {

	public static void main(String[] args) {
		LocalDateTime ahora = LocalDateTime.now();
		
		String diaSemana = ahora.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()); // lunes, martes, miercoles ...
		int dia = ahora.getDayOfMonth(); // El dia actual
		String mes = ahora.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()); // El nombre completo del mes actual
		int año = ahora.getYear(); // El año actual
		
		int hora = ahora.getHour(); // La hora actual
		int minutos = ahora.getMinute(); // Los minutos actuales
		int segundos = ahora.getSecond(); // Los segundos actuales
		
		// Imprimimos información en pantalla
		System.out.println("Hoy es " + diaSemana + " " + dia + "-" + mes + "-" + año +
				" a las " + hora + ":" + minutos + ":" + segundos);
	}

}
