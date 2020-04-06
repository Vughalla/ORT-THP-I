package TP2;
import java.util.Scanner;
import java.util.Arrays;

public class ej6 {
	private static Scanner entrada = new Scanner(System.in);
	private static StringBuilder constructor = new StringBuilder();
	
	private static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	
	private static int ingresarNumero() {
		int flag = 0;
		int i = 0;
		while ( flag == 0 ) {
			System.out.print("Ingrese el promedio: ");
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				if (i >= 0 && i <= 10) {
					System.out.println("Promedio ingresado.");
					flag = 1;	
				} else {
					System.out.println("Error, ingrese un promedio entre 0 y 10.");
				}
			} else {
				System.out.println("Error, ingrese un promedio entre 0 y 10.");
			}
		}
		return i;
	}
	
	private static String ingresarNombre(int numeroAlumno) {
		numeroAlumno = numeroAlumno+1;
		int flag = 0;
		String nombre = "";
		while ( flag == 0 ) {
			System.out.println("Ingrese el nombre del alumno N°" +numeroAlumno+ ": ");
			nombre = entrada.nextLine();
			if (nombre.toLowerCase().matches("[a-z]+")) {
				flag = 1;
			} else {
				System.out.println("El nombre sólo debe contener letras. Inténtelo nuevamente.");
			}
		}
		return nombre;
	}
	
	public static void main(String[] args) {
		/*
		 * 6.Realizá un programa en el cual se pida el nombre y el promedio de 10 alumnos.
		 * Al finalizar, debe mostrar por pantalla el nombre y el promedio del mejor.
		 */
		int mayorProm = -1;
		boolean mejoresAlumnos = false;
		String[] mejorAlumno = { "" };
		
		for (int i=0; i<3; i++) {
			String nombre = ingresarNombre(i);
			int prom = ingresarNumero();
			System.out.println("Se ingreso el alumno: " +nombre+ ". Promedio: " +prom);
			
			if (prom > mayorProm) {
				mayorProm = prom;
				mejorAlumno[mejorAlumno.length - 1] = nombre;
			} else if (prom == mayorProm) {
			      mejorAlumno = Arrays.copyOf(mejorAlumno, mejorAlumno.length + 1);
			      mejorAlumno[mejorAlumno.length - 1] = nombre;
			      mejoresAlumnos = true;
			}
		}
		
		for (String i : mejorAlumno) {
		    constructor.append(i+". ");
		}
		
		String alumnos = constructor.toString();
		if (mejoresAlumnos) {
			System.out.println("Los mejores alumnos son: " + alumnos +"Promedio :" +mayorProm);
		} else {
		System.out.println("El mejor alumno es: " + alumnos +". Promedio :" +mayorProm);
		}
		cerrarPrograma(0);
	}
}

