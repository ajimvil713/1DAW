package DiaDeLaSemana;

public enum DiaSemana {
	
	// Declaración de los valores posibles
	//LUNES, MARTES, MIERCOLES, JUEVES, VIERNES;
	
	// Declaración con parametros
	//LUNES("L", 1), MARTES("M", 2), MIERCOLES("X", 3), JUEVES("J", 4), VIERNES("V", 5);
	
	// Declaración con metodos abstractos, hay que declararlo en cada uno de los valores
	LUNES("L", 1){
		@Override
		public String hayClase() {
			return "No hay clase";
		}
	},
	MARTES("M", 2){
		@Override
		public String hayClase() {
			return "Hay clase";
		}
	},
	MIERCOLES("X", 3){
		@Override
		public String hayClase() {
			return "Hay clase";
		}
	},
	JUEVES("J", 4){
		@Override
		public String hayClase() {
			return "No hay clase";
		}
	},
	VIERNES("V", 5){
		@Override
		public String hayClase() {
			return "Hay clase";
		}
	};
	
	// Declaración de los atributos
	private final String dia;
	private final int numero;
	private final boolean laborable;
	
	// Constructor
	private DiaSemana(String dia, int numero) {
		this.dia = dia;
		this.numero = numero;
		this.laborable = true;
	}
	
	// Getters y setters
	public String getDia() {
		return dia;
	}

	public int getNumero() {
		return numero;
	}

	public boolean isLaborable() {
		return laborable;
	}
	
	// Declaración de metodos abstractos
	public abstract String hayClase();
	
}
