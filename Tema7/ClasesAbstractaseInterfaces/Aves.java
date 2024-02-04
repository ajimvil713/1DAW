package Animales;

public abstract class Aves extends Mascota {
	
	protected String pico;
	protected boolean vuela;
	
	// Constructor
	public Aves(String nombre, int edad, int fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, fechaNacimiento, "Ave");
		this.pico = pico;
		this.vuela = vuela;
	}
	
	// Metodos Getters y Setters
	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	// Metodos para imprimir la informacion en pantalla
	public void muestra() {
		System.out.println(super.toString());
	}
	
	public void volar() {
		if (vuela) {
			System.out.println("Vuela");
		} else {
			System.out.println("No vuela");
		}
	}
	
}
