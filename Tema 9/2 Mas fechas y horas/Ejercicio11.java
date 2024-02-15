package MasFechasYHoras;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Obtenemos el mes actual
		Month mesActual = LocalDate.now().getMonth();
		
		// Obtenemos el nombre en español
		String nombreMes = mesActual.getDisplayName(java.time.format.TextStyle.FULL, new java.util.Locale("es", "ES"));
		
		// Mostramos el resultado
		System.out.println("El mes actual en castellano es: " + nombreMes);
	}

}
