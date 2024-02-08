package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		byte nota;
		
		System.out.println("Introduce la nota");
		nota = sc.nextByte();
		
		// if anidado
		if (nota == 0 || nota == 1 || nota == 2) {
			System.out.println("Muy deficiente");
		} else if(nota == 3 || nota == 4){
			System.out.println("Insuficiente");
		} else if(nota == 5) {
			System.out.println("Suficiente");
		} else if(nota == 6) {
			System.out.println("Bien");
		} else if(nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if(nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("La nota introducida no es correcta");
		}
		
		// Switch
		switch (nota) {
		case 0, 1, 2:
			System.out.println("Muy deficiente");
			break;
		case 3, 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("La nota introducida no es correcta");
			break;
		}
	}

}
