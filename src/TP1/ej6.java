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
		6. Realizá un programa que solicite al usuario el ingreso por teclado un valor entero mayor
		que 0 en una variable llamada num1 y muestre un mensaje por pantalla indicando "el
		número es par" o "el número es impar". Deberá utilizar el operador “módulo” es el caracter
		%.
		 */
		try { 
			System.out.println("Ingrese un número mayor a 0: ");
		
			int num = entrada.nextInt();
			if (num > 0) {
				if ( num % 2 == 0 ) {
					System.out.println("El número ingresado es par.");
				} else {
					System.out.println("El número ingresado es impar.");
				}			
			} else {
				System.out.println("Error, ingrese un número mayor a 0.");
			}
			cerrarPrograma(0);
			
		} catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}
