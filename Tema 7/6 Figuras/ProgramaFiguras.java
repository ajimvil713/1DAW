package Figuras;

public class ProgramaFiguras {

	public static void main(String[] args) {
	    // 1º Creamos el array (No se hace con arrayList porque no se ha visto todavia en clase)
	    iFigura2D[] figuras = new iFigura2D[5];
		
	    // 2º Añadimos figuras al arrayList
	    figuras[0] = new Cuadrado(4.0);
	    figuras[1] = new Rectangulo(3.0, 5.0);
	    figuras[2] = new Triangulo(4.0, 6.0);
	    figuras[3] = new Circulo(2.0);
	    
	    // 3º Mostramos la informacion de las figuras
	    System.out.println("Informacion de las figuras");
	    for (iFigura2D figura : figuras) {
			if (figura != null) {
				figura.imprimir();
			}
		}
	    System.out.println();
	    
	    // 4º Escalamos las figuras a 2
	    for (iFigura2D figura : figuras) {
			if (figura != null) {
				figura.escalar(2);
			}
		}
	    
	    // 5º Mostrsamos la informacion despues de escalar a 2
	    System.out.println("Informacion de las figuras despues de escalar a 2");
	    for (iFigura2D figura : figuras) {
			if (figura != null) {
				figura.imprimir();
			}
		}
	    System.out.println();
	    
	    // 6º Escalamos las figuras a 0.1
	    for (iFigura2D figura : figuras) {
			if (figura != null) {
				figura.escalar(0.1);
			}
		}
	    
	    // 6º Mostramos la información despues de escalar a 0.1
	    System.out.println("Informacion de las figuras despues de escalar a 0.1");
	    for (iFigura2D figura : figuras) {
			if (figura != null) {
				figura.imprimir();
			}
		}
	}

}
