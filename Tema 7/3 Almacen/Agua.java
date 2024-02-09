package Almacen;

public class Agua extends Productos {
	
	// Variables edicionales para el agua
	private String origen;
	
	// Generamos el contructor
	public Agua(int identificador, int cantidadLitros, double precio, String marca, String origen) {
		super(identificador, cantidadLitros, precio, marca);
		this.origen = origen;
	}
	
	// Generamos metodos getters y setters
	public String getOrigen() {
		return origen;
	}
	
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	// Generamos el metodo toString
	@Override
	public String toString() {
		return "Agua [origen=" + origen + ", getIdentificador()=" + getIdentificador() + ", getCantidadLitros()="
				+ getCantidadLitros() + ", getPrecio()=" + getPrecio() + ", getMarca()=" + getMarca() + "]";
	}
	
}
