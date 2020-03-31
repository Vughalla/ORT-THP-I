package TP1;
import java.util.Scanner;

public class ej6 {
	static Scanner entrada = new Scanner(System.in);
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void main(String[] args) {
		/*
		6. Realiz� un programa que solicite al usuario el ingreso por teclado un valor entero mayor
		que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
		n�mero es par" o "el n�mero es impar". Deber� utilizar el operador �m�dulo� es el caracter
		%.
		 */
		try { 
			System.out.println("Ingrese un n�mero mayor a 0: ");
		
			int num = entrada.nextInt();
			if (num > 0) {
				if ( num % 2 == 0 ) {
					System.out.println("El n�mero ingresado es par.");
				} else {
					System.out.println("El n�mero ingresado es impar.");
				}			
			} else {
				System.out.println("Error, ingrese un n�mero mayor a 0.");
			}
			cerrarPrograma(0);
			
		} catch(Exception e) {
			System.out.println("Error, ingrese valores num�ricos.");
			cerrarPrograma(1);
		}
	}
}
