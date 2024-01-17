package LecturaPorTeclado;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedir los datos al usuario y almacenarlos
		System.out.print("Nombre: ");
		String nombre = sc.next();
		
		sc.nextLine(); // Omitimos el carácter de nueva línea
		
		System.out.print("Apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.print("Edad: ");
		byte edad = sc.nextByte();
		
		sc.nextLine(); // Omitimos el carácter de nueva línea
		
		System.out.println("Dirección");
		
		System.out.print("Calle: ");
		String calle = sc.nextLine();
		
		System.out.print("Número: ");
		byte numero = sc.nextByte();
		
		System.out.print("Codigo postal: ");
		short cp = sc.nextShort();
		
		System.out.print("Provincia: ");
		String provincia = sc.next();
		
		System.out.print("¿Eres estudiante? (Responder sólo true o false): ");
		boolean estudiante = sc.nextBoolean();
		
		System.out.print("Altura: ");
		float altura = sc.nextFloat();
		
		// Imprimir los resultados
		System.out.println("\n");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Dirección");
		System.out.println("Calle: " + calle);
		System.out.println("Numero: " + numero);
		System.out.println("Código Postal: " + cp);
		System.out.println("Provincia: " + provincia);
		System.out.println("¿Eres estudiante? " + estudiante);
		System.out.println("Altura: " + altura + " metros");
	}

}
