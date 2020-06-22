package ej2;

public class Cuadrado {
	private int lado;
	
	/**
	 * Constructor de la clase Cuadrado.
	 */
	public Cuadrado(int lado) {
		setLado(lado);
	}
	
	/**
	 * @param lado Setter del atributo lado de la clase Cuadrado.
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	/**
	 * @return Retorna el atributo lado de la clase Cuadrado.
	 */
	public int getLado() {
		return this.getLado();
	}
	
	/**
	 * @return Retorna el perímetro de la clase cuadrado.
	 */
	public int perimetro() {
		return this.lado*4;
	}
	
	/**
	 * @return Retorna la superficie de la clase cuadrado.
	 */
	public int superficie() {
		return lado*lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado =" +this.lado+ ", perimetro()= " +perimetro()+ ", superficie()= " +superficie()+ "]";
	}
}
