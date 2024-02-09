package CompareTo;

import java.util.Arrays;

public class Index {

	public static void main(String[] args) {
		// Creamos 3 personas
		Persona p1 = new Persona("Manolo", "Rico", 20, 5);
		Persona p2 = new Persona("Rocio", "Ramirez", 20, 9);
		Persona p3 = new Persona("David", "Perez", 30, 7);
		
		// Mostramos el orden
		System.out.println(p1.compareTo(p2));
		/* Si el resultado < 0 -> p1 va primero
		 * Si el resultado = 0 -> Son inguales
		 * Si el resultado > 0 -> p2 va primero
		 */
		
		// Creamos un array de personas e introducimos a los 3 que hemos creado antes
		Persona[] personas = {p1, p2, p3};
		
		// Mostramos el array SIN ordenar
		System.out.println("\nPersonas sin ordenar");
		imprimirArray(personas);
		
		// Ordenamos nuestro array
		Arrays.sort(personas);
		
		// Mostramos denuevo el array pero esta vez ordenado
		System.out.println("\nPersonas ordenadas por edad y sin iguales, por antiguedad");
		imprimirArray(personas);
	}
	
	// Funcion para imprimir un array de personas
	public static void imprimirArray(Persona[] array) {
		for (Persona persona : array) {
			System.out.println(persona.toString());
		}
	}

}
