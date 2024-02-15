package MasFechasYHoras;

import java.time.LocalDate;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el objeto LocalDate con la fecha proporcionada
		LocalDate fechaInicio = LocalDate.of(2010, 2, 20);
		
		// Agregamos 30 dias a la fecha inicial
		LocalDate fechaFin = fechaInicio.plusDays(30);
		
		// Mostramos el resultado
		System.out.println("30 días después del 20/2/2010 es: " + fechaFin);
	}

}
