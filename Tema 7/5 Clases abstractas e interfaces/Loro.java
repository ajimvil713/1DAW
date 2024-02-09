package ClasesAbstractasEInterfaces;

public class Loro extends Aves {
	
	private String origen;
	private String saluda = "hola";
	
	// Constructor
	public Loro(String nombre, int edad, int fechaNacimiento, String origen, String saluda) {
		super(nombre, edad, fechaNacimiento, "Pico curvo", true);
		this.origen = origen;
		this.saluda = saluda;
	}
	
	// Metodos getters y setters
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getSaluda() {
		return saluda;
	}

	public void setSaluda(String saluda) {
		this.saluda = saluda;
	}
	
	// Metodos para imprimir información por pantalla
	@Override
	public String toString() {
		return super.toString() + ", Loro [origen=" + origen + ", saluda=" + saluda + "]";
	}
	
	public void habla() {
		System.out.println(saluda);
	}
	
	public void muestra() {
		System.out.println(super.toString());
	}
	
}
