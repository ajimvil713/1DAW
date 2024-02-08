package EjerciciosClase;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		System.out.println(cifra(500));
	}
	
	public static int cifra(int numero) {
		if (numero < 10) {
			return 1;
		} else {
			return 1 + cifra(numero / 10);
		}
	}


}
