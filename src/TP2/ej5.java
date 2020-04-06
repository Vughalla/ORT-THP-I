package TP2;
import java.util.Scanner;

public class ej5 {
	private static int LIMITE = 20;
	private static Scanner entrada = new Scanner(System.in);
	
	private static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	
	private static int recibirNumero() {
		int flag = 0;
		int i = 0;
		while ( flag == 0 ) {
			System.out.println("Ingrese un número");
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
	private static float sacarPromedio(int total, int vuelta) {
		float prom = (float)total/vuelta;
		
		return prom;
	}
	
	public static void main(String[] args) {
		float promedio = 0;
		int contador = 1;
		int total = 0;
		while (promedio < LIMITE ) {
			int num = recibirNumero();
			total = total + num;
			promedio = sacarPromedio(total, contador);
			System.out.println("El promedio actual es " +promedio);
			System.out.println("Cantidad de valores leidos: " +contador);
			contador++;
			
		}
		
		cerrarPrograma(0);
	}
}
