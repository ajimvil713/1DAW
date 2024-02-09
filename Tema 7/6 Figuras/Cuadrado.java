package Figuras;

public class Cuadrado implements iFigura2D {
	
	private double lado;
	
	// Constructor
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	// Metodos getters y setters
	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	// Metodos de la interface
	@Override
	public double perimetro() {
		return 4 * lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public void escalar(double escala) {
		if (escala > 0) {
			lado = lado * escala;
		}
	}

	@Override
	public void imprimir() {
		System.out.println("--- Cuadrado ---");
		System.out.println("Lado: " + lado);
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
	}
	
}
