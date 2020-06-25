package parcial2;

/**
 * Clase Participante. Segundo Parcial.
 * @author Emmanuel P. Belascuain
 *
 */
public class Participante {
	private String dni;
	private int puntaje;
	private String nombre;
	private String apellido;

	/**
	 * Constructor de la clase Participante.
	 * @param dni
	 * @param nombre
	 * @param apellido
	 */
	public Participante(String dni, String nombre, String apellido) {
		setDni(dni);
		setPuntaje(0);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	/**
	 * Setter del atributo dni de la clase Participante.
	 * @param dni
	 */
	private void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Setter del atributo puntaje de la clase Participante.
	 * @param puntaje
	 */
	private void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/**
	 * Setter del atributo nombre de la clase Participante.
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Setter del atributo apellido de la clase Participante.
	 * @param apellido
	 */
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Getter del atributo dni de la clase Participante.
	 * @return
	 */
	public String getDni() {
		return this.dni;
	}
	
	/**
	 * Getter del atributo puntaje de la clase Participante.
	 * @return
	 */
	public int getPuntaje() {
		return this.puntaje;
	}
	
	/**
	 * Getter del atributo nombre de la clase Participante.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Getter del atributo apellido de la clase Participante.
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Suma 1 voto al puntaje total.
	 */
	public void sumarVoto() {
		setPuntaje(getPuntaje()+1);
	}

	@Override
	public String toString() {
		return "Participante [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
