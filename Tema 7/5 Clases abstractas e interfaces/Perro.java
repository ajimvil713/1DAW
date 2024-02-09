package ClasesAbstractasEInterfaces;

public class Perro extends Mascota{
	
	private String raza;
	private boolean pulgas;
	
	// Constructor
	public Perro(String nombre, int edad, int fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, fechaNacimiento, "Perro");
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	// Metods getters y setters
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	
	// Metodos para imprimir la información en pantalla
	public void muestra() {
		System.out.println(super.toString());
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}
	
	public void habla() {
		System.out.println("Guau, guau");
	}
	
}
