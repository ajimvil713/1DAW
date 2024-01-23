package Multimedia;

public class Pelicula extends Multimedia {
	
	// Variables adicionales al de la clase multimedia
	private String actorPrincipal;
	private String actrizPrincipal;
	
	// Constructor
	public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}
	
	// Metodos getters y setters para los atributos adicionales
	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		this.actrizPrincipal = actrizPrincipal;
	}
	
	// Metodo toString() para reflejar la nueva información
	@Override
	public String toString() {
		return "Pelicula [actorPrincipal = " + actorPrincipal + ", actrizPrincipal = " + actrizPrincipal + ", titulo = "
				+ titulo + ", autor = " + autor + ", formato = " + formato + ", duracion = " + duracion + " segundos]";
	}
	
}
