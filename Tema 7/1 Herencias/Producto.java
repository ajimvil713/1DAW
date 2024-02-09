package Herencias;

public class Producto {
	
	protected String nombre;
	protected double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public double calcularPrecio(int cantidad) {
		return this.precio * cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre = " + nombre + ", precio = " + precio + "]";
	}
	
}
