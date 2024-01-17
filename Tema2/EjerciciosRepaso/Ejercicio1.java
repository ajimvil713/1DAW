package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Declaramos las variables
		String cadena;
		
		// Pedimos datos al usuario
		System.out.println("Introduce la cadena a analizar");
		cadena = sc.nextLine();
		
		// Enviamos cadena a la función
		leerCadena(cadena);
	}
	
	// Función que devuelve si la cadena tiene más de 6 cifras
	public static void leerCadena(String cadena) {
		if (cadena.length() >= 6) {
			System.out.println("La longitud de la cadena es mayor o igual a 6 caracteres");
		} else {
			System.out.println("La longitud de la cadena es menor de 6 caracteres");
		}
	}
  
}
