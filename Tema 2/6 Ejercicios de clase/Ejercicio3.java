package EjerciciosClase;

public class Ejercicio3 {

	public static void main(String[] args) {
		long numero = 36512,
			 numero2 = numero,
			 contador = 10;
		
		while (numero2 >= 10) {
			numero2 = numero2 / contador;
			contador = contador * 10;
		}
		
		for (long x = contador; x >= 1; x = x / 10) {
			System.out.print(numero / x + " ");
			numero = numero % x;
		}
	}

}
