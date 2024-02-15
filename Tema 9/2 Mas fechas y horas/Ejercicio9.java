package MasFechasYHoras;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creamos el objeto LocalDate con la fecha del ejercicio anterior
		LocalDate fechaInicio = LocalDate.of(2020, 2, 3);
		
		// Creamos el periodo del ejercicio 8
		Period periodo = Period.of(1, 5, 2);
		
		// Sumamos el periodo a la fecha inicial
		LocalDate fechaResultado = fechaInicio.plus(periodo);
		
		// Mostramos el resultado
		System.out.println("La fecha resultante al sumar el período al 12/11/2022 es: " + fechaResultado);
	}

}
