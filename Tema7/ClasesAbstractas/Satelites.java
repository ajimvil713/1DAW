package ClasesAbstractas;

public class Satelites extends Astros {
	
	// Atributos especificos de la clase
	private double distancia;
	private String orbita, planetaPertenece;
	
	// Constructor
	public Satelites(double radio, double rotacion, double masa, double temperatura, double gravedad, String nombre,
			double distancia, String orbita, String planetaPertenece) {
		super(radio, rotacion, masa, temperatura, gravedad, nombre);
		this.distancia = distancia;
		this.orbita = orbita;
		this.planetaPertenece = planetaPertenece;
	}
	
	// Getters y setters
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public String getOrbita() {
		return orbita;
	}

	public void setOrbita(String orbita) {
		this.orbita = orbita;
	}

	public String getPlanetaPertenece() {
		return planetaPertenece;
	}

	public void setPlanetaPertenece(String planetaPertenece) {
		this.planetaPertenece = planetaPertenece;
	}
	
	// Metodo para mostrar la información del objeto
	@Override
	public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println();
		System.out.println("Distancia al planeta: " + getDistancia());
		System.out.println("Orbita planetaria: " + getOrbita());
		System.out.println("Planeta al que pertenece: " + getPlanetaPertenece());
	}
	
}
