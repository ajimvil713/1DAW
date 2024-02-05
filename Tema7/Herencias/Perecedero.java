package EjerciciHerencias;

public class Perecedero extends Producto{
	
	private int DiasCaducar;

	public Perecedero(String nombre, double precio) {
		super(nombre, precio);
		DiasCaducar = 0; 
	}
	
	public Perecedero(String nombre, double precio, int DiasCaducar) {
		super(nombre, precio);
		this.DiasCaducar = DiasCaducar;
	}

	public int getDiasCaducar() {
		return DiasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		DiasCaducar = diasCaducar;
	}

	@Override
	public double calcularPrecio(int cantidad) {
		double total = super.calcularPrecio(cantidad);
		
		switch (this.DiasCaducar) {
		case 1:
			return total / 4;
			
		case 2:
			return total / 3;
			
		case 3:
			return total / 2;
			
		default:
			return total;
			
		}
	}
	
}
