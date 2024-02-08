package Bucles;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero1 = 3;
		int numero2 = 4;
		int producto = 0; // Variable tipo acumulador
		
		// Hacemos la suma
		for (int i = 0; i < numero2; i++) {
			producto = producto + numero1;
		}
		
		// Imprimimos el resultado
		System.out.println(producto);
	}

}
