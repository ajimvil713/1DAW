package EjerciciosDeBucles;

public class Ejercicio2 {
	
	/* Enunciado:
	 * 
	 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
	 */

	public static void main(String[] args) {
		int numero = 0;
		
		do {
			System.out.println(numero);
			numero = numero + 5;
		} while (numero <= 100);
	}

}
