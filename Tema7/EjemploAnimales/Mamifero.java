package Animales;

public class Mamifero extends Animales {
	
	private String tipo;

	public Mamifero(String nombre, int velocidad, int edad, String tipo) {
		super(nombre, velocidad, edad);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Mamifero [tipo=" + tipo + ", nombre=" + nombre + ", velocidad=" + velocidad + ", edad=" + edad
				+ ", getTipo()=" + getTipo() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
