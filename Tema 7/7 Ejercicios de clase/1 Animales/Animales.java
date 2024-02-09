package Animales;

public class Animales {
	
	protected String nombre;
	protected int velocidad;
	protected int edad;
	
	public Animales(String nombre, int velocidad, int edad) {
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", velocidad=" + velocidad + ", edad=" + edad + "]";
	}
	
	public int calcularMetros(int segundos) {
		return this.velocidad * segundos;
	}
	
}
