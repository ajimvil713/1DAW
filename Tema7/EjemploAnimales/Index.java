package EjemploAnimales;

public class Index {

	public static void main(String[] args) {
		
		Animales animales[] = new Animales[5];
		
		animales[0] = new Aves("Gorrion", 30, 2, true);
		animales[1] = new Aves("Gallina", 10, 2, false);
		animales[2] = new Mamifero("Gato", 50, 14, "Terrestre");
		animales[3] = new Mamifero("Ballena", 10, 30, "Acuatico");
		animales[4] = new Mamifero("Delfin", 80, 14, "Acuatico");
		
		Mamifero m;
		
		for (Animales animal : animales) {
			if (animal instanceof Mamifero) {
				m = (Mamifero) animal;
				
				if (m.getTipo() == "Acuatico") {
					System.out.println(m);
				}
			}
		}
		
	}

}
