package tp2;
import java.util.Arrays;
import java.util.Scanner;

public class ej9 {
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
	
	private static double sacarPromedio(int num1, int num2, int num3) {
		int suma = num1+num2+num3;
		double prom = (double)suma/3;
		return prom;
	}
	
	public static void main(String[] args) {
		/* 9. Realizar un programa que le pida al usuario que ingrese 5 veces 3 valores enteros cada vez. Emiti el promedio
		 * de cada grupo.
		 */
		
		int[] valores = { 0 };
		double[] promedios = { 0 };
		
		for (int i=0; i<5; i++) {
			System.out.println("Ingrese el triplete de números: " +(i+1));	
			for (int j=0; j<3; j++) {
				valores[valores.length - 1] = pedirNumero();
				valores = Arrays.copyOf(valores, valores.length + 1);
			}
			promedios[i] = sacarPromedio(valores[valores.length - 4], valores[valores.length - 3], valores[valores.length - 2]);
			promedios = Arrays.copyOf(promedios, promedios.length + 1);
			System.out.println("El promedio de: " +valores[valores.length - 4]+ " + " +valores[valores.length - 3]+ " + " +valores[valores.length - 2]+ " es: " +promedios[i]);
		}
		
		entrada.close();
	}
		
}
