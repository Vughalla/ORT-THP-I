package ej2;

public class Test {

	public static void main(String[] args) {
		Cd cd = new Cd();
		Cancion cancion1 = new Cancion();
		Cancion cancion2 = new Cancion();
		Cancion cancion3 = new Cancion();
		Cancion cancion4 = new Cancion();
		Cancion cancion5 = new Cancion();
		Cancion cancion6 = new Cancion();
		
		
		System.out.println("Canciones en el cd: " +cd.numeroCanciones());
		cd.agregaCancion(cancion1);
		cd.agregaCancion(cancion2);
		cd.agregaCancion(cancion3);
		cd.agregaCancion(cancion4);
		cd.agregaCancion(cancion5);
		cd.agregaCancion(cancion6);
		System.out.println("Canciones en el cd: " +cd.numeroCanciones());
		cd.elimina(1);
		System.out.println("Canciones en el cd: " +cd.numeroCanciones());
		cd.grabaCancion(1, cancion6);
		System.out.println("Canciones en el cd: " +cd.numeroCanciones());
		cd.grabaCancion(2, cancion5);
		System.out.println("Canciones en el cd: " +cd.numeroCanciones());
		
		
		
	}

}
