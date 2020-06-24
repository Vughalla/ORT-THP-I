package ej2;

public class Cancion {
	private int numCancion;
	
	/**
	 * Constructor de la clase Cancion.
	 */
	public Cancion() {
		
	}
	
	/**
	 * Setea el atributo numCancion de la clase Cancion.
	 * @param numCancion
	 */
	private void setNumCancion(int numCancion) {
		this.numCancion = numCancion;
	}
	
	/**
	 * Retorna el valor del atributo numCancion de la clase Cancion.
	 * @return
	 */
	public int getNumCancion() {
		return this.numCancion;
	}
	
	public void moverCancion(int numeroPista) {
		setNumCancion(numeroPista);
	}
}
