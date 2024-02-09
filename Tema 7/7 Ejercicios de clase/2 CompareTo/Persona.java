package CompareTo;

public class Persona implements Comparable {
	
	private String nombre, apellidos;
	private int edad, antiguedad;
	
	// Constructor
	public Persona(String nombre, String apellidos, int edad, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.antiguedad = antiguedad;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", antiguedad="
				+ antiguedad + "]";
	}
	
	// Metodos de la interface Comparable
	@Override
	public int compareTo(Object o) {
		// Realizamos el casting, ya que trabajamos con la clase Object
		Persona p = (Persona) o;
		
		// Ordenamos por el criterio de ordenacion que queramos
		// En este caso si las edades son iguales por antiguedad y si no edad
		if (p.edad == this.edad) {
			return p.antiguedad - this.antiguedad;
		} else {
			return p.edad - this.edad;
		}
	}
	
}
