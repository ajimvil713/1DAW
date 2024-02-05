package ProgramacionEstructurada;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		byte nDias;
		int distancia;
		double precio;
		
		System.out.println("Introduce el numero de dias");
		nDias = sc.nextByte();
		
		System.out.println("Introduce la distancia en metros");
		distancia = sc.nextInt();
		
		System.out.println("Calculando el precio de tu vuelo");
		precio = distancia * 0.35;
		
		if (distancia >= 1000 && nDias > 7) {
			System.out.println("Estás de suerte, tu vuelo tiene descuento");
			precio = (precio * 30.0) / 100.0;
		}
		
		System.out.println("El precio final de tus billetes es de " + precio + "€");
	}

}
