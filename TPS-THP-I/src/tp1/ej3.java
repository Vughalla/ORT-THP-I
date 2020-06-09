package tp1;

import java.util.Scanner;

public class ej3 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void main(String[] args) {
		/*
		3. Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que
		ingrese su nombre, y luego muestre un mensaje de bienvenida incluyendo el mismo. 
		*/
			String nombre;
						
			System.out.println("Ingrese su nombre: ");		
			nombre = entrada.next();
			System.out.println("Hola "+nombre+".");
			cerrarPrograma(0);
	}
}
