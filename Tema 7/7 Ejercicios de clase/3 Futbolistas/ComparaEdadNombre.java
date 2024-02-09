package Futbolistas;

import java.util.Comparator;

public class ComparaEdadNombre implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Futbolista f1, f2;
		
		f1 = (Futbolista) o1;
		f2 = (Futbolista) o2;
		
		if (f1.getEdad() == f2.getEdad()) {
			return f1.getNombre().compareTo(f2.getNombre());
		} else {
			return f1.getEdad() - f2.getEdad();
		}
	}
	
}
