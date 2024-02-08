package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero = 0; // Variable donde se guardan los números que introducimos
		
		boolean fin = false; // Indica el fin del programa
		int contadorNumeros = 0; // Cuenta las ejecuciones (números positivos) que se vayan introduciendo
		int sumaImpares = 0; // Acumula la suma de los números impares
		int mayorPar = 0; // Guarda el mayor número par
		
		// Mientras fin sea falso, vamos haciendo el bucle
		while (!fin) {
			// Pedimos los números al usuario y los vamos almacenando
			System.out.println("Introduce un número");
			numero = sc.nextInt();
			
			// Si el número es negativo
			if (numero < 0) {
				// Nos salimos del bucle
				fin = true;
			// Si el número es positivo
			} else {
				// Guardamos la ejecución del bucle, ya que hemos introducido un número
				contadorNumeros++;
				
				// Si el número es impar
				if (numero % 2 != 0) {
					// Guardamos la suma
					sumaImpares = sumaImpares + numero;
				// Si el número es par
				} else {
					// Si el número introducido es más grande que mayorPar
					if (numero > mayorPar) {
						// Lo guardamos
						mayorPar = numero;
					}
				}
			}
		}
		
		// Imprimimos las soluciones
		System.out.println("Se han introducido " + contadorNumeros + " numeros.");
		System.out.println("La media de los números impares es " + sumaImpares);
		System.out.println("El mayor número par introducido es " + mayorPar);
	}

}
