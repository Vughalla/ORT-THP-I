package ej5;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String mail;
	
	public Persona(String nombre, String apellido, String dni, String telefono, String mail) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setTelefono(telefono);
		setMail(mail);
	}

	/**
	 * Setter del atributo nombre de la clase Persona.
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Setter del atributo apellido de la clase Persona.
	 * @param apellido
	 */
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Setter del atributo dni de la clase Persona.
	 * @param dni
	 */
	private void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Setter del atributo telefono de la clase Persona.
	 * @param telefono
	 */
	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Setter del atributo mail de la clase Persona.
	 * @param mail
	 */
	private void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Getter del atributo dni de la clase Persona.
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}

}
