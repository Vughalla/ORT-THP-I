package modeloParcial1;

public class Test {
	
	public static void main(String[] args) {
		

		Edificio edificio = new Edificio("Caseros", 99);
		Departamento depto1 = new Departamento(1, "Juan Gomez", "34.505.219");
		Departamento depto2 = new Departamento(2, "Gomez", "34.505.219");
		Departamento depto3 = new Departamento(3, "Juan", "34.505.219");
		Departamento depto4 = new Departamento(4, "Cecilia", "34.505.219");
		edificio.agregarUnidad(depto1);
		edificio.agregarUnidad(depto2);
		edificio.agregarUnidad(depto3);
		edificio.agregarUnidad(depto4);
		
		edificio.actualizarSaldo(1, -100);

		edificio.pasarAMoroso(1);
		
		
	}

}
