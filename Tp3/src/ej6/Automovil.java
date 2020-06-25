package ej6;

public class Automovil {
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	private double SENALBAJOCOMBUSTIBLE = 0.15;
	
	/**
	 * Constructor de la clase Automovil.
	 * @param marca
	 * @param modelo
	 * @param patente
	 * @param capacidadTanque
	 */
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		setMarca(marca);
		setModelo(modelo);
		setPatente(patente);
		setCapacidadTanque(capacidadTanque);
	}
	
	/**
	 * Setea el atributo marca del objeto instanciado de tipo automovil.
	 * @param marca
	 */
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * Retorna el valor del atributo marca del objeto instanciado de tipo automovil.
	 * @return
	 */
	public String getMarca() {
		return this.marca;
	}
	
	/**
	 * Setea el atributo modelo del objeto instanciado de tipo automovil.
	 * @param modelo
	 */
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Retorna el valor del atributo modelo del objeto instanciado de tipo automovil.
	 * @return
	 */
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * Setea el atributo patente del objeto instanciado de tipo automovil.
	 * @param patente
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	/**
	 * Retorna el valor del atributo patente del objeto instanciado de tipo automovil.
	 * @return
	 */
	public String getPatente(String patente) {
		return this.patente;
	}
	
	/**
	 * Setea el atributo capacidadTanque del objeto instanciado de tipo automovil.
	 * @param capacidadTanque
	 */
	private void setCapacidadTanque(double capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	
	/**
	 * Retorna el valor del atributo capacidadTanque del objeto instanciado de tipo automovil.
	 * @return
	 */
	public double getCapacidadTanque() {
		return this.capacidadTanque;
	}
	
	/**
	 * Setea el atributo capacidadDeCombustible del objeto instanciado de tipo automovil.
	 * @param cantidadDeCombustible
	 */
	private void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}
	
	/**
	 * Retorna el valor del atributo capacidadDeCombustible del objeto instanciado de tipo automovil.
	 * @return
	 */
	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}
	
	/**
	 * Setea el atributo rendimientoPorLitro del objeto instanciado de tipo automovil.
	 * @param rendimientoPorLitro
	 */
	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}
	
	/**
	 * Retorna el valor del atributo rendimientoPorLitro del objeto instanciado de tipo automovil.
	 * @return
	 */
	public double getRendimientoPorLitro() {
		return this.rendimientoPorLitro;
	}
	
	/**
	 * Recibe la cantidad de kilometros que se desea viajar y realiza tantos km como sea posible segun la cantidad de combustible disponible.
	 * @param kilometros
	 * @return
	 */
	public double viajar(int kilometros) {
		double distanciaRecorrida = 0;
		double consumo;
		if (kilometros >= 0) {
			consumo = consumirCombustible(kilometros);
			distanciaRecorrida = consumo * getRendimientoPorLitro(); 
		}
		return distanciaRecorrida;
	}
	
	/**
	 * Calcula la cantidad de combustible consumido según la cantidad de kilometros que deseen viajarse y controla que no se gaste más combustible de lo posible teniendo en cuenta la cantidad de combustible disponible y los km por litro.
	 * @param kilometros
	 * @return
	 */
	private double consumirCombustible(int kilometros) {
		double consumo = 0;
		if (kilometros / getRendimientoPorLitro() <= getCantidadDeCombustible()) {
			consumo = kilometros / getRendimientoPorLitro();
			setCantidadDeCombustible(getCantidadDeCombustible() - consumo);			
		} else {
			consumo = getCantidadDeCombustible();
			setCantidadDeCombustible(getCantidadDeCombustible());
		}
		return consumo;
	}
	/**
	 * Recibe la cantidad de litros a cargar y devuelve true o false segun si es posible realizar la carga teniendo en cuenta que los valores ingresados sean mayores a 0 y que la suma de la carga mas los litros que estaban previamente no superen la capacidad del tanque 
	 * @param litrosCombustible
	 * @return
	 */
	public boolean cargarCombustible(int litrosCombustible) {
		boolean cargaOk = false;
		if (litrosCombustible > 0 && litrosCombustible <= espacioDisponible()) {
			setCantidadDeCombustible(getCantidadDeCombustible() + litrosCombustible);
			cargaOk = true;
		}
		return cargaOk;
	}
	
	/**
	 * Retorna la cantidad de litros disponibles en el tanque de combustible.
	 * @return
	 */
	private double espacioDisponible() {
		return getCapacidadTanque() - getCantidadDeCombustible();
	}
	
	/**
	 * Retorna una senal de alarma a partir que el nvl de combustible en el tanque alcance un 15% de la capacidad o sea menor.
	 * @return
	 */
	public boolean pocoCombustible() {
		boolean alerta = false;
		if ((getCapacidadTanque() * SENALBAJOCOMBUSTIBLE) >= getCantidadDeCombustible()) {
			alerta = true;
		}
		return alerta;
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" +marca+ ", modelo=" +modelo+ ", patente=" +patente+ ", capacidadTanque=" +capacidadTanque+ ", cantidadDeCombustible=" +cantidadDeCombustible+ ", rendimientoPorLitro=" +rendimientoPorLitro+ ", espacioDisponible()=" +espacioDisponible()+ ", pocoCombustible()=" +pocoCombustible() +"]";
	}
}
