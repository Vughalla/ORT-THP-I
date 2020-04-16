package TP2;
import java.util.Scanner;

public class ej8 {
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
	private static boolean esMultiplo(int numero1, int numero2) {
		boolean multiplo = false;
		double rta = (double)numero1 % numero2;
		if (rta == 0) {
			multiplo = true;
		}
		return multiplo;
	}
	public static void main(String[] args) {
		/* 8. Escribi la función booleana esMultiplo(int num1, int num2) que recibirá dos enteros y devolverá verdadero cuando
		 * el primero  sea múltiplo del segundo (de lo contrario devolverá falso).
		 */
		
		int num1 = pedirNumero();
		int num2 = pedirNumero();
		boolean resultado = esMultiplo(num1,num2);
		
		if (resultado) {
			System.out.println(num1+" y " +num2+ " son multiplos.");
		} else {
			System.out.println(num1+" y " +num2+ " no son multiplos.");
		}
		
	}

}
