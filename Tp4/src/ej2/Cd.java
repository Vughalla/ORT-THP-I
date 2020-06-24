package ej2;

import java.util.ArrayList;

public class Cd {
	private ArrayList<Cancion> canciones;
	private int contador;
	
	/**
	 * Constructor de la clase CD.
	 */
	public Cd() {
		this.canciones = new ArrayList<Cancion>();
		setContador();
	}
	
	/**
	 * Setter del atributo contador de la clase CD.
	 */
	private void setContador() {
		this.contador = canciones.size();
	}
	
	/**
	 * Retorna el numero de canciones en el CD.
	 * @return
	 */
	public int numeroCanciones() {
		return this.contador;
	}
	
	/**
	 * Recibe el numero de pista que se desea buscar y devuelve la canción correspondiente.
	 * @param numPista
	 * @return
	 */
	public Cancion dameCancion(int numPista) {
		Cancion cancion = null;
		int i = 0;
		while (i < canciones.size() && cancion == null) {
			if (canciones.get(i).getNumCancion() == numPista) {
				cancion = canciones.get(i);
			} else {
				i++;
			}
		}
		return cancion;
	}

	private int dameUbicacion(Cancion cancion) {
		int ubicacion = -1;
		int i = 0;
		while (i < canciones.size() && ubicacion == -1) {
			if (canciones.get(i) == cancion) {
				ubicacion = i;
			} else {
				i++;
			}
		}
		return ubicacion;
	}
	
	/**
	 * Agrega una canción en el numero de pista indicado.
	 * @param posicion
	 * @param cancion
	 */
	public void grabaCancion(int posicion, Cancion cancion) {
		int ubicacion;
		ubicacion = dameUbicacion(cancion);
		canciones.set(posicion, cancion);
		cancion.moverCancion(posicion);
		canciones.remove(ubicacion);
		setContador();
		
	}
	
	/**
	 * Agrega una cancion al final del CD.
	 * @param cancion
	 */
	public void agregaCancion(Cancion cancion) {
		canciones.add(cancion);
		cancion.moverCancion(contador);
		setContador();
	}
	
	/**
	 * Borra la canción en la posición de pista indicada.
	 * @param posicion
	 */
	public void elimina(int posicion) {
		canciones.remove(posicion-1);
		setContador();
	}
}
