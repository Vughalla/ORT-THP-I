package tp1;
import java.util.Scanner;

public class ej11 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void informarError() {
		System.out.println("Error. El valor ingresado es incorrecto.");
		cerrarPrograma(1);
	}
	public static void checkDate(String a, String m, String d) {
		int anioInt = Integer.parseInt(a);
		int mesInt = Integer.parseInt(m);
		int diaInt = Integer.parseInt(d);
		int diasMax = 0;
		if (mesInt < 1 || mesInt > 12) {
			System.out.println("El mes ingresado es incorrecto.");
			informarError();
		}
		if (diaInt < 1 || diaInt > 31) {
			System.out.println("El día ingresado es incorrecto.");
			informarError();
		} else {
			if (mesInt == 1 || mesInt == 3 || mesInt == 5 || mesInt == 7 || mesInt == 8 || mesInt == 10 || mesInt == 12) {
				diasMax = 31;
			}
			if (mesInt == 4 || mesInt == 6 || mesInt == 9 || mesInt == 11) {
				diasMax = 30;
			}
			if (mesInt == 2) {
				if ((anioInt % 4 == 0) && ((anioInt % 100 != 0) || (anioInt % 400 == 0))) {
					diasMax = 29;
				} else {
					diasMax = 28;
				}
			}
			if (diaInt > diasMax) {
				System.out.println("Se han ingresado más días de los que posee el mes");
				informarError();
			}
		}
	}
	public static void main(String[] args) {
		/*
		11. Realizá un programa que resuelva el siguiente problema:
		Deberás solicitar el ingreso de una fecha de compra (String en el siguiente formato:
		YYYYMMDD), un nombre de comprador, un nombre de producto y una cantidad y precio del
		producto comprado. Mostrá a modo de ticket, la información ingresada y el monto a pagar.
		Modelo de Ticket:
		Fecha de Compra: YYYYMMDD
		Nombre del Comprador: xxxxx xxxxx
		Producto solicitado: xxxxx
		Cantidad solicitada: xx
		Precio Unitario: $xxx
		Total a Pagar: $xxxxx
		 */

		String fechaTicket, anio, mes, dia, nombreComprador, producto;
		int cantProd = 0, precioUnitario = 0, montoTotal = 0;
			
		System.out.println("Ingrese una fecha en formato YYYYmmdd: ");
		fechaTicket = entrada.next();
		
		if (fechaTicket.matches("[0-9]+") && fechaTicket.length() == 8) {
			anio = fechaTicket.substring(0,4);
			mes = fechaTicket.substring(4,6);
			dia = fechaTicket.substring(6,8);
			checkDate(anio, mes, dia);
		}	else {
			informarError();
		}
		
		System.out.println("Ingrese el nombre del comprador: ");
		nombreComprador = entrada.next();
			
		System.out.println("Ingrese el producto solicitado: ");
		producto = entrada.next();
			
		try {
			System.out.println("¿Cuántos productos desea llevar?");
			cantProd = entrada.nextInt();
			if (cantProd <= 0) {
				informarError();
			}
		} catch (Exception e) {
			informarError();
		}
		
		try {
			System.out.println("Indique el precio del producto");
			precioUnitario = entrada.nextInt();
			if (precioUnitario <= 0) {
				informarError();
			}			
		} catch (Exception e) {
			informarError();
		}

		montoTotal = (cantProd*precioUnitario);

		System.out.println("\nFecha de compra: " + fechaTicket + "\nNombre del Comprador: " + nombreComprador + "\nProducto solicitado: " + producto + "\nCantidad solicitada: " + cantProd + "\nPrecio Unitario: " + precioUnitario + "\nTotal a Pagar: " + montoTotal);	
		cerrarPrograma(0);
	}
}