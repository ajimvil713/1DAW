package EjerciciosClase;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		System.out.println(esBinario(100));
		System.out.println(esBinario(253));
		
		System.out.println(esBinario("1010100"));
		System.out.println(esBinario("4454"));
	}
	
	public static boolean esBinario(int numero) {
		if (numero == 0 || numero == 1) {
				return true;
			} else if (numero % 10 > 1){
				return false;
			} else {
				return esBinario(numero / 10);
			}
		}

	public static boolean esBinario(String cadena) {
		if (cadena.length() == 0) {
			return false;
		}
		
		char primerCaracter = cadena.charAt(0);
		
		if (primerCaracter == '0' || primerCaracter == '1') {
			
			if (cadena.length() == 1) {
				return true;
			} else {
				return esBinario(cadena.substring(1));
			}
			
		} else {
			return false;
		}
	}

}
