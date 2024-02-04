package Animales;

public class Gato extends Mascota {
	
	private String color;
	private boolean peloLargo;
	
	// Constructor
	public Gato(String nombre, int edad, int fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, fechaNacimiento, "Gato");
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	// Metodos getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	// Metodos para imprimir la información en pantalla
	public void muestra() {
		System.out.println(super.toString());
	}

	@Override
	public String toString() {
		return super.toString() + ", Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}
	
	public void habla() {
		System.out.println("Miau");
	}
	
}
