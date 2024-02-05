package ProgramacionEstructurada;

public class Ejercicio {

	public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
	
	  int numero1, numero2;
	
	  System.out.println("Introduce un número:");
	  numero1 = sc.nextInt();
	
	  System.out.println("Introduce el segundo número:");
	  numero2 = sc.nextInt();
	
	  if (numero1 % numero2 == 0) {
		  System.out.println(numero1 + " es múltiplo de " + numero2);
	  } else {
		  System.out.println(numero1 + " no es múltiplo de " + numero2);
    }
  }
}
