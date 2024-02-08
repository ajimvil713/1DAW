package EscrituraPorTeclado;

public class Ejercicio2 {

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
