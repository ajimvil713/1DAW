package EjerciciosClase;

import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		imprimeMenu();
		byte opcion = opcion();
		
		switch (opcion) {
		case 1:
			sumar();
			break;
		case 2:
			restar();
			break;
		case 3:
			multi();
			break;
		case 4:
			divi();
			break;
		case 5:
			resto();
			break;
		default:
			System.out.println("La opción no valida");
			break;
		}
	}
	
	public static void imprimeMenu() {
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		System.out.println("5) Residuo");
		System.out.println();
		System.out.print("Elige una opcion: ");
	}


	public static byte opcion() {
		byte opcion = sc.nextByte();
		return opcion;
	}


	public static void sumar() {
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado es " + (num1 + num2));
	}


	public static void restar() {
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado es " + (num1 - num2));
	}


	public static void multi() {
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado es " + (num1 * num2));
	}


	public static void divi() {
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado es " + (num1 / num2));
	}


	public static void resto() {
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		System.out.println("El resultado es " + (num1 % num2));
	}

}
