package If;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce una cadena: ");
		String cadena = sc.nextLine();
		
		// Miramos si es mayuscula
		if (cadena.length() == 1 && cadena.charAt(0) >= 'A' && cadena.charAt(0) <= 'Z') {
		System.out.println(cadena + " es una letra mayúscula");
		} else {
			System.out.println(cadena + " es una letra minúscula");
		}
	}

}
