package ej6;

public class Test {

	public static void main(String[] args) {
		Automovil auto = new Automovil("Ford", "Fiesta", "ABCD123", 40);
		System.out.println(auto.toString());
		System.out.println("Seteo el rendimiento por litro en 10.");
		auto.setRendimientoPorLitro(10);
		System.out.println(auto.toString());
		System.out.println("Cargo 20 lts de combustible.");
		auto.cargarCombustible(20);
		System.out.println(auto.toString());
		System.out.println("Intente recorrer 180 km y recorrí " +auto.viajar(180));
		System.out.println(auto.toString());
		System.out.println("Intente recorrer 50 km y recorrí " +auto.viajar(50));
		System.out.println(auto.toString());
	}

}
