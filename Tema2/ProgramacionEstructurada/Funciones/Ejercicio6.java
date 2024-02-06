package Funciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 1º parte
		int posicion = 7;
		long resultado = encontrarIndice(posicion);
		
		System.out.println(posicion + ": devuelve " + resultado);
		
		// 2º parte
		mostrarNumeros();
		
		// 3º parte
		encontrarNumero(20);
	}


	// Función para calcular de forma recursiva el número
	public static long encontrarIndice (int numero) {
		if (numero <= 1) {
			return numero;
		} else {
			return encontrarIndice(numero - 1) + encontrarIndice(numero - 2);
		}
	}
	
	// Función para mostrar los primeros 30 números
	public static void mostrarNumeros() {
		
		System.out.println("Los 30 primeors numeros de la serie Fibonacci son:");
		
		for (int i = 0; i < 30; i++) {
			System.out.println(encontrarIndice(i) + " ");
		}
		System.out.println();
		
	}
	
	// Función para calcular el primer elemento de la serie fibonacci
	public static void encontrarNumero(int limite) {
		
		System.out.println("El primer elemento de la serie Fibonnaci mayor o igual a " + limite + " es:");
		
		int i = 0;
		
		while (encontrarIndice(i) < limite) {
			i++;
		}
		
		System.out.println(encontrarIndice(i));
	}

}
