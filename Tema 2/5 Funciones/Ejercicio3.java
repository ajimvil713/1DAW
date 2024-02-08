package Funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce la hora: ");
		short hora = (short) sc.nextInt();
		
		System.out.print("Introduce los minutos: ");
		short minutos = (short) sc.nextInt();
		
		System.out.print("Introduce los segundos: ");
		short segundos = (short) sc.nextInt();
		
		boolean resultadoHora = esHora(hora);
		boolean resultadoMinutos = esMinutooSegundo(minutos, segundos);
		
		if (resultadoHora && resultadoMinutos) {
			System.out.println("La hora introducida es correcta");
		} else {
			System.out.println("La hora introducida no es correcta");
		}
	}
	
	// Función para saber si es hora
	public static boolean esHora(short valor) {
		
		if (valor >= 0 && valor < 24) {
			return true;
		}
		
		return false;
	}


	// Función para saber si son minutos y segundos
	public static boolean esMinutooSegundo(short valor1, short valor2) {
		
		if ((valor1 >= 0 && valor1 <= 59) && (valor2 >= 0 && valor2 <= 59)) {
			return true;
		}
		
		return false;
	}

}
