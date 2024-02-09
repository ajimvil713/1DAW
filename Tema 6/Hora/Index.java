package Tema6Ejercicio1Reloj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		byte hora = 14;
		byte min = 50;
		byte seg = 50;
		
		Reloj hora1 = new Reloj(hora, min, seg);
		int opcion;
		
		do {
			imprimirMenu();
			opcion = pedirNumero();
			
			switch (opcion) {
			case 1:
				try {
					System.out.print("Introduce la hora: ");
					hora = (byte) pedirNumero();
					
					System.out.print("Introduce los minutos: ");
					min = (byte) pedirNumero();
					
					System.out.print("Introduce los segundos: ");
					seg = (byte) pedirNumero();
					
					hora1 = new Reloj(hora, min, seg);
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.print("Introduce la hora: ");
				hora = (byte) pedirNumero();
				
				System.out.print("Introduce los minutos: ");
				min = (byte) pedirNumero();
				
				System.out.print("Introduce los segundos: ");
				seg = (byte) pedirNumero();
				
				hora1.setHora(hora);
				hora1.setMinutos(min);
				hora1.setSegundos(seg);
				break;
			case 3:
				System.out.println(hora1.dameHora(12));
				break;
			case 4:
				System.out.println(hora1.dameHora(24));
				break;
			case 5:
				System.out.println("El programa a finalizado correctamente");
				break;
			default:
				System.out.println("Error, la opción " + opcion + " no es valida");
				break;
			}
		} while (opcion != 5);
	}
	
	// Función que imprime un menu con opciones
	public static void imprimirMenu() {
		System.out.println();
		System.out.println("1) Introducir hora");
		System.out.println("2) Cambiar hora");
		System.out.println("3) Escribir la hora en formato AM/PM");
		System.out.println("4) Escribir la hora estandar");
		System.out.println("5) Salir");
		System.out.println();
		System.out.print("Introduce una opción: ");
	}
	
	// Función para pedir un numero entero
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}

}
