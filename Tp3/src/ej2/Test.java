package ej2;

public class Test {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(10);
		System.out.println(cuadrado.toString());
		System.out.println("Cambio el valor del lado de la clase cuadrado a 50");
		cuadrado.setLado(50);
		System.out.println(cuadrado.toString());
	}

}
