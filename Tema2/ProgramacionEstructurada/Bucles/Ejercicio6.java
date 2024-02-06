package Bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nota;
		
		// Variables tipo contador
		int deficiente = 0;
		int insuficiente = 0;
		int aprobado = 0;
		int bien = 0;
		int notable = 0;
		int sobre = 0;
		
		// Bucle para pedir los datos al usuario
		do {
			System.out.println("Introduce la nota del estudiante");
			nota = sc.nextInt();
			
			// Si la nota es negativa
			if (nota < 0) {
				break;
			}
			
			// Aumentamos los contadores
			if (nota >= 0 && nota <= 2) {
				deficiente++;
			} else if (nota >= 3 && nota <= 4){
				insuficiente++;
			} else if (nota == 5) {
				aprobado++;
			} else if (nota == 6) {
				bien++;
			} else if (nota <= 7 && nota <= 8) {
				notable++;
			} else if (nota >= 9 && nota <= 10) {
				sobre++;
			}
		// Finalizamos el programa cuando nos encontremos con un break
		} while (true);
		
		// Imprimimos los resultados
		System.out.println("Muy Deficientes: " + deficiente);
		System.out.println("Insuficiente: " + insuficiente);
		System.out.println("Aprobados: " + aprobado);
		System.out.println("Bienes: " + bien);
		System.out.println("Notables: " + notable);
		System.out.println("Sobresalientes: " + sobre);
	}

}
