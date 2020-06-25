package tp2;
import java.util.Scanner;
import java.util.Arrays;

public class ej10 {
	static Scanner entrada = new Scanner(System.in);
	
	private static int checkNum () {
		int i = 0;
		int flagImput = 0;
		while (flagImput == 0) {
			String numero = entrada.nextLine();
			if (numero.matches("[0-9]+")) {
				i = Integer.parseInt(numero);
				flagImput = 1;
			} else {
				System.out.println("El valor ingresado no es un número. Inténtelo nuevamente.");
			}
		}
		return i;
	}

	private static int ingresarCorredor() {
		int i;
		System.out.println("Ingrese número de corredor: ");
		i = checkNum();
		return i;
	}
	
	private static int ingresarTiempo() {
		int horas, minutos, segundos, tiempoTotal;
		
		System.out.println("A continuación deberá ingregar el tiempo que le llevó al corredor finalizar.");
		System.out.println("Ingrese la cantidad de horas.");
		horas = checkNum();
		
		System.out.println("Ahora ingrese la cantidad de minutos.");
		minutos = checkNum();
		
		System.out.println("Por último ingrese la cantidad de minutos.");
		segundos = checkNum();		
		tiempoTotal = devolverSegundos(horas, minutos, segundos);
		
		return tiempoTotal;
	}
	
	private static int devolverSegundos(int h, int m, int s) {
		int segundos = ((h*3600)+(m*60))+s;
		return segundos;
	}
	private static double calcularPromedio(double tiempoTotal, int numCorredores) {
		double promedio = tiempoTotal/numCorredores;
		return promedio;
	}
	private static double calcularPorcentaje(int cantidadCorredores, int menorAUnaHora) {
		double porcentaje = ((double)menorAUnaHora*100)/cantidadCorredores;
		return porcentaje;
	}
	
	public static void main(String[] args) {
		/* El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10km. El mismo consiste en ingresar,
		 * por teclado, el número del corredor, las horas, los minutos y los segundos que tardó en realizar la carrera. Tener en cuenta
		 * que al ingresar 0 como número de corredor, finaliza el programa y debe mostrar por pantalla:
		 * a) El ganador.
		 * b) El promedio en segundos de los corredores.
		 * c) El porcentaje de corredores que realizaron la carrera en menos de una hora.
		 * Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y segundos.
		 */
		
		int numCorredor = 1, tiempoCarrera = 0, contador = 0, menorAUnaHora = 0;
		int[] listaCorredores = { 0 }, tiempoCorredores = { 0 }; 
		
		while (numCorredor != 0) {
			numCorredor = ingresarCorredor();
			
			if (numCorredor != 0) {
				tiempoCarrera = ingresarTiempo();
				if (tiempoCarrera < 3600) {
					menorAUnaHora = menorAUnaHora + 1;
				}
				listaCorredores[contador] = numCorredor;
				tiempoCorredores[contador] = tiempoCarrera;
				System.out.println("Corredor registrado.");
				
				listaCorredores = Arrays.copyOf(listaCorredores, listaCorredores.length +1);
				tiempoCorredores = Arrays.copyOf(tiempoCorredores, tiempoCorredores.length +1);
				contador = contador+1;				
			} else {
				System.out.println("Saliste.");
			}
		}
		
		listaCorredores = Arrays.copyOf(listaCorredores, listaCorredores.length -1);
		tiempoCorredores = Arrays.copyOf(tiempoCorredores, tiempoCorredores.length -1);

		int tiempoTotal = 0, mejorTiempo = 999999999, ganador=0;
		double promedio = 0, porcentaje;
		promedio = calcularPromedio((double)tiempoTotal, listaCorredores.length);
		porcentaje = calcularPorcentaje(listaCorredores.length, menorAUnaHora);
		
		for (int i=0; i<listaCorredores.length; i++) {
			tiempoTotal = tiempoTotal + tiempoCorredores[i];
			if (tiempoCorredores[i] < mejorTiempo) {
				mejorTiempo = tiempoCorredores[i];
				ganador = listaCorredores[i];
			}
		}

		System.out.println("El corredor ganador es el N° " +ganador+ " con un tiempo de " +mejorTiempo+ " segundos.");
		System.out.println("El promedio de todos los tiempos es: " +promedio);
		System.out.println(porcentaje+"% de los corredores han finalizado la carrera en menos de 1h.");
	}

}
