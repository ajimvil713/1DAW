package Figuras;

public class Rectangulo implements iFigura2D {
	
	private double base, altura;
	
	// Constructor
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	// Getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Metodos de la interface
	@Override
	public double perimetro() {
		return base * 2 + altura * 2;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public void escalar(double escala) {
		if (escala > 0) {
			base = base * escala;
			altura = altura * escala;
		}
	}

	@Override
	public void imprimir() {
		System.out.println("--- Rectangulo ---");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
	}
	
}
