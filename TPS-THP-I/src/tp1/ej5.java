package tp1;
import java.util.Scanner;

public class ej5 {
	static Scanner entrada = new Scanner(System.in);
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static int pedirNumero() {
		System.out.print("Por favor ingrese un número: ");
		int num = entrada.nextInt();
		System.out.println("Número ingresado.");
		return num;
	}
		
	public static void main(String[] args) {
		/*
		5. Realizá un programa que, dados dos números enteros num1 y num2 cargados desde
		teclado por el usuario, muestre el resultado de la división del primero por el segundo
		siguiendo el formato num1 + “ / “ + num2 + “ = “ + resultado.
		En el caso de que el segundo valor num2 sea cero, mostrar el siguiente mensaje de error:
		“No se puede dividir por cero”.
		*/
		try {
			int num1, num2;
			num1 = pedirNumero();
			num2 = pedirNumero();
			if (num2 == 0) {
				System.out.println("No se puede dividir por cero");
				cerrarPrograma(1);
			}
			double div = (double)num1/num2;
			System.out.println(num1 + " / " + num2 + " = " + div);
	
			cerrarPrograma(0);
		}  catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}
