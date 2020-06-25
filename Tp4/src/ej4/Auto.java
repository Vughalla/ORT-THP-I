package ej4;

public class Auto {
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	
	/**
	 * Constructor de la clase Auto.
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param km
	 */
	public Auto(String matricula, String marca, String modelo, int km) {
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
		setKm(km);
	}
	
	/**}
	 * Setter del atributo matricula de la clase Auto.
	 * @param matricula
	 */
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Setter del atributo marca de la clase Auto.
	 * @param marca
	 */
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Setter del atributo modelo de la clase Auto.
	 * @param modelo
	 */
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Setter del atributo km de la clase Auto.
	 * @param km
	 */
	private void setKm(int km) {
		if (km < 0) {
			km=0;
		} else {
			this.km = km;
		}
	}
	
	/**
	 * Getter del atributo matricula de la clase Auto.
	 * @return
	 */
	public String getMatricula() {
		return this.matricula;
	}
	
	/**
	 * Getter del atributo marca de la clase Auto.
	 * @return
	 */
	public String getMarca() {
		return this.marca;
	}
	
	/**
	 * Getter del atributo modelo de la clase Auto.
	 * @return
	 */
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Getter del atributo km de la clase Auto.
	 * @return
	 */
	public int getKm() {
		return this.km;
	}
	
	@Override
	public String toString() {
		return "Auto: [matricula= "+matricula+", marca= "+marca+", modelo= "+modelo+", km= "+km+"]";
	}
}
