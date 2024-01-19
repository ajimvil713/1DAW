package EjemploAnimales;

public class Aves extends Animales{
	
	boolean volador;

	public Aves(String nombre, int velocidad, int edad, boolean volador) {
		super(nombre, velocidad, edad);
		this.volador = volador;
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	@Override
	public String toString() {
		return "Aves [volador=" + volador + ", nombre=" + nombre + ", velocidad=" + velocidad + ", edad=" + edad
				+ ", isVolador()=" + isVolador() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
