package ej3;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	
	private static String cargarDatos(String mje) {
		String dato = "";
		System.out.println("Ingresa el siguiente dato: " +mje);
		dato = scanner.next();
		return dato;
	}
	
	private static double calcularTotal() {
		double total = 0;
		for(Producto producto: productos) {
			total = total + (producto.getPrecio() * producto.getCantidad());
		}
		return total; 
	}
	
	private static void tiket(double total) {
		System.out.println("Se compró:");
		for(Producto producto: productos) {
			System.out.println(producto.toString());
		}
		System.out.println("El importe total de la compra es de: "+total);
	}
	
	public static void main(String[] args) {
		String continuar = "";
		String nombre, precio, cantidad;
		double total;
		
		do {
			nombre = cargarDatos("Nombre del producto.");
			cantidad = cargarDatos("Cantidad del producto a llevar.");
			precio = cargarDatos("Precio del producto.");
			Producto producto = new Producto(nombre, Integer.parseInt(cantidad), Double.parseDouble(precio));
			productos.add(producto);
			System.out.println("Pulse cualquier tecla para continuar...O pulse F para salir.");
			continuar = scanner.next();
		} while (!continuar.toLowerCase().matches("f"));
	
		total = calcularTotal();
		tiket(total);
		
	}

}
