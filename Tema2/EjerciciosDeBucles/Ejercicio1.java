package EjerciciosDeBucles;

import java.util.Scanner;

public class Ejercicio1 {
	
	/* Enunciado:
	 * 
	 * Tenemos la pantalla del móvil bloqueada. Partiendo de un PIN_SECRETO, intentaremos desbloquear la pantalla. Tenemos hasta 5 intentos.  En caso de acceder, lanza al usuario 'login correcto'. Sino, 'llamando al policía'.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int pinCorrecto = 12345;
		int pinIntroducido;
		int intentos = 5;
		
		boolean acertado = false;
		
		// Repetimos hasta que la variable contador intentos sea 0
		while (intentos > 0) {
			// Pedimos el pin y lo guardamos
			System.out.print("Introduce el pin: ");
			pinIntroducido = sc.nextInt();
			
			// Reducimos los intentos
			intentos--;
			
			// Si el pin es correcto
			if (pinIntroducido == pinCorrecto) {
				System.out.println("Login correcto");
				acertado = true;
				break;
			// Si no ha acertado el pin
			} else {
				System.out.println("Pin incorrecto, te quedan " + intentos + " intentos");
			}
		}
		
		// Si no ha acertado el pin en 5 intentos
		if (!acertado) {
			System.out.println("Llamando a la policía");
		}
	}

}
