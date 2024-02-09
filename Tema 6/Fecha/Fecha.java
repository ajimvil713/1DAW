package Fecha;

import java.util.InputMismatchException;

public class Fecha {

	private int dias;
	private int meses;
	private int años;
	
	public ClaseFecha(int dias, int meses, int años) {
		comprobarDias(dias);
		comprobarMes(meses);
		comprobarAño(años);
		
		this.dias = dias;
		this.meses = meses;
		this.años = años;
	}
	
	public void verFecha() {
		System.out.println(dias + "/" + meses + "/" + años + "/");
	}
	
	public int contarDias(ClaseFecha fecha) {
		return fecha.dias - this.dias + (fecha.meses - this.meses) * 30 + (fecha.años - this.años) * 365;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		comprobarDias(dias);
		this.dias = dias;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		comprobarMes(meses);
		this.meses = meses;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		comprobarAño(años);
		this.años = años;
	}
	
	private void comprobarDias(int dias) {
		if (dias < 0 || dias > 31) {
			throw new InputMismatchException("Error, el dia no es correcto.");
		}
	}
	
	private void comprobarMes(int meses) {
		if (meses < 0 || meses > 12) {
			throw new InputMismatchException("Error, el mes no es correcto.");
		}
	}
	
	private void comprobarAño(int años) {
		if (años < 0 || años > 9999) {
			throw new InputMismatchException("Error, el año no es correcto.");
		}
	}

}
