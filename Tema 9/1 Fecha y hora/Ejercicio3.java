package FechaYHora;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println(esValida("2012-12-23"));
		System.out.println(esValida("23/12/2012", "dd/MM/yyyy"));
	}
	
	public static boolean esValida(String fecha) {
		try {
			LocalDate.parse(fecha);
			return true;
		} catch (DateTimeException e) {
			return false;
		}
	}
	
	// Igual que el anterior pero comprobando el formato
	public static boolean esValida(String fecha, String patron) {
		try {
			DateTimeFormatter f = DateTimeFormatter.ofPattern(patron);
			LocalDate.parse(fecha, f);
			
			return true;
		} catch (DateTimeException e) {
			return false;
		}
	}

}
