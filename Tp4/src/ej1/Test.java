package ej1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		Integer num = 0;
		int i = 0;
		while (i<10) {
			System.out.println("Ingrese el numero "+(i+1));
			num = scanner.nextInt();
			if (num > 0) {
				calculadora.ingresarNumero(num);
				i++;
			} else {
				System.out.println("Ingrese un numero mayor a 0.");
			}
		}
	
		System.out.println("El promedio de los 10 numeros ingresados es: " +calculadora.calcularPromedio());
		System.out.println("El promedio de los numeros pares ingresados es: " +calculadora.calcularPromPares());
		
		scanner.close();
	}
		
}


