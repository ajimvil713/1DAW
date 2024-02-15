package MasFechasYHoras;

import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos el objeto LocalDate con la fecha proporcionada
		LocalDate fecha = LocalDate.of(2020, 12, 7);
		
		// Obtenemos el numero del mes
		int numMes = fecha.getMonthValue();
		
		// Obtenemos el nombre del mes
		String nombreMes = fecha.getMonth().toString();
		
		// Mostramos el resultado
		System.out.println("La fecha 7/12/2020 corresponde al mes número " + numMes + " - " + nombreMes);
	}

}
