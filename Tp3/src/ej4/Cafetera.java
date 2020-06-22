package ej4;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	private int CAPACIDADMAXTOPE = 250;
	private int CAPACIDADACTUALTOPE = 0;
	
	/**
	 * Constructor por defecto de la clase Cafetera.
	 */
	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	
	/**
	 * Constructor personalizado de la clase Cafetera.
	 * @param capacidadMaxima
	 */
	public Cafetera(int capacidadMaxima) {
		setCapacidadMaxima(capacidadMaxima);
		this.cantidadActual = 0;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		setCapacidadMaxima(capacidadMaxima);
		if (cantidadActual < capacidadMaxima) {
			setCantidadActual(cantidadActual);
		} else {
			setCantidadActual(capacidadMaxima);
		}
	}
	/**
	 * Setea la capacidad maxima de la cafetera.
	 * @param capacidadMaxima
	 */
	private void setCapacidadMaxima(int capacidadMaxima) {
		if (capacidadMaxima < CAPACIDADMAXTOPE) {
			this.capacidadMaxima = capacidadMaxima;
		} else {
			this.capacidadMaxima = capacidadMaxima;
		}
	}
	
	/**
	 * Retorna la capacidad maxima de la cafetera.
	 * @return
	 */
	public int getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	/**
	 * Setea la capacidad actual de la cafetera.
	 * @param capacidadActual
	 */
	private void setCantidadActual(int cantidadActual) {
		if (cantidadActual > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		} else if (cantidadActual < CAPACIDADACTUALTOPE) {
			this.cantidadActual = CAPACIDADACTUALTOPE;
		} else {
			this.cantidadActual = cantidadActual;
		}
	}
	
	/**
	 * Retorna la capacidad actual de la cafetera.
	 * @return
	 */
	public int getCantidadActual() {
		return this.cantidadActual;
	}
	
	/**
	 * Lleva la cantidad actual al valor de la capacidad maxima 
	 */
	public void llenar() {
		setCantidadActual(getCapacidadMaxima());
	}

	/**
	 * Lleva la cantidad actual al valor 0. 
	 */
	public void vaciar() {
		setCantidadActual(CAPACIDADACTUALTOPE);
	}

	/**
	 * Aumenta la cantidad actual de la cafetera segun el valor de cafeAgregado. Si se supera la capacidad maxima, se llena la cafetera y devuelve el sobrante.
	 * @param cafeAgregado
	 */
	public int agregarCafe(int cafeAgregado) {
		int sobrante = 0;
		if ((cafeAgregado + getCantidadActual()) < getCapacidadMaxima()) {
			setCantidadActual(cafeAgregado + getCantidadActual());
		} else {
			sobrante = (cafeAgregado + getCantidadActual()) - getCapacidadMaxima();
			setCantidadActual(getCapacidadMaxima());
		}
		return sobrante;
	}
	
	/**
	 * Sirve una taza con el mejor cafe.
	 * @param volTaza
	 * @return taza
	 */
	public int servirTaza(int volTaza) {
		int taza = 0;
		if (volTaza > this.cantidadActual) {
			taza = this.cantidadActual;
			setCantidadActual(CAPACIDADACTUALTOPE);
		} else {
			taza = volTaza;
			setCantidadActual(getCantidadActual() - taza);
		}
		return taza;
	}
	
	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima= " +this.capacidadMaxima+ ", capacidadActual= " +this.cantidadActual+ "]";
	}
}