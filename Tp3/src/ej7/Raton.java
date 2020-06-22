package ej7;

public class Raton {
	private int energia;
	private double STAMINA=2;
	
	/**
	 * Constructor de la clase Raton, recibe un parametro que representa la cantidad de energia que posee.
	 * @param energia
	 */
	public Raton(int energia) {
		setEnergia(energia);
	}
	
	/**
	 * Recibe parametro para setear el atributo energia del objeto Raton.
	 * @param energia
	 */
	private void setEnergia(int energia) {
		this.energia = energia;
	}
	
	/**
	 * Retorna la cantidad de energia que posee el objeto Raton.
	 * @return
	 */
	public int getEnergia() {
		return this.energia;
	}
	
	/**
	 * Retorna la cantidad de metros que puede correr el raton segun la energia restante y el gasto de la misma por metro.
	 * @return
	 */
	public double puedeCorrer() {
		return getEnergia() / STAMINA;
	}
}
