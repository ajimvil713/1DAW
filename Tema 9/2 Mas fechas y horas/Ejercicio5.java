package MasFechasYHoras;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crear objetos LocalDate con las fechas proporcionadas
		LocalDate fechaInicial = LocalDate.of(2001, 10, 7);
		LocalDate fechaFinal = LocalDate.of(2004, 5, 10);
		
		// Calcular el período entre las dos fechas
		Period periodo = Period.between(fechaInicial, fechaFinal);
		
		// Extraemos del perior el año y el mes
		int años = periodo.getYears();
		int meses = periodo.getMonths();
		
		// Convertimos los años a meses y sumamos los restantes
		int totalMeses = (años * 12) + meses;
		
		// Imprimimos el resultado
		System.out.println("Meses transcurridos entre el 7/10/2001 y el 10/5/2004: " + totalMeses);
	}

}
