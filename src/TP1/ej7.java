package TP1;
import java.util.Scanner;
public class ej7 {
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
	public static void mayorNumero(int num) {
		System.out.println("El mayor número es " +num+ ".");
		cerrarPrograma(0);
	}
	
	public static void main(String[] args) {
		/*
		7. Realizá un programa que al ingresar por teclado tres números enteros num1, num2 y
		num3, muestre el valor del mayor de todos.
		En caso de igualdad entre los tres imprimir "Los números son iguales".
		Test1: num1 = 12, num2 = 4, num3= 7. Resultado esperado: El mayor número es num1.
		Test2: num1 = 2, num2 = 65, num3= 8. Resultado esperado: El mayor número es num2.
		Test3: num1 = 3, num2 = 10, num3= 28. Resultado esperado: El mayor número es num3.
		Test4: num1 = 5, num2 = 5, num3= 5. Resultado esperado: Los números son iguales.
		 */
		try{
			int num1, num2, num3;
			num1 = pedirNumero();
			num2 = pedirNumero();
			num3 = pedirNumero();
			
			if (num1 == num2 && num2 == num3) {
				System.out.println("Los números son iguales.");
				cerrarPrograma(0);
			} else {
				if (num1 > num2) {
					if (num1 > num3) {
						mayorNumero(num1);
					} else {
						mayorNumero(num3);
					}
				} else {
					if (num2 > num3) {
						mayorNumero(num2);
					} else {
						mayorNumero(num3);
					}
				}
			}
		} catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}
