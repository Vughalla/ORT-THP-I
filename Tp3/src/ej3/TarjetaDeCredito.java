package ej3;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double acumuladoActual;
	
	/**
	 * Constructor de la clase TarjetaDeCredito.
	 * @param numero
	 * @param titular
	 * @param limiteDeCompra
	 */
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		setNumero(numero);
		setTitular(titular);
		setLimiteDeCompra(limiteDeCompra);
		this.acumuladoActual = 0;
	}
	
	/**
	 * @param numero Setea el numero de la tarjeta de credito.
	 */
	private void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * @return Retorna el numero de la tarjeta de credito.
	 */
	public String getNumero() {
		return this.numero;
	}
	
	/**
	 * @param titular Setea el nombre del titular de la tarjeta de credito.
	 */	
	private void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return Retorna el nombre del titular de la tarjeta de credito.
	 */
	public String getTitular() {
		return this.titular;
	}
	
	/**
	 * @param limiteDeCompra Setea el limite de la tarjeta de credito.
	 */
	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	/**
	 * @return Retorna el limite de compra de la tarjeta de credito.
	 */
	public double getLimiteDeCompra() {
		return this.limiteDeCompra;
	}
	
	/**
	 * @return Retorna el gasto acumulado actual de la tarjeta de credito.
	 */
	public double getAcumuladoActual() {
		return this.acumuladoActual;
	}
	
	/**
	 * @return Retorna el monto disponible de la tarjeta de credito.
	 */
	public double montoDisponible() {
		double montoDisponible;
		montoDisponible = this.limiteDeCompra - this.acumuladoActual;
		if (montoDisponible < 0) {
			montoDisponible = 0;
		}
		return montoDisponible;
	}
	
	/**
	 * @param limiteDeCompra Actualiza el atributo limiteDeCompra.
	 */
	public void actualizarLimite(double limiteDeCompra) {
		setLimiteDeCompra(limiteDeCompra);
	}
	
	/**
	 * @param importeCompra Funcion que acumula los gastos realizados en la tarjeta.
	 */
	private void acumularGastoActual(double importeCompra) {
		this.acumuladoActual = this.acumuladoActual + importeCompra;
	}
	
	/**
	 * @param importeCompra
	 * @return Funcion que procesa si puede realizarse una compra. Recibe un importe de compra y retorna true o false dependiendo del limite disponible.
	 */
	public boolean realizarCompra(double importeCompra) {
		boolean compra = false;
		if (importeCompra < montoDisponible()) {
			compra = true;
			acumularGastoActual(importeCompra);
		}
		return compra;
	}
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero= " +this.numero+ ", titular= " +this.titular+ ", limiteDeCompra= " +this.limiteDeCompra+ ", acumuladoActual= " +this.acumuladoActual+ ", montoDisponible= " +this.montoDisponible()+ "]"; 
	}
}
