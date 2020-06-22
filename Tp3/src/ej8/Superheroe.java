package ej8;

public class Superheroe {
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	private int PODERMIN = 0;
	private int PODERMAX = 100;
	private String DERROTA = "DERROTA";
	private String EMPATE = "EMPATE";
	private String VICTORIA = "VICTORIA";
	
	/**
	 * Constructor de la clase Superheroe.
	 * @param nombre
	 * @param fuerza
	 * @param resistencia
	 * @param superpoderes
	 */
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	/**
	 * Recibe un string por parametro y se lo asigna al atributo nombre del objeto Superheroe instanciado. 
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Retorna el valor del atributo nombre del objeto instanciado.
	 * @return
	 */
	public String getNombre() {
		return this.getNombre();
	}

	/**
	 * Recibe un int por parametro y se lo asigna al atributo fuerza del objeto Superheroe instanciado.
	 * Controla que los valores vayan de 0 a 100.
	 * @param fuerza
	 */
	private void setFuerza(int fuerza) {
		if (fuerza < PODERMIN) {
			this.fuerza = PODERMIN;
		} else if (fuerza > PODERMAX) {
			this.fuerza = PODERMAX;
		} else {
			this.fuerza = fuerza;	
		}
	}

	/**
	 * Retorna el valor del atributo fuerza del objeto instanciado.
	 * @return
	 */
	public int getFuerza() {
		return this.fuerza;
	}

	/**
	 * Recibe un int por parametro y se lo asigna al atributo resistencia del objeto Superheroe instanciado.
	 * Controla que los valores vayan de 0 a 100.
	 * @param resistencia
	 */
	private void setResistencia(int resistencia) {
		if (resistencia < PODERMIN) {
			this.resistencia = PODERMIN;
		} else if (resistencia > PODERMAX) {
			this.resistencia = PODERMAX;
		} else {
			this.resistencia = resistencia;	
		}
	}
	
	/**
	 * Retorna el valor del atributo resistencia del objeto instanciado.
	 * @return
	 */
	public int getResistencia() {
		return this.resistencia;
	}
	
	/**
	 * Recibe un int por parametro y se lo asigna al atributo superpoderes del objeto Superheroe instanciado.
	 * Controla que los valores vayan de 0 a 100.
	 * @param superpoderes
	 */
	private void setSuperpoderes(int superpoderes) {
		if (superpoderes < PODERMIN) {
			this.superpoderes = PODERMIN;
		} else if (superpoderes > PODERMAX) {
			this.superpoderes = PODERMAX;
		} else {
			this.superpoderes = superpoderes;	
		}
	}
	
	/**
	 * Retorna el valor del atributo superpoderes del objeto instanciado.
	 * @return
	 */
	public int getSuperpoderes() {
		return this.superpoderes;
	}
	
	/**
	 * Recibe un parametro de tipo Superheroe y compara sus atributos con los propios del objeto instanciado para evaluar cual ganó.
	 * El superheroe con 2 de 3 atributos superiores gana.
	 * @param superheroe
	 * @return
	 */
	public String competir(Superheroe superheroe) {
		String resultado = "";
		int puntaje = 0;
		if (getFuerza() > superheroe.getFuerza()) {
			puntaje = puntaje + 1;
		} else if (getFuerza() < superheroe.getFuerza()) {
			puntaje = puntaje - 1;
		}
		
		if (getResistencia() > superheroe.getResistencia()) {
			puntaje = puntaje + 1;
		} else if (getResistencia() < superheroe.getResistencia()) {
			puntaje = puntaje - 1;
		}
		
		if (getSuperpoderes() > superheroe.getSuperpoderes()) {
			puntaje = puntaje + 1;
		} else if (getSuperpoderes() < superheroe.getSuperpoderes()) {
			puntaje = puntaje - 1;
		}
		
		if (puntaje > 0) {
			resultado = VICTORIA;
		} else if (puntaje < 0) {
			resultado = DERROTA;
		} else {
			resultado = EMPATE;
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Superheroe: [nombre=" +nombre+ ", fuerza=" +fuerza+ ", resistencia=" +resistencia+ ", superpoderes=" +superpoderes+ "]";
	}
}