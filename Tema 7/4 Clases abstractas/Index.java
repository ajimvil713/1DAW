package ClasesAbstractas;

import java.util.Scanner;

public class Index {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		Astros[] astros = new Astros[10];
		int opcion;
		String tipo, astro;
		
		// Llenamos el array con valores por defecto
		astros = generarArray(astros);
		
		// Menú
		do {
			imprimirMenu();
			opcion = pedirInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Introduce el tipo de astro (Planeta o Satelite): ");
				tipo = pedirString();
				
				System.out.print("Introduce el nombre del astro: ");
				astro = pedirString();
				
				if (tipo.equals("Planeta")) {
					imprimirInformaionPlaneta(astros, astro);
				} else if (tipo.equals("Satelite")) {
					imprimirInformacionSatelite(astros, astro);
				} else {
					System.out.println("No tengo información del tipo de astro introducido.");
				}
				break;
			case 2:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Error, la opción " + opcion + " no esta disponible.");
				break;
			}
		} while (opcion != 2);
		
		System.out.println("Programa finalizado con exito!");
	}
	
	// Funcion que añade valores por defecto a un array de Astros
	public static Astros[] generarArray(Astros[] array) {
		array[0] = new Planetas(2439.7, 58.65, 3.30, 167, 3.7, "Mercurio", 0.39, "Eliptica", false);
		array[1] = new Planetas(6051.8, 243, 4.87, 462, 8.87, "Venus", 0.72, "Eliptica", false);
		array[2] = new Planetas(6371, 24, 5.97, 14, 9.81, "Tierra", 1, "Eliptica", true);
		
		array[3] = new Satelites(1737.1, 24, 7.35, 120, 1.625, "Luna", 384400, "Alrededor de la Tierra", "Tierra");
		array[4] = new Satelites(11.1, 0, 1.08, 0, 0.0057, "Phobos", 9378, "Alrededor de Marte", "Marte");
		array[5] = new Satelites(5268, 0, 1.48, -163, 01.428, "Ganimedes", 1070000, "Alrededor de Jupiter", "Jupiter");
		
		return array;
	}
	
	// Función para imprimir los datos para el menú
	public static void imprimirMenu() {
		System.out.println("--- Menú ---");
		System.out.println("1) Ver información de un astro");
		System.out.println("2) Salir");
		System.out.println();
		System.out.print("Introduce una opción: ");
	}
	
	// Funcion que imprime toda la información de un planeta
	public static void imprimirInformaionPlaneta(Astros[] astros, String nombre) {
		// Nos recorremos el array
		for (Astros astro : astros) {
			// Verificacion, si la posicion no esta vacia y esta instanciado en planetas
			if (astro != null && astro instanceof Planetas) {
				// Realizamos el casting
				Planetas planeta = (Planetas) astro;
				// Comprobamos si el nombre introducido y el del planeta coinciden
				if (planeta.getNombre().equals(nombre)) {
					// Mostramos su información
					planeta.imprimirInformacion();
					// Con esta funcion comprobaremos e imprimiremos si el planeta tuviera lunas registradas
					imprimirInformacionLunas(astros, planeta.getNombre(), planeta.isSatelites());
					// Como ya lo hemos encontrado, no hece falta seguir buscando
					return;
				}
			}
		}
		// En el caso de que no se haya encontrado nada
		System.out.println("No tengo informacion registrada de ese planeta.");
	}
	
	// Funcion que imprime toda la información de las lunas de un planeta
	public static void imprimirInformacionLunas(Astros[] astros, String nombreAstro, boolean lunas) {
		// Comprobamos si tiene satelites
		if (lunas) {
			// Nos recorremos el array
			for (Astros astro : astros) {
				// Verificamos si la posicion no esta vacia y si esta instanciada a satelites
				if (astro != null && astro instanceof Satelites) {
					// Realizamos el casting
					Satelites satelite = (Satelites) astro;
					// Comprobamos si el nombre del satelite coincide con el del planeta
					if (satelite.getPlanetaPertenece().equals(nombreAstro)) {
						// Imprimimos su información
						satelite.imprimirInformacion();
					}
				}
			}
		}
		// Si no tiene mostramos la informacion
		System.out.println("Este planeta no tiene lunas registradas.");
	}
	
	// Funcion que imprime toda la información de un satelite
	public static void imprimirInformacionSatelite(Astros[] astros, String nombre) {
		// Nos recorremos el array
		for (Astros astro : astros) {
			// Verificacion, si la posicion no esta vacia y si esta instanciado en satelite
			if (astro != null && astro instanceof Satelites) {
				// Realizamos el casting
				Satelites satelite = (Satelites) astro;
				// Comprobamos si el nombre introducido y el del satelite coinciden
				if (satelite.getNombre().equals(nombre)) {
					// Mostramos la información
					satelite.imprimirInformacion();
					// Como ya lo hemos encoontrado, no hace falta seguir buscando
					return;
				}
			}
		}
		// En el caso de que no se haya encontrado nada
		System.out.println("No tengo información registrada de ese satelite.");
	}
	
	/*
	 * Funciones del Scanner
	 */
	
	// Funcion para pdeir un numero entero de tipo int
	public static int pedirInt() {
		return sc.nextInt();
	}
	
	// Funcion para pdeir una cadena de String
	public static String pedirString() {
		return sc.next();
	}
}
