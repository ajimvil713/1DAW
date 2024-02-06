package Funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario int
		System.out.println("Introduce el operando 1");
		int operando1 = sc.nextInt();
		
		System.out.println("Introduce el signo (+, -, * o /)");
		char signo = sc.next().charAt(0);
		
		System.out.println("Introduce el operando 2");
		int operando2 = sc.nextInt();
		
		// Eviamos los datos a la función y almacenamos el resultado
		int resultado = calcular(operando1, signo, operando2);
		
		// Imprimimos el resultado
		System.out.println("El resultado es: " + resultado);
		
		
		
		// Pedimos los datos al usuario double
		System.out.println("Introduce el operando 1");
		double operandoDouble1 = sc.nextDouble();
		
		System.out.println("Introduce el signo (+, -, * o /)");
		signo = sc.next().charAt(0);
		
		System.out.println("Introduce el operando 2");
		double operandoDouble2 = sc.nextDouble();
		
		// Enviamos los datos a la función y almacenamos el resultado
		double resultadoDouble = calcular(operando1, signo, operando2);
		
		// Imprimimos el resultado
		System.out.println("El resultado es: " + resultado);

	}


	// Función que calcula el resultado
	public static int calcular(int operando1, char signo, int operando2) {
		
		int resultado = 0;
		
		switch (signo) {
		case '+':
			resultado = operando1 + operando2;
			break;
		case '-':
			resultado = operando1 - operando2;
			break;
		case '*':
			resultado = operando1 * operando2;
			break;
		case '/':
			resultado = operando1 / operando2;
			break;
		default:
			System.out.println("La operación " + signo + " no está disponible");
			break;
		}
		
		return resultado;
	}
	
	// Función que calcula el resultado
	public static double calcular(double operando1, char signo, double operando2) {
		
		double resultado = 0;
		
		switch (signo) {
		case '+':
			resultado = operando1 + operando2;
			break;
		case '-':
			resultado = operando1 - operando2;
			break;
		case '*':
			resultado = operando1 * operando2;
			break;
		case '/':
			resultado = operando1 / operando2;
			break;
		default:
			System.out.println("La operación " + signo + " no está disponible");
			break;
		}
		
		return resultado;
	}


}
