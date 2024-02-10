package DiaDeLaSemana;

import java.util.Arrays;

public class Index {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.JUEVES;
		
		System.out.println(dia.getNumero());
		System.out.println(dia);
		
		DiaSemana[] semana = DiaSemana.values();
		System.out.println(Arrays.toString(semana));
		
		System.out.println(semana[1].getDia());
	}

}
