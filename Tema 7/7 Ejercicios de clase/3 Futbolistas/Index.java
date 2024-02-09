package Futbolistas;

import java.util.Arrays;

public class Index {

	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[5];
		
		futbolistas[0] = new Futbolista(23, 5, "453216A", "pepe");
		futbolistas[1] = new Futbolista(33, 3, "6432782V", "mesi");
		futbolistas[2] = new Futbolista(27, 115, "4311253T", "juanito");
		futbolistas[3] = new Futbolista(23, 5, "2347742F", "raul");
		futbolistas[4] = new Futbolista(23, 5, "0003421M", "adan");
		
		System.out.println("Lista sin ordenar:");
		imprimirLista(futbolistas);
		
		System.out.println("\nLista ordenada por dni:");
		Arrays.sort(futbolistas);
		imprimirLista(futbolistas);
		
		System.out.println("\nLista ordenada por edad:");
		ComparaEdad c1 = new ComparaEdad();
		Arrays.sort(futbolistas, c1);
		imprimirLista(futbolistas);
		
		System.out.println("\nLista ordenada por nombre:");
		comparaNombre c2 = new comparaNombre();
		Arrays.sort(futbolistas, c2);
		imprimirLista(futbolistas);
	}
	
	// Metodo que ordena un array
	public static void imprimirLista(Futbolista[] futbolistas) {
		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}
	}

}
