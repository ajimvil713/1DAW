package FechaYHora;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int dia, mes, diasTranscurridos;
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los datos al usuario
		System.out.print("Introduce el dia: ");
		dia = sc.nextInt();
		
		System.out.print("Introduce el mes: ");
		mes = sc.nextInt();
		
		sc.close(); // Cerramos el scanner
		
		// Llamamos a la funcion y alamcenamos el resultado
		diasTranscurridos = diasTranscurridos(dia, mes);
		System.out.println("Dias trascurridos desde el 1 de enero: " + diasTranscurridos);
	}
	
	public static int diasTranscurridos(int dia, int mes) {
		LocalDate fechaInicio = LocalDate.of(LocalDate.now().getYear(), 1, 1);
		LocalDate fechaDada = LocalDate.of(LocalDate.now().getYear(), mes, dia);
		
		return (int)fechaInicio.until(fechaDada).getDays();
	}
	
}
