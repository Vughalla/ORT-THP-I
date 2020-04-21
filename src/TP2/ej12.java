package TP2;
import java.util.Scanner;

public class ej12 {
	static Scanner entrada = new Scanner(System.in);
	
	private static int pedirNumero() {
		int i = 0;
		int flagImput = 0;
		while (flagImput == 0) {
			System.out.println("Ingrese un número");
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				System.out.println("Número ingresado");
				flagImput = 1;					
			} else {
				System.out.println("El valor ingresado no es un número. Inténtelo nuevamente.");
			}
		}
		return i;
	}
	
	private static void distribuirOperacion(int n1, int n2) {
		int flag = 0;
		while (flag == 0) {
			String operacion = entrada.nextLine();
			switch (operacion.toLowerCase()) {
			case ("+"):
				sumar(n1, n2);
				flag = 1;
				break;
			case ("-"):
				restar(n1, n2);
				flag = 1;
				break;
			case ("/"):
				dividir(n1, n2);
				flag = 1;	
				break;
			case ("*"):
				multiplicar(n1, n2);
				flag = 1;	
				break;
			case ("%"):
				calcularModulo(n1, n2);
				flag = 1;	
				break;
			case ("f"):
				cerrarPrograma();
			default:
				System.out.println("La operación ingresada no es válida, intente nuevamente.");
			}
		}
	}
	
	private static void sumar(int n1, int n2) {
		double total = n1 + n2;
		presentarResultado(total);
	}
	
	private static void restar(int n1, int n2) {
		double total = n1 - n2;
		presentarResultado(total);
	}
	
	private static void dividir(int n1, int n2) {
		while (n2 == 0) {
			System.out.println("Error, está intentando dividir por 0. Ingrese el segundo número nuevamente.");
			n2 = pedirNumero();
		}
		double total = n1 / n2;
		presentarResultado(total);
	}
	
	private static void multiplicar(int n1, int n2) {
		double total = n1 * n2;
		presentarResultado(total);
	}
	
	private static void calcularModulo(int n1, int n2) {
		double total = n1 % n2;
		presentarResultado(total);
	}
	
	private static void presentarResultado(double total) {
		System.out.println("El resultado es: " +total);
		cerrarPrograma();
	}
	private static void cerrarPrograma() {
		entrada.close();
		System.out.println("Programa finalizado.");
		System.exit(0);		
	}
	public static void main(String[] args) {
		/* 12. Realiza un programa en el cual se pida el ingreso de dos números enteros num1 y num2 y el signo de la operación
		 * ("+" para sumar, "-" para restar, "/" para dividir, "*" para multiplicar y "%" para obtener el resto o módulo).
		 * Mientras que la operación no sea "f" (de FIN), aplicar la operación elegida a n1 y n2. Tener en cuenta que la división
		 * por 0 es imposible. Realizar una función para cada operación, que reciba por parámetros n1 y n2, y retorne el resultado
		 * de hacer la operación entre los dos números.
		 */
			int num1, num2;
			System.out.println("A continuación se le solicitará el primer número.");
			num1 = pedirNumero();
			System.out.println("A continuación se le solicitará el segundo número.");
			num2 = pedirNumero();
			System.out.println("Ingrese \"+\" para sumar, \"-\" para restar, \"/\" para dividir, \"*\" para multiplicar o \"%\" para obtener el resto.");
			System.out.println("Presione F para finalizar.");
			distribuirOperacion(num1, num2);	

	}
}


