package Almacen;

public class Productos {
	
	// Variables de la clase productos
	private int identificador, cantidadLitros;
	private double precio;
	private String marca;
	
	// Constructor para la clase
	public Productos(int identificador, int cantidadLitros, double precio, String marca) {
		super();
		this.identificador = identificador;
		this.cantidadLitros = cantidadLitros;
		this.precio = precio;
		this.marca = marca;
	}
	
	// Metodos getters y setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(int cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Metodo toString
	@Override
	public String toString() {
		return "Productos [identificador=" + identificador + ", cantidadLitros=" + cantidadLitros + ", precio=" + precio
				+ ", marca=" + marca + "]";
	}
	
}
