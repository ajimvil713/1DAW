package Animales;

public abstract class Mascota {
	
	protected String nombre;
	protected int edad;
	protected String estado;
	protected int fechaNacimiento;
	protected String tipo;
	
	// Constructor
	public Mascota(String nombre, int edad, int fechaNacimiento, String tipo) {
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = "Vivo";
		this.tipo = tipo;
	}
	
	// Metodos abstractos
	protected abstract void muestra();
	protected abstract void habla();
	
	// Metodos Getters y setters
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// toString
	@Override
	public String toString() {
		return tipo + ": " + nombre;
	}
	
}
