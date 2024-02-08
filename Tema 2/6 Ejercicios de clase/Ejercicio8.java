package EjerciciosClase;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		System.out.println(contar0(100));
		System.out.println(contar0(410250510));
	}
	
	public static int contar0(int numero) {
		if (numero < 10) {
			
			return 0;
			
		} else {
			
			if (numero %  10 == 0) {
				return 1 + contar0(numero / 10);
			} else {
				return contar0(numero / 10);
			}
			
		}
	}

}
