package FechaYHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Fecha Americano (MM/dd/yyyy): " + normalToAmericano("23/12/2012"));
		System.out.println("Fecha en Normal (dd/MM/yyyy): " + americanoToNormal("12/23/2012"));
	}
	
	// Funcion que convierte una frcha en español (Dia, mes, año) a americano (Mes, dia, año)
	public static String normalToAmericano(String fecha) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fec = LocalDate.parse(fecha, f);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		return fec.format(f2);
	}
	
	// Funcion que convierte una frcha a americano (Mes, dia, año) a español (Dia, mes, año)
	public static String americanoToNormal(String fecha) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate fec = LocalDate.parse(fecha, f);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return fec.format(f2);
	}

}
