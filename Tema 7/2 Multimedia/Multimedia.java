package Multimedia;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Multimedia {
	
	// Declaracion de las variables de la clase
	protected String titulo;
	protected String autor;
	protected String formato;
	protected int duracion;
	
	// Generamos el constructor para crear el objeto
	public Multimedia(String titulo, String autor, String formato, int duracion) {
		comprobarFormato(formato);
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	// generamos los getters y setters para poder mostrar y modificar las variables
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		comprobarFormato(formato);
		this.formato = formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	// Generamos el toString(), para imprimir el valor de todas las variables
	@Override
	public String toString() {
		return "Multimedia [titulo = " + titulo + ", autor = " + autor + ", formato = " + formato + ", duracion = " + duracion
				+ " segundos]";
	}
	
	// Funcion que comprueba el formato
	private void comprobarFormato(String formato) {
		String[] formatosPermitidos = {"wav", "mp3", "midi", "avi", "mov", "mpg", "cdAudio", "dvd"};
		boolean encontrado = false;
		
		// Recorremos el array de formatos permitidos
		for (String formatoPermitido : formatosPermitidos) {
			// Si el formato introducido por el usuario esta en la lista
			if (formato.equalsIgnoreCase(formatoPermitido)) {
				encontrado = true;
			}
		}
		
		// Si el formato no estaba en la lista, lanzamos la excepcion
		if (!encontrado) {
			throw new InputMismatchException("Error, El formato no es correcto, los formatos permitidos son: " + Arrays.toString(formatosPermitidos));
		}
	}
	
}
