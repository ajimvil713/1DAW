package EjercicioRepaso;

import java.util.Scanner;
import static EjerciciosRepaso.ClaseColores.*;

public class Ejercicio3a {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.print("Introduce un número: ");
		numero = sc.nextInt();
		
		separarUnidades(numero);
	}
	
	// Función que separa las unidades y pinta las unidades con resaltado amarillo y las decenas de color amarillo
	public static void separarUnidades(int numero) {
    		// Ponemos la primera linea en negrita
		System.out.printf(BOLD + "Numero: %d \n" + RESET, numero);
    
   		 // Fondo amarillo a las unidades y letras amarillas a las decenas
		System.out.printf(YELLOW_BACKGROUND + "Unidades: %d" + RESET + "                 " + YELLOW + "Decenas: %d" + RESET, numero % 10, (numero / 10) % 10);
	}
  
}
