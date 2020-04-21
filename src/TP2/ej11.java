package TP2;
import java.util.Scanner;

public class ej11 {
	static Scanner entrada = new Scanner(System.in);
	
	private static int pedirNumero() {
		int i = 0;
		int flagImput = 0;
		while (flagImput == 0) {
			System.out.println("Ingrese un número");
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				if (i > 0) {
					System.out.println("Número ingresado");
					flagImput = 1;					
				} else {
					System.out.println("Error, debe ingresar un número positivo.");
				}

			} else {
				System.out.println("El valor ingresado no es un número. Inténtelo nuevamente.");
			}
		}
		return i;
	}
	private static int sumarNumeros(int num1, int num2) {
		int total = 0;
		for (int i=0; i < num2; i++) {
		total = total + num1;	
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		/* 11. Realiza un programa que al ingresar dos números enteros positivos llamados A y B se calcule el producto de éstos
		 * a través de sumas sucesivas. Por ejemplo, si los números son 4 y 2, hacer 4 + 4; si son 5 y 3, hacer 5+5+5.
		 * ¿Qué pasa si la diferencia entre los dos números es muy grande? ¿Influye cuál se usa para sumar y cuál para contar
		 * la cantidad de sumas hechas?
		 */
		 int A, B, total = 0;
		 System.out.println("A continuación se le solicitará el número A.");
		 A = pedirNumero();
		 System.out.println("A continuación se le solicitará el número B.");
		 B = pedirNumero();

		 if (A > B || A == B) {
			 total = sumarNumeros(A, B);
		 } else if (B > A) {
			 total = sumarNumeros (B, A);
		 }
		 System.out.println("El total es: " +total);
		 entrada.close();
		 
		 //¿Influye cuál se usa para sumar y cuál para contar la cantidad de sumas hechas?
		 
		 /* Rta: Al hacer la cuenta dentro de un bucle for, influye en la cantidad de ciclos que deberán cumplirse si se itera con
		  * el mayor de los números.
		  */
	}

}
