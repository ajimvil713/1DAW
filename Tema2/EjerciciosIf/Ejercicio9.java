package EjerciciosIf;

import java.util.Scanner;

public class Ejercicio1 {
	
	/* Enunciado:
	 * 
	 * La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
	 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. 
	 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Pedimos los datos al usuario y los almacenamos
		System.out.print("Introduce el tipo (A o B): ");
		String tipo = sc.next();
		
		System.out.print("Introduce el tamaño (1 o 2): ");
		int tamano = sc.nextInt();
		
		// Comprobación
		if (tipo.charAt(0) == 'A' && tamano == 1) {
			System.out.println("Se han cargado 20 céntimos");
		} else if (tipo.charAt(0) == 'A' && tamano == 2) {
			System.out.println("Se han cargado 30 centimos");
		} else if (tipo.charAt(0) == 'B' && tamano == 1) {
			System.out.println("Rebaja de 30 centimos");
		} else if (tipo.charAt(0) == 'B' && tamano == 2) {
			System.out.println("Rebaja de 50 céntimos");
		} else {
			System.out.println("Los valores introducidos no son correctos");
		}
	}

}
