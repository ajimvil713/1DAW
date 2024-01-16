package EjercicioHora;

import java.util.InputMismatchException;

public class ClaseReloj {
	
	private byte hora;
	private byte minutos;
	private byte segundos;
	
	public Reloj(byte hora, byte minutos, byte segundos) {
		comprobarHora(hora);
		comprobarMinutos(minutos);
		comprobarSegundos(segundos);
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Reloj() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public String dameHora() {
		return hora + ":" + minutos + ":" + segundos;
	}
	
	public String dameHora(int formato) {
		if (formato == 24) {
			return hora + ":" + minutos + ":" + segundos;
		} else {
			if (hora > 12) {
				return hora - 12 + ":" + minutos + ":" + segundos + "pm";
			} else {
				return hora + ":" + minutos + ":" + segundos + "am";
			}
		}
	}
	
	public byte getHora() {
		return hora;
	}

	public void setHora(byte hora) {
		comprobarHora(hora);
		this.hora = hora;
	}

	public byte getMinutos() {
		return minutos;
	}

	public void setMinutos(byte minutos) {
		comprobarMinutos(minutos);
		this.minutos = minutos;
	}

	public byte getSegundos() {
		return segundos;
	}

	public void setSegundos(byte segundos) {
		comprobarSegundos(segundos);
		this.segundos = segundos;
	}
	
	private void comprobarHora(byte hora) {
		if (hora < 0 || hora > 23) {
            throw new InputMismatchException("Error, La hora no es correcta.");
		}
	}
	
	private void comprobarMinutos(byte minutos) {
		if (minutos < 0 || minutos > 59) {
			throw new InputMismatchException("Error, Los minutos no son correctos.");
		}
	}
	
	private void comprobarSegundos(byte segundos) {
		if (segundos < 0 || segundos > 59) {
			throw new InputMismatchException("Error, Los segundos no son correctos.");
		}
	}
	
}
