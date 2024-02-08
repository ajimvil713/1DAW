package If;

import java.util.Scanner;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce el tipo (A o B): ");
		String tipo = sc.next();
		
		System.out.print("Introduce el tamaño (1 o 2): ");
		int tamano = sc.nextInt();
		
		// Comprobación
		if (tipo.charAt(0) == 'A' && tamano == 1) {
			System.out.println("Se han cargado 20 céntimos");
		} else if (tipo.charAt(0) == 'A' && tamano == 2) {
			System.out.println("Se han cargado 30 centimos");
		} else if (tipo.charAt(0) == 'B' && tamano == 1) {
			System.out.println("Rebaja de 30 centimos");
		} else if (tipo.charAt(0) == 'B' && tamano == 2) {
			System.out.println("Rebaja de 50 céntimos");
		} else {
			System.out.println("Los valores introducidos no son correctos");
		}
	}

}
