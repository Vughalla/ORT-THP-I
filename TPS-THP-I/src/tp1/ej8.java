package tp1;
import java.util.Scanner;
public class ej8 {
	static Scanner entrada = new Scanner(System.in);
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void informarDia(int numDia) {
		String[] dias = {"Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo"};
		System.out.println("Hoy es " +dias[numDia-1]+ ".");
		cerrarPrograma(0);
	}
	public static void main(String[] args) {
		/*
		8. Suponiendo que el primer d�a de la semana es el Domingo, pedir un n�mero entre 1 y 7
		(inclusive) y mostrar el nombre del d�a correspondiente. Si el d�a no est� en el rango
		permitido debe emitir por pantalla el mensaje de error "El d�a ingresado no es v�lido".
		 */
		try {
			System.out.println("Ingrese un n�mero entre 1 y 7.");
			int dia = entrada.nextInt();
	
			if (dia > 0 && dia < 8) {
				informarDia(dia);
			} else {
				System.out.println("El n�mero ingresado no es v�lido.");
				cerrarPrograma(1);
			}
		} catch(Exception e) {
			System.out.println("Error, ingrese valores num�ricos.");
			cerrarPrograma(1);
		}
	}
}

