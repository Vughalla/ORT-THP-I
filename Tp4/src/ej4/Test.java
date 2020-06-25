package ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	private static ArrayList<Auto> autos = new ArrayList<Auto>();
	private static Scanner scanner = new Scanner(System.in);
	
	private static void buscarAutoPorMarca(String marca) {
		ArrayList<Auto> listaMarcas = new ArrayList<Auto>();
		for(Auto auto: autos) {
			if(auto.getMarca().toLowerCase().matches(marca.toLowerCase())) {
				listaMarcas.add(auto);
			}
		}
		listarAutos(listaMarcas, marca);
	}
	
	private static void filtrarAutosPorKm(int km) {
		ArrayList<Auto> menosDeKm = new ArrayList<Auto>();
		for(Auto auto: autos) {
			if(auto.getKm() < km) {
				menosDeKm.add(auto);
			}
		}
		listarAutos(menosDeKm, km);		
	}
	
	private static Auto masUtilizado() {
		Auto masUtilizado = new Auto("","","",0);
		autos.add(masUtilizado);
		for(Auto auto: autos) {
			if (masUtilizado.getKm() < auto.getKm()) {
				masUtilizado = auto;
			}
		}
		autos.remove(autos.size()-1);
		return masUtilizado;
	}
	
	private static String cargarDatos(String mje) {
		String dato = "";
		System.out.println("Ingresa el siguiente dato: " +mje);
		dato = scanner.next();
		return dato;
	}
	
	private static void listarAutos() {
		System.out.println("Los autos son:");
		for(Auto auto: autos) {
			System.out.println(auto.toString());
		}		
	}

	private static void listarAutos(ArrayList<Auto> listaAutos, int km) {
		System.out.println("Los autos con menos de "+km+" Km son:");
		for(Auto auto: listaAutos) {
			System.out.println(auto.toString());
		}		
	}
	
	private static void listarAutos(ArrayList<Auto> listaAutos, String marca) {
		System.out.println("Los autos de la marca "+marca+" son:");
		for(Auto auto: listaAutos) {
			System.out.println(auto.toString());
		}		
	}
	
	private static void listarAutoMasUsado(Auto auto) {
		System.out.println("El auto más usado es:");
			System.out.println(auto.toString());
	}
	
	public static void main(String[] args) {
		Auto masUsado;
		String continuar = "s";
		String matricula, marca, modelo, km;
		
		do {
			matricula = cargarDatos("Matricula");
			marca = cargarDatos("Marca");
			modelo = cargarDatos("Modelo");
			km = cargarDatos("Km");
			Auto auto = new Auto(matricula, marca, modelo, Integer.parseInt(km));
			autos.add(auto);
			System.out.println("Pulse cualquier tecla para continuar...O pulse F para salir.");
			continuar = scanner.next();
		} while (!continuar.toLowerCase().matches("f"));
	
		listarAutos();
		masUsado = masUtilizado();
		listarAutoMasUsado(masUsado);
		buscarAutoPorMarca("Peugeot");
		filtrarAutosPorKm(30000);
		scanner.close();
		
		
	}

}
