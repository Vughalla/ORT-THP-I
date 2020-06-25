package ej5;

public class Hotel {
	private String nombre;
	private String localidad;
	private int habitacionesTotales;
	private int habitacionesOcupadas;
	private int habitacionesReservadas;
	private int CANTHABITACIONESMIN = 1;
	private int CANTRESERVAMIN = 0;
	
	/**
	 * Constructor de la clase Hotel.
	 * @param nombre
	 * @param localidad
	 * @param habitacionesTotales
	 */
	public Hotel(String nombre, String localidad, int habitacionesTotales){
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
		setHabitacionesOcupadas(0);
		setHabitacionesReservadas(0);
	}
	
	/**
	 * Constructor de la clase Hotel, recibe todos los atributos de la clase.
	 * @param nombre
	 * @param localidad
	 * @param habitacionesTotales
	 * @param habitacionesOcupadas
	 * @param habitacionesReservadas
	 */
	public Hotel(String nombre, String localidad, int habitacionesTotales, int habitacionesOcupadas, int habitacionesReservadas){
		setNombre(nombre);
		setLocalidad(localidad);
		setHabitacionesTotales(habitacionesTotales);
		setHabitacionesOcupadas(habitacionesOcupadas);
		setHabitacionesReservadas(habitacionesReservadas);
	}
	
	/**
	 * Settea el atributo nombre del objeto hotel instanciado.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Retorna el atributo nombre del objeto hotel instanciado.
	 * @return
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Settea el atributo localidad del objeto hotel instanciado.
	 * @param localidad
	 */
	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * Retorna el atributo localidad del objeto hotel instanciado.
	 * @return
	 */
	public String getLocalidad() {
		return this.localidad;
	}

	/**
	 * Settea el atributo habitacionesTotales del objeto hotel instanciado.
	 * @param habitacionesTotales
	 */
	private void setHabitacionesTotales(int habitacionesTotales) {
		if (habitacionesTotales < CANTHABITACIONESMIN) {
			this.habitacionesTotales = CANTHABITACIONESMIN;
		} else {
			this.habitacionesTotales = habitacionesTotales;
		}
	}
	
	/**
	 * Retorna el atributo habitacionesTotales del objeto hotel instanciado.
	 * @return
	 */
	public int getHabitacionesTotales() {
		return this.habitacionesTotales;
	}

	/**
	 * Settea el atributo habitacionesOcupadas del objeto hotel instanciado.
	 * @param habitacionesOcupadas
	 */
	private void setHabitacionesOcupadas(int habitacionesOcupadas) {
		this.habitacionesOcupadas = habitacionesOcupadas;
	}
	
	/**
	 * Retorna el atributo habitacionesOcupadas del objeto hotel instanciado.
	 * @return
	 */
	public int getHabitacionesOcupadas() {
		return this.habitacionesOcupadas;
	}
	
	/**
	 * Settea el atributo habitacionesreservadas del objeto hotel instanciado.
	 * @param habitacionesReservadas
	 */	
	private void setHabitacionesReservadas(int habitacionesReservadas) {
		if (habitacionesReservadas < CANTRESERVAMIN) {
			this.habitacionesReservadas = CANTRESERVAMIN;
		} else if (habitacionesReservadas > getHabitacionesTotales()) {
			this.habitacionesReservadas = getHabitacionesTotales();
		} else {
			this.habitacionesReservadas = habitacionesReservadas;
		}
	}

	/**
	 * Retorna el atributo habitacionesReservadas del objeto hotel instanciado.
	 * @return
	 */
	public int getHabitacionesReservadas() {
		return this.habitacionesReservadas;
	}
	
	/**
	 * Metodo que recibe la cantidad de habitaciones que se desean reservar y de ser posible llama al metodo que setea el atributo habitacionesReservadas.
	 * @param habitacionesParaReservar
	 * @return
	 */
	public boolean reservarHabitaciones(int habitacionesParaReservar) {
		boolean operacion = false;
		int habitacionesDisponibles = getHabitacionesTotales() - getHabitacionesOcupadas() - getHabitacionesReservadas();
		if (habitacionesParaReservar < habitacionesDisponibles) {
			setHabitacionesReservadas(habitacionesParaReservar);
			operacion = true;
		}
		return operacion;
	}
	
	/**
	 * Recibe la cantidad de habitaciones que se desean ocupar, y si son o no de reserva. Segun cada caso verifica que sea posible realizar la accion y retorna un booleano indicando si se realizo o no.
	 * @param habitacionesParaOcupar
	 * @param reserva
	 * @return
	 */
	public boolean ocuparHabitaciones(int habitacionesParaOcupar, boolean reserva) {
		boolean operacion = false;
		int habitacionesDisponibles = getHabitacionesTotales() - getHabitacionesOcupadas() - getHabitacionesReservadas();
		if (reserva) {
			if (habitacionesParaOcupar <= getHabitacionesReservadas()) {
				ocuparConReserva(habitacionesParaOcupar);
				operacion = true;
			}
		} else {
			if (habitacionesParaOcupar <= habitacionesDisponibles) {
				ocuparSinReserva(habitacionesParaOcupar);
				operacion = true;
			}
		}
		return operacion;
	}
	
	/**
	 * Setea la cantidad de habitaciones ocupadas y descuenta las mismas de las reservas realizadas.
	 * @param habitacionesParaOcupar
	 */
	private void ocuparConReserva(int habitacionesParaOcupar) {
		setHabitacionesOcupadas(getHabitacionesOcupadas() + habitacionesParaOcupar);
		setHabitacionesReservadas(getHabitacionesReservadas() - habitacionesParaOcupar);
	}

	/**
	 * Setea la cantidad de habitaciones ocupadas.
	 * @param habitacionesParaOcupar
	 */
	private void ocuparSinReserva(int habitacionesParaOcupar) {
		setHabitacionesOcupadas(getHabitacionesOcupadas() + habitacionesParaOcupar);
	}
	
	/**
	 * Recibe la cantidad de habitaciones que desean desocuparse y verifica que sea posible hacerlo.
	 * @param habitacionesParaDesocupar
	 * @return
	 */
	public boolean desocuparHabitaciones(int habitacionesParaDesocupar) {
		boolean operacion = false;
		if (habitacionesParaDesocupar <= getHabitacionesOcupadas() && habitacionesParaDesocupar >= 0) {
			setHabitacionesOcupadas(getHabitacionesOcupadas() - habitacionesParaDesocupar);
			operacion = true;
		}
		return operacion;
	}
	
	/**
	 * Retorna la cantidad de habitaciones que no están ocupadas.
	 * @return
	 */
	public int cantidadHabitacionesLibres() {
		return (getHabitacionesTotales() - getHabitacionesOcupadas());
	}
	
	/**
	 * Retorna la cantidad de habitaciones que no están ocupadas ni reservadas.
	 * @return
	 */
	public int disponibilidad() {
		return (getHabitacionesTotales() - getHabitacionesOcupadas() - getHabitacionesReservadas());
	}
	
	@Override
	public String toString() {
		return String.format("Hotel %s %s [habitaciones=%d, ocupadas=%d, reservadas=%d, libres=%d, disponibles=%d]", nombre, localidad, habitacionesTotales, habitacionesOcupadas, habitacionesReservadas, cantidadHabitacionesLibres(), disponibilidad());
	}
}
