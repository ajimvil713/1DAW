package Almacen;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		Productos[] productos = new Productos[10];
		
		// Introducimos en el array 3 productos de cada tipo
		productos[0] = new Productos(100, 10, 5.0, "Zumo de naranja");
		productos[1] = new Productos(101, 10, 5.0, "Zumo de piña");
		productos[2] = new Productos(102, 10, 5.0, "Zumo de melocotón");
		
		productos[3] = new Agua(103, 1, 1.50, "Bezolla", "Bezolla");
		productos[4] = new Agua(104, 1, 1.50, "Lanjaron", "Lanjaron");
		productos[5] = new Agua(105, 1, 1.50, "Font Vella", "Font Vella");
		
		productos[6] = new Azucarda(106, 1, 2.30, "Cocacola", 10, false);
		productos[7] = new Azucarda(107, 2, 3.50, "Fanta", 10, true);
		productos[8] = new Azucarda(108, 2, 3.50, "Tonica", 10, true);
		
		// Menu
		int opcion, identificador, cantidadLitros;
		double precio;
		boolean error;
		String marca, precioTotal, precioMarca, precioMedioAgua;
		
		do {
			imprimirMenu();
			opcion = pedirInt();
			
			switch (opcion) {
			case 1:
				precioTotal = String.format("%.2f", calcularPrecio(productos));
				System.out.println("El precio de todos los productos del alamcen es: " + precioTotal + "€");
				break;
			case 2:
				System.out.print("Introduce la marca: ");
				marca = pedirString();
				
				precioMarca = String.format("%.2f", calcularPrecioMarca(productos, marca));
				System.out.println("El precio de los productos de " + marca + " es de " + precioMarca + "€");
				break;
			case 3:
				precioMedioAgua = String.format("%.2f", calcularPrecioAgua(productos));
				System.out.println("El precio medio del agua es " + precioMedioAgua + "€");
				break;
			case 4:
				do {
					error = false;
					
					System.out.print("Introduce el identificador: ");
					identificador = pedirInt();
					
					// Comprobamos si el identificador esta ya registrado
					try {
						comprobarId(productos, identificador);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						error = true;
					}
				} while (error);
				
				System.out.print("Introduce la cantidad de litros: ");
				cantidadLitros = pedirInt();
				
				System.out.print("Introduce el precio: ");
				precio = pedirDouble();
				
				System.out.print("Introduce la marca: ");
				marca = pedirString();
				
				productos = añadirProducto(productos, identificador, cantidadLitros, precio, marca);
				System.out.println("El producto ha sido añadido correctamente");
				break;
			case 5:
				System.out.print("Inttroduce la id del producto que quieres eliminar: ");
				identificador = pedirInt();
				
				productos = eliminarProducto(productos, identificador);
				System.out.println("El producto ha sido eliminado correctamente");
				break;
			case 6:
				imprimirInformacion(productos);
				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Error, La opcion " + opcion + " no es valida");
				break;
			}
		} while (opcion != 7);
		
		System.out.println("Programa finalizado con exito");
	}
	
	public static void imprimirMenu() {
		System.out.println("1) Calcular el prcio de todos los productos");
		System.out.println("2) Calcular el precio de todos los productos de una marca");
		System.out.println("3) Calcular el precio medio del agua");
		System.out.println("4) Agregar un nuevo producto");
		System.out.println("5) Eliminar un producto");
		System.out.println("6) Mostrar información de las bebidas");
		System.out.println("7) Salir");
		System.out.println();
		System.out.print("Introduce una opción: ");
	}
	
	// Funcion para calcular todos los productos del almacen (Con descuentos)
	public static double calcularPrecio(Productos[] productos) {
		double suma = 0;
		
		// Reccorremos los valores del array	
		for (Productos producto : productos) {
			// Mientras el array no este vacio
			if (producto != null) {
				// Si el producto es azucarada y tiene promoción
				if (producto instanceof Azucarda && ((Azucarda) producto).isPromocion()) {
					suma = suma +((Azucarda) producto).descuento(); // aplicamos el descuento
				} else {
					suma = suma + producto.getPrecio();
				}
			}
		}
		
		return suma;
	}
	
	// Funcion para calcular el precio de todos los pproductos de una marca
	public static double calcularPrecioMarca(Productos[] productos, String marca) {
		double suma = 0;
		
		// Recorremos el bucle
		for (Productos producto : productos) {
			// Si no esta vacio el array
			if (producto != null) {
				// Si la marca del producto coincide con la del producto
				if (producto.getMarca().equals(marca)) {
					suma = suma + producto.getPrecio();
				}
			}
		}
		
		return suma;
	}
	
	// Función para calcular el precio medio del agua
	public static double calcularPrecioAgua(Productos[] productos) {
		int cantidadAgua = 0;
		double precioAgua = 0;
		
		// Recorremos el array
		for (Productos producto : productos) {
			// Si encontramos un producto de tipo agua
			if (producto instanceof Agua) {
				cantidadAgua++;
				precioAgua = producto.getPrecio();
			}
		}
		
		// Calculamos y devolvemos el precio medio
		return (cantidadAgua > 0) ? (precioAgua / cantidadAgua) : 0;
	}
	
	// Funcion para añadir un valor a la primera posicion libre del array
	public static Productos[] añadirProducto(Productos[] productos, int identificador, int cantidadLitros, double precio, String marca) {
		// Recorremos el array
		for (int i = 0; i < productos.length; i++) {
			// Si la posicion está vacia
			if (productos[i] == null) {
				// Almacenamos el nuevo valor al array
				productos[i] = new Productos(identificador, cantidadLitros, precio, marca);
			}
		}
		
		return productos;
	}
	
	// Funcion para comprobar si un identificador ya esta registrado
	public static void comprobarId(Productos[] productos, int identificador) throws Exception{
		// Vamos recorriendo las posiciones del array
		for (Productos producto : productos) {
			// Si existe el identificador
			if (producto != null && producto.getIdentificador() == identificador) {
				throw new Exception("Error, el identificador " + identificador + " ya ha sido registrado.");
			}
		}
	}
	
	// Funcion que dada una id, elimina un producto del array
	public static Productos[] eliminarProducto(Productos[] productos, int id) {
		// Nos recorremos el array
		for (int i = 0; i < productos.length; i++) {
			// Si nos encontramos el identificador
			if (productos[i] != null && productos[i].getIdentificador() == id) {
				productos[i] = null;
			}
		}
		
		return productos;
	}
	
	// Funcion que va a imprimir toda la informacion del array productos
	public static void imprimirInformacion(Productos[] productos) {
		// Recorremos el array
		for (Productos producto : productos) {
			// Si el producto es de tipo agua, azucarada, o producto a secas
			if (producto != null && producto instanceof Agua) {
				System.out.println(producto.toString());
				System.out.println();
			} else if (producto != null && producto instanceof Azucarda) {
				System.out.println(producto.toString());
				System.out.println();
			} else if (producto != null) {
				System.out.println(producto.toString());
				System.out.println();
			}
		}
	}
	
	// Funciones del Scanner
	public static int pedirInt() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
	}
	
	public static double pedirDouble() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextDouble();
	}
	
	public static String pedirString() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public static boolean pedirBoolean() {
		Scanner sc = new Scanner(System.in);
		
		return sc.nextBoolean();
	}
}
