package MasFechasYHoras;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos los objetos LocalDate con las fechas proporcionadas
		LocalDate fechaInicio = LocalDate.of(2001, 10, 7);
		LocalDate fechaFin = LocalDate.of(2004, 5, 10);
		
		// Calculamos el periodo entre ambas fechas
		Period periodo = Period.between(fechaInicio, fechaFin);
		
		// Extraemos los años del periodo
		int años = periodo.getYears();
		
		// Mostramos el resultado
		System.out.println("Años transcurridos entre el 7/10/2001 y el 10/5/2004: " + años);
	}

}
