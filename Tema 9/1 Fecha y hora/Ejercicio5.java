package FechaYHora;

import java.time.LocalDate;

public class Ejercicio5 {

	public static void main(String[] args) {
		LocalDate fechaNacimiento = LocalDate.of(2002, 6, 17);
		int edad = calcularEdad(fechaNacimiento);
		
		System.out.println("Tienes " + edad + " años");
	}

	public static int calcularEdad(LocalDate fechaNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		
		// Con esto ajustamos si el cumpleaños ya ocurrió este año
		if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() || 
			(fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() && 
			 fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
			edad --;
		}
		
		return edad;
	}
	
}
