package ProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		
		String cadena;
		char caracter;
		int posicion;
		
		System.out.println("Introduce una cadena");
		cadena = sc.nextLine();
		
		posicion = rand.nextInt(cadena.length());
		caracter = cadena.charAt(posicion);
		
		System.out.println("El carácter aleatorio es el " + caracter);
		System.out.println("Y se ha encontrado en la posición " + posicion);
	}

}
