package modeloParcial1;

public class Departamento {

	private int numUnidad;
	private double saldo;
	private String propietario;
	private String dniProp;
	
	/**
	 * Constructor de la clase Edificio.
	 * @param numUnidad
	 * @param propietario
	 * @param dniProp
	 */
	public Departamento(int numUnidad, String propietario, String dniProp) {
		setNumUnidad(numUnidad);
		setSaldo(0);
		setPropietario(propietario);
		setDniProp(dniProp);
	}
	
	/**
	 * Setter del atributo numUnidad de la clase Departamento.
	 * @param numUnidad
	 */
	private void setNumUnidad(int numUnidad) {
		this.numUnidad = numUnidad;
	}
	
	/**
	 * Setter del atributo saldo de la clase Departamento.
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Setter del atributo propietario de la clase Departamento.
	 * @param propietario
	 */
	private void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	/**
	 * Setter del atributo dniProp de la clase Departamento.
	 * @param dniProp
	 */
	private void setDniProp(String dniProp) {
		this.dniProp = dniProp;
	}
	
	/**
	 * Getter del atributo numUnidad de la clase Departamento.
	 * @return
	 */
	public int getNumeroUnidad() {
		return this.numUnidad;
	}

	/**
	 * Getter del atributo saldo de la clase Departamento.
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 * Recibe por parámetro un saldo para actualizarlo mediante su setter correspondiente.
	 * @param saldo
	 */
	public void actualizarSaldo(double saldo) {
		setSaldo(saldo);
	}
	
	@Override
	public String toString() {
		return "Departamento [numUnidad= " +numUnidad+ ", saldo= " +saldo+ ", propietario= " +propietario+ ", dniProp= " +dniProp+ "]";
	}
}