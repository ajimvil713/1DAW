package ClasesAbstractas;

public class Planetas extends Astros {
	
	// Atributos expecificos de la clase
	private double distancia;
	private String orbita;
	private boolean satelites;
	
	// Constructor
	public Planetas(double radio, double rotacion, double masa, double temperatura, double gravedad, String nombre,
			double distancia, String orbita, boolean satelites) {
		super(radio, rotacion, masa, temperatura, gravedad, nombre);
		this.distancia = distancia;
		this.orbita = orbita;
		this.satelites = satelites;
	}
	
	// Metodos getters y setters
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

	public boolean isSatelites() {
		return satelites;
	}

	public void setSatelites(boolean satelites) {
		this.satelites = satelites;
	}
	
	// Metodo para mostrar la información del objeto
	@Override
	public void imprimirInformacion() {
		super.imprimirInformacion();
		System.out.println();
		System.out.println("Distancia al sol: " + getDistancia());
		System.out.println("Orbita al sol: " + getOrbita());
		System.out.println("Tiene satelites: " + isSatelites());
	}
	
}
