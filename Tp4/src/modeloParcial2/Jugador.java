package modeloParcial2;

public class Jugador {
	private int numero;
	private String apellido;
	private int numGoles;
	
	public Jugador(int numero, String apellido, int numGoles) {
		setNumero(numero);
		setApellido(apellido);
		setNumGoles(numGoles);
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}
	
	public int getNumero() {
		return this.numero;
	}

	public int getNumGoles() {
		return this.numGoles;
	}
	
	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", apellido=" + apellido + ", numGoles=" + numGoles + "]";
	}
	
}
