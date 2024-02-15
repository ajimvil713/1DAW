package MasFechasYHoras;

import java.time.LocalDate;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Crear un objeto LocalDate con la fecha proporcionada
		LocalDate fechaInicio = LocalDate.of(2009, 12, 15);
		
		// Agregar 1 mes a la fecha inicial
		LocalDate fechaFin = fechaInicio.plusMonths(1);
		
		// Imprimir la fecha resultante
		System.out.println("1 mes después del 15/12/2009 es: " + fechaFin);
	}

}
