package ej1;

public class Persona {

	private String nombre;
	private String apellido;
	private String direccion;
	
	/**
	 * Constructor de la clase Persona.
	 */
	public Persona() {
		setNombre("");
		setApellido("");
		setDireccion("");
	}
	
	/**
	 *@param nombre Setea el nombre de la clase persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return Retorna el nombre de la clase persona.
	 */
	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * @param apellido Setea el apellido de la clase persona.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return Retorna el apellido de la clase persona.
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * @param direccion Setea la direccion de la clase persona.
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return Retorna la direccion de la clase persona.
	 */
	public String getDireccion() {
		return this.direccion;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre +", apellido= "+ this.apellido +", direccion= " +this.direccion + "]";
	}
}
