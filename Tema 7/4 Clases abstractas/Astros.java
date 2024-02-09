package ClasesAbstractas;

public abstract class Astros {
	
	// Atributos de la calse
	private double radio, rotacion, masa, temperatura, gravedad;
	private String nombre;
	
	// Constructor
	public Astros(double radio, double rotacion, double masa, double temperatura, double gravedad, String nombre) {
		super();
		this.radio = radio;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
		this.nombre = nombre;
	}
	
	// Metododos para recuperar y almacenar atributos
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRotacion() {
		return rotacion;
	}

	public void setRotacion(double rotacion) {
		this.rotacion = rotacion;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodo para mostrar mostrar la información del objeto
	public void imprimirInformacion() {
		System.out.println("--- Información del astro ---");
		System.out.println("Nombre: " + nombre);
		System.out.println("Radio ecuatorial: " + getRadio());
		System.out.println("Rotacion sobre su eje: " + getRotacion());
		System.out.println("Masa: " + getMasa());
		System.out.println("Temperatura media: " + getTemperatura());
		System.out.println("Gravedad: " + getGravedad());
	}
	
}
