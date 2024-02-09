package Figuras;

public class Circulo implements iFigura2D {
	
	private double radio;
	private final double pi = 3.14;
	
	// Constructor
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	// Getters y setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	// Metodos de la interface
	@Override
	public double perimetro() {
		return 2 * pi * radio;
	}

	@Override
	public double area() {
		return pi * radio * radio;
	}

	@Override
	public void escalar(double escala) {
		if (escala > 0) {
			radio = radio * escala;
		}
	}

	@Override
	public void imprimir() {
		System.out.println("--- Circulo ---");
		System.out.println("Radio: " + radio);
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
	}
	
}
