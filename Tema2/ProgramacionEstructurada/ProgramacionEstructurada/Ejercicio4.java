package ProgramacionEstructurada;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	  int numero;
	
	  System.out.println("Introduce un número");
	  numero = sc.nextInt();
	
	  if (numero > 0) {
		  System.out.println("El numero es positivo");
	  } else if(numero < 0) {
		  System.out.println("El numero es negativo");
	  } else {
		  System.out.println("El numero es 0");
	  }
	}

}
