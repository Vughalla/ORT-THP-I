package TP2;
import java.util.Scanner;

public class ej4 {
	private static Scanner entrada = new Scanner(System.in);
	
	private static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	
	private static int ingresarNumero() {
		int flag = 0;
		int i = 0;
		while ( flag == 0 ) {
			System.out.println("Ingrese un número: ");
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				System.out.println("Número ingresado");
				flag = 1;
			} else {
				System.out.println("El valor ingresado no es un número. Inténtelo nuevamente.");
			}
		}
		return i;
	}
	public static void main(String[] args) {
		/* 4. Realizar un programa en el cual se pida al usuario el ingreso de dos números enteros num1 y num2,
		cuya relación de valores es que el primero es menor o igual al segundo y mostrar por pantalla la
		secuencia de números que existe entre ambos:
		a) Incluyéndolos;
		b) Excluyéndolos.
		Obs: Validar que el primer número sea menor o igual al segundo. Pedir el ingreso de ambos números
		las veces que sea necesario hasta que se cumpla dicha condición.
		¿Qué pasaría si esta validación no la realizáramos y el ingreso es incorrecto?
		*/

		int num1 = ingresarNumero();
		int num2 = ingresarNumero();
		
		while (num1 > num2) {
			System.out.println("Error, el segundo número debe ser igual o mayor que el primero. Ingrese el segundo número nuevamente");
			num2 = ingresarNumero();
		}
		

		if (num2 == num1) {
			System.out.println("Los números son iguales. No hay secuencias que mostrar.");
		} else {
			
			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
			
			System.out.println("-----------");
			
			for (int i=(num1+1); i<num2; i++) {
				System.out.println(i);
			}
		}
		
		cerrarPrograma(0);
		}
	
}


