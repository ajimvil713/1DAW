package Almacen;

public class Azucarda extends Productos {
	
	// Variables adicionales para la clase Azucarada
	private int porcentajeAzucar;
	private boolean promocion;
	
	// Generamos el constructor
	public Azucarda(int identificador, int cantidadLitros, double precio, String marca, int porcentajeAzucar,
			boolean promocion) {
		super(identificador, cantidadLitros, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}
	
	// Generamos los metodos Getters y setters
	public int getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(int porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	// Generamos el metodo toString
	@Override
	public String toString() {
		return "Azucarda [porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion + ", getIdentificador()="
				+ getIdentificador() + ", getCantidadLitros()=" + getCantidadLitros() + ", getPrecio()=" + getPrecio()
				+ ", getMarca()=" + getMarca() + "]";
	}
	
	// Funcion para calcular el precio si hay promocion
	public double descuento() {
		if (promocion) {
			return getPrecio() * 0.9;
		} else {
			return getPrecio();
		}
	}
	
}
