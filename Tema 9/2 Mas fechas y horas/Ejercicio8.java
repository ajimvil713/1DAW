package MasFechasYHoras;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos los objetos LocaalDate con las fechas proporcionadas
		LocalDate fechaInicio = LocalDate.of(2020, 2, 3);
		LocalDate fechaFin = LocalDate.of(2021, 7, 5);
		
		// Calculamos el periodo
		Period periodo = Period.between(fechaInicio, fechaFin);
		
		// Mostramos el resultado
		System.out.println("Período entre el 3/2/2020 y el 5/7/2021:");
		System.out.println("Años: " + periodo.getYears());
		System.out.println("Meses: " + periodo.getMonths());
		System.out.println("Dias: " + periodo.getDays());
	}

}
