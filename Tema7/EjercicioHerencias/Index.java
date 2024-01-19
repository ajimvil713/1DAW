package EjercicioHerencias;

public class Index {

	public static void main(String[] args) {
		Perecedero [] perecedero = new Perecedero[5];
		NoPerecedero [] noPerecedero = new NoPerecedero[5];
		
		Perecedero p1 = new Perecedero("Yogur", 1.5, 2);
		perecedero[0] = p1;
		
		p1 = new Perecedero("Leche", 1.2, 3);
		perecedero[1] = p1;
		
		p1 = new Perecedero("Tomates", 3.2, 6);
		perecedero[2] = p1;
		
		p1 = new Perecedero("Galletas", 5.2, 1);
		perecedero[3] = p1;
		
		p1 = new Perecedero("Pollo", 6.2, 2);
		perecedero[4] = p1;
		
		NoPerecedero p2 = new NoPerecedero("Aceite", 20.00, "gourmet");
		noPerecedero[0] = p2;
		
		// ...
		
		double total = 0.0;
		for (int x = 0; x < 5; x++) {
			total = total + perecedero[x].calcularPrecio(5);
		}
	}

}
