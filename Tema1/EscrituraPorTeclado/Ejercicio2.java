package EscrituraPorTeclado;

public class Ejercicio2 {
	
	/* Enunciado:
	 * 
	 * Utilizando las siguientes variables:
	 * int x = 10;
	 * int y = -10;
	 * float n = 13.269834f;
	 * String cad = “Ana”;
	 *
	 * Muestra en consola el siguiente resultado, exactamente igual,
	 * utilizando System.out.printf , sin utilizar espacios ni tabulación
	 * en la cadena de formato y utilizando solamente las variables indicadas
	 * anteriormente en los argumentos:
	 * 
	 * 10
	 * +10
	 * -10
	 * 13,27
	 *   +13,2698
	 *   13,26983
	 * +00013,270
	 * n=13,27   x=10
	 *       AnaAna  Ana
	 */

	public static void main(String[] args) {
		// Declaramos las variables del ejercicio
		int x = 10;
		int y = -10;
		float n = 13.269834f;
		String cad = "Ana";
		
		// Ejercicio
		System.out.printf("%d \n", x);
		System.out.printf("%+d \n", x);
		System.out.printf("%d \n", y);
		System.out.printf("%.2f \n", n);
		System.out.printf("%+20.4f \n", n);
		System.out.printf("%+20.5f \n", n);
		System.out.printf("%+09.3f \n", n);
		System.out.printf("n = %.2f \t x = %d \n", n, x);
		System.out.printf("\t %s%s \t %s", cad, cad, cad);
	}

}
