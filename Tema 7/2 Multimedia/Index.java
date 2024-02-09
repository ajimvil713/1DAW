package Multimedia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		// 1º Creamos el objeto ListaMultimedia
		Multimedia[] listaMultimedia = new Multimedia[20];
		
		// 2º Creamos 3 discos y los añadimos al array
		listaMultimedia[0] = new Disco("Midnights", "Taylor Swift", "wav", 2648, "Pop");
		listaMultimedia[1] = new Disco("Future Nostalgia", "Dua Lipa", "mp3", 2220, "Dance-pop");
		listaMultimedia[2] = new Disco("THE ALBUM", "BLACKPINK", "avi", 1440, "K-pop");
		
		// 3º Mostramos el array por pantalla
		System.out.println("Lista multimedia:");
		verMultimedia(listaMultimedia);
		
		// 4º Creamos un nuevo objeto con valores no significaativos
		Disco disco = new Disco(listaMultimedia[2].titulo, listaMultimedia[2].autor, "cdAudio", 0, "");
		
		// 5º Creamos el menú, el bucle y las opciones
		int opcion;
		
		do {
			imprimirMenu();
			opcion = pedirNumero();
			
			switch (opcion) {
			case 1:
				try {
					listaMultimedia = insertarPelicula(listaMultimedia);
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					listaMultimedia = insertarDisco(listaMultimedia);
				} catch (InputMismatchException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				verPeliculas(listaMultimedia);
				break;
			case 4:
				verDiscos(listaMultimedia);
				break;
			case 5:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error, la opcion " + opcion + " no esta disponible.");
				break;
			}
		} while (opcion != 5);
	}
	
	// Funcion que devuelve todo el array multimedia
	public static void verMultimedia(Multimedia[] array) {
		for (Multimedia multimedia : array) {
			// De esta manera evitamos imprimir los elementos vacios del array
			if (multimedia == null) {
				break;
			}
			System.out.println(multimedia);
		}
		System.out.println();
	}
	
	// Funcion para imprimir información por pantalla
	public static void imprimirMenu() {
		System.out.println("1) Introducir pelicula");
		System.out.println("2) Introducir disco");
		System.out.println("3) Ver peliculas");
		System.out.println("4) Ver discos");
		System.out.println("5) Salir");
		System.out.println();
		System.out.print("Introduce una opción: ");
	}
	
	// Funcion para pedir un valor numerico (añadir excepcion)
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}
	
	// Funcion para pedir un valor booleano (añadir excepcion)
	public static boolean pedirBoleano() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextBoolean();
	}
	
	// Funcion para pedir una cadena (añadir excepcion)
	public static String pedirCadena() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	// Funcion para introducir una pelicula en el array
	public static Multimedia[] insertarPelicula(Multimedia[] array) {
		boolean correcto = false;
		String titulo;
		String autor;
		String formato;
		int duracion;
		String actor;
		String actriz;
		
		do {
			// Pedimos los datos al usuario y los alamcenamos
			System.out.print("Titulo: ");
			titulo = pedirCadena();
			System.out.print("Autor: ");
			autor = pedirCadena();
			System.out.print("Formato: ");
			formato = pedirCadena();
			System.out.print("Duración (en segundos): ");
			duracion = pedirNumero();
			System.out.print("Actor principal: ");
			actor = pedirCadena();
			System.out.println("Actriz principal: ");
			actriz = pedirCadena();
			System.out.println();
			
			// Mostramos la información y pedimos confirmación
			System.out.println("Titulo: " + titulo);
			System.out.println("Autor: " + autor);
			System.out.println("Formato: " + formato);
			System.out.println("Duración: " + duracion + " segundos");
			System.out.println("Actor principal: " + actor);
			System.out.println("Actriz principal: " + actriz);
			System.out.println();
			System.out.print("Esta información es correcta (true o  false): ");
			correcto = pedirBoleano();
		} while (!correcto);
		
		// Almacenamos la pelicucla en el array (controlar que el array no este completo)
		int posicion = 0;
		
		while (array[posicion] != null ) {
			posicion++;
		}
		
		array[posicion] = new Pelicula(titulo, autor, formato, duracion, actor, actriz);
		
		return array;
	}
	
	// Funcion para introducir un disco en el array
	public static Multimedia[] insertarDisco(Multimedia[] array) {
		boolean correcto = false;
		String titulo;
		String autor;
		String formato;
		int duracion;
		String genero;
		
		do {
			// Pedimos los datos al usuario y los alamcenamos
			System.out.print("Titulo: ");
			titulo = pedirCadena();
			System.out.print("Autor: ");
			autor = pedirCadena();
			System.out.print("Formato: ");
			formato = pedirCadena();
			System.out.print("Duración (en segundos): ");
			duracion = pedirNumero();
			System.out.print("Genero: ");
			genero = pedirCadena();
			System.out.println();
			
			// Mostramos la información y pedimos confirmación
			System.out.println("Titulo: " + titulo);
			System.out.println("Autor: " + autor);
			System.out.println("Formato: " + formato);
			System.out.println("Duración: " + duracion + " segundos");
			System.out.println("Genero: " + genero);
			System.out.println();
			System.out.print("Esta información es correcta (true o false): ");
			correcto = pedirBoleano();
		} while (!correcto);
		
		// Almacenamos los discos en el array (controlar que el array no este completo)
		int posicion = 0;
		
		while (array[posicion] != null) {
			posicion++;
		}
		
		array[posicion] = new Disco(titulo, autor, formato, duracion, genero);
		
		return array;
	}

	// Funcion que devuelve todas las peliculas
	public static void verPeliculas(Multimedia[] array) {
		for (Multimedia multimedia : array) {
			if (multimedia instanceof Pelicula) {
				System.out.println(((Pelicula) multimedia).toString());
			}
		}
		System.out.println();
	}
	
	// Funcion que devuelve todos los discos
	public static void verDiscos(Multimedia[] array) {
		for (Multimedia multimedia : array) {
			if (multimedia instanceof Disco) {
				System.out.println(((Disco) multimedia).toString());
			}
		}
		System.out.println();
	}
	
}
