package TP2;
import java.util.Scanner;

public class ej12 {
	static Scanner entrada = new Scanner(System.in);
	
	private static int pedirNumero() {
		int i = 0;
		int flagImput = 0;
		while (flagImput == 0) {
			System.out.println("Ingrese un n�mero");
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				System.out.println("N�mero ingresado");
				flagImput = 1;					
			} else {
				System.out.println("El valor ingresado no es un n�mero. Int�ntelo nuevamente.");
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
				System.out.println("La operaci�n ingresada no es v�lida, intente nuevamente.");
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
			System.out.println("Error, est� intentando dividir por 0. Ingrese el segundo n�mero nuevamente.");
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
		/* 12. Realiza un programa en el cual se pida el ingreso de dos n�meros enteros num1 y num2 y el signo de la operaci�n
		 * ("+" para sumar, "-" para restar, "/" para dividir, "*" para multiplicar y "%" para obtener el resto o m�dulo).
		 * Mientras que la operaci�n no sea "f" (de FIN), aplicar la operaci�n elegida a n1 y n2. Tener en cuenta que la divisi�n
		 * por 0 es imposible. Realizar una funci�n para cada operaci�n, que reciba por par�metros n1 y n2, y retorne el resultado
		 * de hacer la operaci�n entre los dos n�meros.
		 */
			int num1, num2;
			System.out.println("A continuaci�n se le solicitar� el primer n�mero.");
			num1 = pedirNumero();
			System.out.println("A continuaci�n se le solicitar� el segundo n�mero.");
			num2 = pedirNumero();
			System.out.println("Ingrese \"+\" para sumar, \"-\" para restar, \"/\" para dividir, \"*\" para multiplicar o \"%\" para obtener el resto.");
			System.out.println("Presione F para finalizar.");
			distribuirOperacion(num1, num2);	

	}
}


