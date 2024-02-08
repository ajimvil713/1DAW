package Funciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println(salario(2.50, 10));
	}
	
	// Función para calcular el salario de un trabajador
	public static double salario(double montoVentas, int autosVendidos) {
		
		// Salario base:
		double salarioBase = 800.00;
		
		// Comisión por cada auto vendido
		double comisionAuto = 170.00;
		
		// Porcentaje de comisión
		double porcentajeComision = 0.05;
		
		// Cálculo de la comisión basada en el número de coches vendidos
		double comisionPorVentas = comisionAuto * autosVendidos;
		
		// Cálculo de la comisión basada en el 5% del monto Ventas
		double comisionPorMontoVentas = porcentajeComision * montoVentas;
		
		// Calculamos el salario total
		double salarioTotal = salarioBase + comisionPorVentas + comisionPorMontoVentas;
		
		// Devolvemos el salario total
		return salarioTotal;
	}

}
