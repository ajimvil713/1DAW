package Animales;

public class Canario extends Aves {
	
	private String color;
	private String canta;
	
	// Constructor
	public Canario(String nombre, int edad, int fechaNacimiento, String color, String canta) {
		super(nombre, edad, fechaNacimiento, "Pico corto", true);
		this.color = color;
		this.canta = canta;
	}
	
	// Metodos getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCanta() {
		return canta;
	}

	public void setCanta(String canta) {
		this.canta = canta;
	}

	// Metodos para iprimir la información en pantalla
	@Override
	public String toString() {
		return super.toString() + ", Canario [color=" + color + ", canta=" + canta + "]";
	}
	
	public void muestra() {
		System.out.println(super.toString());
	}
	
	public void habla() {
		System.out.println(canta);
	}
	
}
