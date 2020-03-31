package TP1;

import java.util.Scanner;

public class ej10 {
	static final int HORA_APERTURA = 10;
	static final int HORA_CIERRE = 18;
	static Scanner entrada = new Scanner(System.in);
	
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void main(String[] args) {
		/*
		10. Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un programa que informe 
		si un estacionamiento se encuentra o no abierto según la hora ingresada por el usuario.
		Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs.
		(Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18).
		Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos setear una
		variable booleana llamada estaAbierto en true o false, según corresponda, e informar por
		pantalla mediante la misma si el estacionamiento se encuentra abierto o no.
		Obs: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, mostrar el
		mensaje: “Ha ingresado una hora incorrecta”
		*/

		try {
			System.out.println("Ingrese la hora:");
			int hora = entrada.nextInt();
			boolean estaAbierto = hora >= HORA_APERTURA && hora <= HORA_CIERRE;
			
			if (hora < 0 || hora > 24) {
				System.out.println("Ha ingresado una hora incorrecta");
				cerrarPrograma(1);
			} 
			
			if (estaAbierto) {
				System.out.println("El estacionamiento se encuentra abierto.");
			} else {
				System.out.println("El estacionamiento se encuentra cerrado.");
			}
			cerrarPrograma(0);
		} catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}

