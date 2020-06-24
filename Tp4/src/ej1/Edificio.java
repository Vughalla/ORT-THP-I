package ej1;

import java.util.ArrayList;

public class Edificio {
	String direccion;
	private int cantDepartamentos;
	public ArrayList<Departamento> departamentos;
	public ArrayList<Departamento> listaMorosos;
	
	/**
	 * Constructor de la clase Edificio
	 * @param direccion
	 * @param cantDepartamentos
	 */
	public Edificio(String direccion, int cantDepartamentos) {
		setDireccion(direccion);
		this.departamentos = new ArrayList<Departamento>();
		this.listaMorosos = new ArrayList<Departamento>();
		setCantDepartamentos(cantDepartamentos);
		
	}
	
	/**
	 * Setea el argumento direccion según el parámetro brindado.
	 * @param direccion
	 */
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Setea el argumento cantDepartamentos según el parámetro brindado.
	 * @param cantDepartamentos
	 */
	private void setCantDepartamentos(int cantDepartamentos) {
		this.cantDepartamentos = cantDepartamentos;
	}
	
	/**
	 * Retorna la cantidad de unidades que actualmente hay en el edificio.
	 * @return
	 */
	public int cantUnidadesActuales() {
		return departamentos.size();
	}
	
	/**
	 * Retorna la capacidad máxima de unidades que puede albergar el edificio.
	 * @return
	 */
	public int getCantDepartamentos() {
		return this.cantDepartamentos;
	}
	
	/**
	 * Valida que el numero de la unidad no exista en el edificio y luego la agrega al mismo.
	 * @param depto
	 */
	public void agregarUnidad(Departamento depto) {
		boolean esRepetida;
		if (departamentos.size() < cantDepartamentos) {
			esRepetida = checkUnidadRepetida(depto);
			if (esRepetida == false) {
				departamentos.add(depto);
			}
		}
	}

	/**
	 * Itera la lista de departamentos para verificar que el numero de unidad no esté repetido, retorna true o false si la unidad existe.
	 * @param depto
	 * @return
	 */
	private boolean checkUnidadRepetida(Departamento depto) {
		int i = 0;
		boolean unidadRepetida = false;
		while(i < departamentos.size() && unidadRepetida == false) {
			if (departamentos.get(i).getNumeroUnidad() == depto.getNumeroUnidad()) {
				unidadRepetida = true;
			} else {
				i = i + 1;
			}
		}
		return unidadRepetida;
	}
	
	/**
	 * Actualiza el saldo de la unidad en caso que la misma exista.
	 * @param numUnidad
	 * @param saldo
	 */
	public void actualizarSaldo(int numUnidad, double saldo) {
		Departamento depto = buscarPorUnidad(numUnidad);
		if (depto != null) {
			depto.actualizarSaldo(saldo);
		}
	}
	
	/**
	 * Busca por numero de unidad a los departamentos del edificio y si lo encuentra lo retorna.
	 * @param depto
	 * @return
	 */
	public Departamento buscarPorUnidad(int unidad) {
		int i = 0;
		Departamento depto = null;
		while (i < departamentos.size() && depto == null) {
			if (departamentos.get(i).getNumeroUnidad() == unidad) {
				depto = departamentos.get(i);
			} else {
				i = i+1;
				System.out.println("No se encontró la unidad brindada.");
			}
		}
		return depto;
	}
	
	public void pasarAMoroso(int numUnidad) {
		Departamento depto = buscarPorUnidad(numUnidad);
		if (depto != null) {
			if (depto.getSaldo() < 0) {
				listaMorosos.add(depto);
			}
		}
	}
	
	public void listaMoroso() {
		for(Departamento depto: listaMorosos) {
			System.out.println("La unidad funcional N°" +depto.getNumeroUnidad()+" debe :$"+depto.getSaldo()+".-");
		}
	}
		
}
