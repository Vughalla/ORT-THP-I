package ej3;

public class Producto {
	private String nombre;
	private double precio;
	private int cantidad;
	
	/**
	 * Constructor de la clase Producto
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, int cantidad, double precio) {
		setNombre(nombre);
		setCantidad(cantidad);
		setPrecio(precio);
	}

	/**
	 * Setter del atributo nombre de la clase Producto.
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Setter del atributo precio de la clase Producto.
	 * @param precio
	 */
	private void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Setter del atributo cantidad de la clase Producto.
	 * @param cantidad
	 */
	private void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	/**
	 * Getter del atributo nombre de la clase Producto.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Getter del atributo precio de la clase Producto.
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Getter del atributo cantidad de la clase Producto.
	 * @return
	 */
	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}
