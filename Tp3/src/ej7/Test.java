package ej7;

public class Test {

	public static void main(String[] args) {
		Gato gato = new Gato(100);
		Raton raton = new Raton(100);
		
		if (gato.alcanzar(raton, 10)) {
			System.out.println("Lo alcanz�.");
		} else {
			System.out.println("No lo alcanz�.");
		}
		
		if (gato.alcanzar(raton, 50)) {
			System.out.println("Lo alcanz�.");
		} else {
			System.out.println("No lo alcanz�.");
		}
		
		if (gato.alcanzar(raton, 80)) {
			System.out.println("Lo alcanz�.");
		} else {
			System.out.println("No lo alcanz�.");
		}
	}

}
