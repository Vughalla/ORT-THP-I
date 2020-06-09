package tp2;
import java.util.Scanner;

public class ej15 {
	static Scanner entrada = new Scanner(System.in);
	static int CODMIN = 10001;
	static int CODMAX = 99999;
	static double COSTOABONOBASE = 2;
	static int TIEMPODESCB = 5;
	static double COSTOABONOB = 1.5;
	static double COSTOABONOC = 1;
	static double TOPEABONOC = 10;
	static int LLAMADACORTA = 6;
	
	private static int ingresarCodCliente() {
		int codCliente = 0, flag;
		flag = 0;
		while (flag == 0) {
			System.out.println("Ingrese el código de cliente.");
			codCliente = entrada.nextInt();
			if (codCliente == 0 || codCliente>=CODMIN && codCliente<=CODMAX) {
				flag = 1;
			} else {
				System.out.println("Error, puede ingresar valores entre "+CODMIN+"-"+CODMAX+".");
			}
		}
		return codCliente;
	}
	
	private static int ingresarDurLlamada() {
		int durLlamada = 0, flag;
		flag = 0;
		while (flag == 0) {
			System.out.println("Ingrese la duración de la llamada.");
			durLlamada = entrada.nextInt();
			if (durLlamada >= 0) {
				flag = 1;
			} else {
				System.out.println("Error, la llamada no puede durar menos de 1.");
			}
		}
		return durLlamada;
	}
	
	private static String ingresarAbono() {
		String abono = "";
		int flag = 0;
		System.out.println("Ingrese el tipo de abono: A / B / C");

		while (flag == 0) {
			abono = entrada.nextLine();
			if (abono.toLowerCase().matches("a") || abono.toLowerCase().matches("b") || abono.toLowerCase().matches("c")) {
				flag = 1;
			} else {
				System.out.println("Error, ingrese A / B / C");
			}
		}
		return abono;
	}
	
	private static double calcularImporte(String tipoAbono, int durLlamada) {
		double importe = 0;
		
		if (tipoAbono.matches("a")) {
			importe = durLlamada * COSTOABONOBASE;
		} else if (tipoAbono.matches("b")) {
			if (durLlamada > TIEMPODESCB) {
				importe = (durLlamada * COSTOABONOBASE)+((TIEMPODESCB-durLlamada)*COSTOABONOB);
			} else {
				importe = durLlamada * COSTOABONOBASE;
			}
		} else {
			importe = durLlamada * COSTOABONOC;
			if (importe > TOPEABONOC) {
				importe = TOPEABONOC;
			}
		}	
		return importe;
	}
	
	public static void main(String[] args) {
		/* 15.Una empresa de telefonía nos pide escribir un programa que le brinde información sobre el consumo
		 * de sus clientes residenciales. Para ello se ingresa, por cada una de las llamadas realizadas en el último mes:
		 * - Código de cliente (int de 5 digitos, entre 10001 y 99999, 0=FIN)
		 * - Duración de la llamada nro. (int>0)
		 * - Tipo de abono("a", "b", o "c").
		 * 
		 * Para calcular el importe de cada llamada, nos informan que el costo por minuto, de acuerdo al tipo de abono, es el sig:
		 * - Abono A: => $2 el minuto.
		 * - Abono B: => Hasta 5 minutos, $2 el minuto. Más de 5 minutos, $1,5 el min.
		 * - Abono C: => $1 el minuto hasta un máximo de $10 (Ej. si habla 15 min paga $10).
		 * 
		 * Informe:
		 * 1. El importe acumulado a recaudar para cada tipo de abono.
		 * 2. La cantidad de minutos de la llamada más larga.
		 * 3. La cantidad de llamadas de menos de 6 minutos.
		 * 4. El precio promedio por llamada.
		 */

		int codCliente = 1, durLlamada, maxDurLlamada = 0, acumLlamadasCortas = 0, cantLlamadas = 0;
		String tipoAbono;
		double importe, promedioImportes=0;
		double importeA = 0, importeB = 0, importeC = 0, acumImportes = 0;
		
		while (codCliente != 0) {
			codCliente = ingresarCodCliente();
			if (codCliente != 0) {
				durLlamada = ingresarDurLlamada();
				
				if (durLlamada > maxDurLlamada) {
					maxDurLlamada = durLlamada;
				}
				if (durLlamada < LLAMADACORTA) {
					acumLlamadasCortas = acumLlamadasCortas+1;
				}
				
				tipoAbono = ingresarAbono();
				importe = calcularImporte(tipoAbono, durLlamada);
				acumImportes = acumImportes + importe;
				
				if (tipoAbono.toLowerCase().matches("a")) {
					importeA = importeA + importe;
				} else if (tipoAbono.toLowerCase().matches("b")) {
					importeB = importeB + importe;
				} else if (tipoAbono.toLowerCase().matches("c")) {
					importeC = importeC + importe;
				}
				
				cantLlamadas = cantLlamadas+1;
				System.out.println("Cliente ingresado.");
			}
			promedioImportes = acumImportes / cantLlamadas;
		}
		if (cantLlamadas > 0) {
			System.out.println("Se acumularon $" +importeA+ " para el abono A.");
			System.out.println("Se acumularon $" +importeB+ " para el abono B.");
			System.out.println("Se acumularon $" +importeC+ " para el abono C.");
			System.out.println("La llamada más larga duró " +maxDurLlamada);
			System.out.println("Se hicieron " +acumLlamadasCortas+" menores a "+LLAMADACORTA+ " minutos.");
			System.out.println("El promedio de todos los importes es de $"+promedioImportes);
		} else {
			System.out.println("No se registraron clientes durante la ejecución del programa.");
		}

		entrada.close();
	}
}
