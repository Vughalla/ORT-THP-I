package ej1;

import java.util.ArrayList;

public class Calculadora {
	private ArrayList<Integer> numeros;
	private ArrayList<Integer> pares;
	
	/**
	 * Constructor de la clase Calculadora.
	 */
	public Calculadora() {
		this.numeros = new ArrayList<Integer>();
		this.pares = new ArrayList<Integer>();
	}
	
	/**
	 * Funcion de agregación de los numeros ingresados por teclado.
	 * @param numero
	 */
	public void ingresarNumero(Integer numero) {
		System.out.println(numero);
		numeros.add(numero);
	}
	
	/**
	 * Retorna el promedio de los numeros ingresados.
	 * @return
	 */
	public double calcularPromedio() {
		int acum = 0;
		double promedio = 0;
		for(Integer numero: numeros) {
			acum = acum + numero;
		}
		promedio = promediar(acum);
		return promedio;
	}
	
	/**
	 * Método privado que agrega a una nueva lista los numeros pares ingresados.
	 */
	private void filtrarPares() {
		for(Integer numero: numeros) {
			if (numero%2 == 0) {
				pares.add(numero);
			}
		}
	}
	/**
	 * Calcula y retorna el promedio de los números ingresados.
	 * @param acum
	 * @return
	 */
	private double promediar(int acum) {
		return (double)acum / numeros.size();
	}
	
	/**
	 * Calcula el promedio de los numeros pares.
	 * @return
	 */
	public double calcularPromPares() {
		filtrarPares();
		int acum = 0;
		double promedio = 0;
		for(Integer par: pares) {
			acum = acum + par;	
		}
		promedio = promediarPares(acum);
		return promedio;		
	}
	
	/**
	 * Retorna el promedio de los numeros pares.
	 * @param acum
	 * @return
	 */
	private double promediarPares(int acum) {
		return (double)acum / pares.size();
	}
}
