package Funciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		imprimeMenu();
		int opcion = sc.nextInt();
		
		String texto = leertexto();
		String resultado = "";
		
		switch (opcion) {
		case 1:
			resultado = coodificarMensaje(texto);
			break;
		case 2:
			resultado = descoodificarMensaje(texto);
			break;
		default:
			System.out.println("Opción no valida");
			break;
		}
		
		System.out.println(resultado);
	}
	
	// Función para leer el texto
	public static String leertexto() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el mensaje");
		String mensaje = sc.nextLine();
		
		return mensaje;
	}


	// Función para imprimir el menú
	public static void imprimeMenu() {
		
		System.out.println("Codificador y descodificador de mensajes");
		System.out.println();
		System.out.println("1) Codificar mensaje");
		System.out.println("2) Descodificar mensaje");
		System.out.println();
		System.out.print("Escoge una opción: ");
	}


	/*
	 *
	 * Funciones para codificar el mensaje
	 *
	 */


	// Función para convertir todas las letras en mayúscula
	public static String textoMayuscula(String cadena) {
		
		cadena = cadena.toUpperCase();
		
		return cadena;
	}


	// Función para reemplazar letras individuales
	public static char letraSiguiente(char letra) {
		
		if (letra >= 'A' && letra <= 'Z') {
			if (letra == 'Z') {
				return 'A';
			} else {
				return (char)(letra + 1);
			}
		} else {
			return letra;
		}
	}


	// Función para reemplazar un string (letras) usando la función anterior
	public static String reemplazarLetraSiguiente(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + letraSiguiente(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Función para reemplazar los números individuales por el siguiente
	public static char numeroSiguiente(char numero) {
		
		if (numero >= '0' && numero <= '9') {
			if (numero == '9') {
				return '0';
			} else {
				return (char) (numero + 1);
			}
		} else {
			return numero;
		}
	}


	// Función para reemplazar un string (números) usando la función anterior
	public static String reemplazarNumeroSiguiente(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + numeroSiguiente(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Función para reemplazar los espacios en blanco por ç
	public static char reemplazarEspacio(char espacio) {
		
		if (espacio == ' ') {
			return 'ç';
		} else {
			return espacio;
		}
	}


	// Función para reemplazar un string (espacios en blancos) usando la función anterior
	public static String reemplazarEspaciosBlanco(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + reemplazarEspacio(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Algoritmo que codifica el mensaje
	public static String coodificarMensaje(String mensaje) {
		
		String texto2 = "";
		
		texto2 = textoMayuscula(mensaje);
		texto2 = reemplazarLetraSiguiente(texto2);
		texto2 = reemplazarNumeroSiguiente(texto2);
		texto2 = reemplazarEspaciosBlanco(texto2);
		
		return texto2;
	}


	/*
	 *
	 * Funciones para descodificar el mensaje
	 *
	 */


	// Función para convertir las letras en minúscula
	public static String textoMinuscula(String cadena) {
		
		cadena = cadena.toLowerCase();
		
		return cadena;
	}


	// Función para reemplazar letras individuales
	public static char letraAnterior(char letra) {
		
		if (letra >= 'a' && letra <= 'z') {
			if (letra == 'a') {
				return 'z';
			} else {
				return (char)(letra - 1);
			}
		} else {
			return letra;
		}
	}


	// Función para reemplazar un string (letras) usando la función anterior
	public static String reemplazarLetraAnterior(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + letraAnterior(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Función para reemplazar los números individuales por el anterior
	public static char numeroAnterior(char numero) {
		
		if (numero >= '0' && numero <= '9') {
			if (numero == '0') {
				return '9';
			} else {
				return (char) (numero - 1);
			}
		} else {
			return numero;
		}
	}


	// Función para reemplazar un string (numeros) usando la función anterior
	public static String reemplazarNumeroAnterior(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + numeroAnterior(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Función para reemplazar los ç por espacios en blanco
	public static char ponerEspacio(char espacio) {
		
		if (espacio == 'ç') {
			return ' ';
		} else {
			return espacio;
		}
	}


	// Función para reemplazar un string (espacios en blancos) usando la función anterior
	public static String ponerEspacioBlanco(String cadena) {
		
		String nuevaCadena = "";
		
		for (int i = 0; i < cadena.length(); i++) {
			nuevaCadena = nuevaCadena + ponerEspacio(cadena.charAt(i));
		}
		
		return nuevaCadena;
	}


	// Algoritmo que codifica el mensaje
	public static String descoodificarMensaje(String mensaje) {
		
		String texto2 = "";
		
		texto2 = textoMinuscula(mensaje);
		texto2 = reemplazarLetraAnterior(texto2);
		texto2 = reemplazarNumeroAnterior(texto2);
		texto2 = ponerEspacioBlanco(texto2);
		
		return texto2;
	}

}
