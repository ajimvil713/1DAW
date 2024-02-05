package ProgramacionEstructurada;

import java.util.Random;

public class Ejercicio10 {

	public static void main(String[] args) {
		Random random = new Random();
		String resultado = "";
		
		// carta aleatoria
		int carta = random.nextInt(13 - 1 + 1) + 1;
		
		switch (carta) {
		case 1:
			resultado = "As de ";
			break;
		case 2, 3, 4, 5, 6, 7, 8, 9, 10:
			resultado = String.valueOf(carta) + " de ";
			break;
		case 11:
			resultado = "Jota de ";
			break;
		case 12:
			resultado = "Reina de ";
			break;
		case 13:
			resultado = "Rey de ";
			break;
		default:
			System.out.println("El numero de carta generado no es correcto");
			break;
		}
		
		// Palo aleatorio
		int palo = random.nextInt(4 - 1 + 1) + 1;
		
		switch (palo) {
		case 1:
			resultado = resultado + "♥";
			break;
		case 2:
			resultado = resultado + "♦";
			break;
		case 3:
			resultado = resultado + "♣";
			break;
		case 4:
			resultado = resultado + "♣";
			break;
		default:
			System.out.println("El numero de palo generado no es correcto");
			break;
		}
		
		// Imprimimos el resultado final
		System.out.println(resultado);
	}

}
