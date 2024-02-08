package Funciones;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numeroDecimal = 10000;
		String resultadoBinario = mostrarBinario(numeroDecimal);
		
		System.out.println(resultadoBinario);
	}
	
	// Función que convierte un número decimal a binario
	public static String mostrarBinario(int decimal) {
		String binario = "";
		
		if (decimal >= 0 && decimal <= 255) {
			
			while (decimal > 0) {
				binario = (decimal % 2) + binario;
				decimal = decimal / 2;
			}
			
			return binario;
			
		}
		
		return "El número tiene que ser entre 0 y 255";
	}

}
