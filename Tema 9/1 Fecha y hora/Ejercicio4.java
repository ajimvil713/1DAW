package FechaYHora;

public class Ejercicio4 {

	public static void main(String[] args) {
		int año = 2024;
		
		if (esBisiesto(año)) {
			System.out.println(año + " es un año bisiesto.");
		} else {
			System.out.println(año + " no es un año bisiesto");
		}
	}
	
	public static boolean esBisiesto(int año) {
		if (año % 4 != 0) {
			return false;
		} else if (año % 100 != 0) {
			return true;
		} else if (año % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
	
}
