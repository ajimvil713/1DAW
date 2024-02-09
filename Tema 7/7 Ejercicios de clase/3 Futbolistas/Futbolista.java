package Futbolistas;

public class Futbolista implements Comparable {
	
	private int edad, numGoles;
	private String dni, nombre;
	
	public Futbolista(int edad, int numGoles, String dni, String nombre) {
		super();
		this.edad = edad;
		this.numGoles = numGoles;
		this.dni = dni;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Futbolista [edad=" + edad + ", numGoles=" + numGoles + ", dni=" + dni + ", nombre=" + nombre + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Futbolista f = (Futbolista) o;
		return this.dni.compareTo(f.getDni());
	}
	
}
