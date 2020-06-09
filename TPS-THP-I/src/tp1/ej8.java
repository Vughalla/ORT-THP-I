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
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		System.out.println("Hoy es " +dias[numDia-1]+ ".");
		cerrarPrograma(0);
	}
	public static void main(String[] args) {
		/*
		8. Suponiendo que el primer día de la semana es el Domingo, pedir un número entre 1 y 7
		(inclusive) y mostrar el nombre del día correspondiente. Si el día no está en el rango
		permitido debe emitir por pantalla el mensaje de error "El día ingresado no es válido".
		 */
		try {
			System.out.println("Ingrese un número entre 1 y 7.");
			int dia = entrada.nextInt();
	
			if (dia > 0 && dia < 8) {
				informarDia(dia);
			} else {
				System.out.println("El número ingresado no es válido.");
				cerrarPrograma(1);
			}
		} catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}

