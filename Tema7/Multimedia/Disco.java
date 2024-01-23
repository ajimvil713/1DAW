package Multimedia;

public class Disco extends Multimedia {
	
	// Variables adicionales al de la clase multimedia
	private String genero;
	
	// Constructor
	public Disco(String titulo, String autor, String formato, int duracion, String genero) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}
	
	// Getters y setters para las variables adicionales
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Metodo toString() que refleja la nueva informacion
	@Override
	public String toString() {
		return "Disco [genero = " + genero + ", titulo = " + titulo + ", autor = " + autor + ", formato = " + formato
				+ ", duracion = " + duracion + " segundos]";
	}	
	
}
