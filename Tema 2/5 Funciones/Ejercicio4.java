package Funciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce el número de días del mes: ");
		byte mes = sc.nextByte();
		
		if (mes >= 1 && mes <= 12) {
			String nombreMes = nombreMes(mes);
			byte diaMes = diasMes(mes);
			
			if (diaMes == -1) {
				System.out.println("Error el numero del dia es incorrecto");
			} else {
				System.out.println("El mes " + mes + " corresponde con " + nombreMes + " y tiene " + diaMes + " días.");
			}
		} else {
			System.out.println("El mes introducido no es válido");
		}
	}
	
	// Función para saber el nombre del mes
	public static String nombreMes(byte valor) {
		
		switch (valor) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		}
		
		return "Error el numero del dia es incorrecto";
	}


	// Función para saber los días del mes
	public static byte diasMes(byte numero) {
		
		switch (numero) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			return 28;
		}
		
		return -1;
	}

}
