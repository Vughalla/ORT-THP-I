package tp2;
import java.util.Scanner;

public class ej14 {
	static Scanner entrada = new Scanner(System.in);
	static int MINVIAJES = 0;
	static int MAXVIAJES = 1000;
	static double ABONOBASE = 8500;
	static double COSTOVIAJEADICIONAL = 100;
	static int CANTVIAJEDESC = 30;
	static double DESCUENTO = 10;

	private static void ingresarNombre() {
		String nombre = "";
		int flag = 0;
		while (flag == 0) {
			System.out.println("Ingrese el nombre de la empresa.");
			nombre = entrada.nextLine();
			if (!nombre.isEmpty()) {
				flag = 1;
			} else {
				System.out.println("No se ingresó el nombre, intente nuevamente.");
			}
		}
	}
	
	private static int ingresarViajesAdic() {
		int viajes = 0, flag;
		flag = 0;
		while (flag == 0) {
			System.out.println("Ingrese la cantidad de viajes adicionales hechos.");
			viajes = entrada.nextInt();
			if (viajes>=MINVIAJES && viajes<=MAXVIAJES) {
				flag = 1;
			} else {
				System.out.println("Error, puede ingresar entre "+MINVIAJES+"-"+MAXVIAJES+" viajes adicionales.");
			}
		}
		return viajes;
	}
	
	private static double calcularCosto(int viajesAdicionales) {
		double costo = 0;
		if (viajesAdicionales < CANTVIAJEDESC) {
			costo = ABONOBASE + (viajesAdicionales*COSTOVIAJEADICIONAL);
		} else {
			costo = (ABONOBASE + (viajesAdicionales*COSTOVIAJEADICIONAL))-(DESCUENTO/100);
		}
		return costo;
	}
	
	private static String check() {
		String rta;
		int flag = 0;
		System.out.println("¿Desea agregar una nueva empresa? S/N");
		//Por alguna razón es necesario repetir la siguiente línea para que no entre directamente al else. Si la repetición
		//nunca frena para ingresar el valor de rta.
		rta = entrada.nextLine();
		while (flag == 0) {
			rta = entrada.nextLine();
			if (rta.toLowerCase().matches("s") || rta.toLowerCase().matches("n")) {
				flag = 1;
			} else {
				System.out.println("Error, ingrese S/N.");
			}
		}
		return rta;
	}
	
	public static void main(String[] args) {
		/* 14. Una empresa dedicada al transporte de documentación necesita procesar su facturación mensual a partir de los
		 * resúmenes de viajes realizados para cada uno de sus clientes.
		 * Quieren saber también cuál es el promedio pagado por empresa y el valor de la factura más cara. Para el cálculo
		 * de cada factura se sabe que por mes cada empresa tiene derecho a dos viajes diarios libres con un abono de $8500,
		 * cobrando además por cada viaje adicional $100. En caso de que la empresa supere los 30 viajes adicionales, por
		 * promoción, se le hará un descuento del 10% sobre el total mensual facturado. Por cada empresa nos informan el nombre
		 * de la misma y la cantidad de viajes adicionales (entero >= 0, siempre menor a 1000), y nosotros debemos mostrar en
		 * pantalla su nombre y el importe total de la factura.
		 * 
		 * Por ejemplo: La empresa "Los Nenes", que necesitó hacer 18 viajes adicionales en el mes, deberá pagar una factura de
		 * $10300 (Precio base + viajes adicionales * $100 = $8500 + $1800). Por pantalla, entonces, deberá mostrarse: La empresa
		 * Los Nenes debe abonar $10300. En cambio, la empresa "software Industrial SRL", que realizó 150 viajes adicionales,
		 * deberá pagar una factura de $21150 (Precio base + viajes adicionales * $100 - bonificación 10% = $8500 + $15000 - $2350).
		 * Aquí debe mostrarse: La empresa Software Industrial SRL debe abonar $21150. Si éstas fueran todas las empresas, al
		 * finalizar se mostrará el promedio (total acumulado / cantidad de empresas = 34150 /2): EL promedio pagado entre las
		 * empresas en el pasado mes fue de $15725. La mayor factura es por un total de $21150.
		 */

		/*
		ingresar nombre de empresa
		ingresar cantidad de viajes ADICIONALES que hizo en el mes
		0 viajes adicionales paga basico --> 8500
		viaje adicional $100
		viajesAdicionales >= 30 ===> Descuento del 10% sobre el total
		cant de viajes adicionales 0 a 1000
		
		informar "la empresa debera pagar $xxxxx"
		"el promedio pagado durante el mes pasado fue de $xxxxx"
		"la mayor factura fue de $xxxxx"
		*/
		
		String agregarEmpresa = "s";
		int viajesAdicionales, empresasIngresadas = 0;
		double costoViaje, maxCosto = 0, acumCostos = 0, promedio;
		
		while (agregarEmpresa.matches("s")) {
			ingresarNombre();
			viajesAdicionales = ingresarViajesAdic();
			costoViaje = calcularCosto(viajesAdicionales);
			acumCostos = acumCostos + costoViaje;
			
			if (costoViaje > maxCosto) {
				maxCosto = costoViaje;
			}
			System.out.println("La empresa deberá pagar $" +costoViaje);
			empresasIngresadas = empresasIngresadas+1;
			agregarEmpresa = check();
		}
		promedio = acumCostos/empresasIngresadas;
		System.out.println("El promedio pagado entre las empresas en el pasado mes fue de $" +promedio);
		System.out.println("La mayor factura fue de $" +maxCosto);
		
		entrada.close();
	}

}
