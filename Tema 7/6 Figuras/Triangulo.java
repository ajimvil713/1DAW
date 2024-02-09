package Figuras;

public class Triangulo implements iFigura2D {
	
	private double lado, altura;
	
	// Constructor
	public Triangulo(double lado, double altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}
	
	// Getters y setters
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
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
		return lado * 3;
	}

	@Override
	public double area() {
		return lado * altura / 2;
	}

	@Override
	public void escalar(double escala) {
		if (escala > 0) {
			lado = lado * escala;
			altura = altura * escala;
		}
	}

	@Override
	public void imprimir() {
		System.out.println("--- Triangulo (Equilatero) ---");
		System.out.println("lado: " + lado);	
		System.out.println("Altura: " + altura);
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
	}
	
}
