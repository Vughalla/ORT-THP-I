package ej7;

public class Gato {
	private int energia;
	private double STAMINA=1;
	
	/**
	 * Constructor de la clase Gato, recibe un parametro que representa la cantidad de energia que posee.
	 * @param energia
	 */
	public Gato(int energia) {
		setEnergia(energia);
	}
	
	/**
	 * Recibe parametro para setear el atributo energia del objeto Gato.
	 * @param energia
	 */
	private void setEnergia(int energia) {
		this.energia = energia;
	}
	
	/**
	 * Retorna la cantidad de energia que posee el objeto Gato.
	 * @return
	 */
	public int getEnergia() {
		return this.energia;
	}
	
	public boolean alcanzar(Raton raton, int distancia) {
		boolean alcanzado = false;
		if (puedeCorrer() >= (distancia + raton.puedeCorrer())) {
			alcanzado = true;
		}
		return alcanzado;
	}
	
	/**
	 * Retorna la cantidad de metros que puede correr el gato segun la energia restante y el gasto de la misma por metro.
	 * @return
	 */
	public double puedeCorrer() {
		return getEnergia() / STAMINA;
	}
}
