package ej1;

public class Test {

	public static void completarDatos(Persona persona, String nombre, String apellido, String direccion) {
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		persona.setDireccion(direccion);
	}
	
	public static void mostrarPersona(Persona persona) {
		System.out.println(persona.toString());
		System.out.println("Nombre: " +persona.getNombre());
		System.out.println("Apellido: " +persona.getApellido());
		System.out.println("Direccion: " +persona.getDireccion());
	}
	
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		completarDatos(persona1, "Diego", "Díaz", "Yatay 240");
		completarDatos(persona2, "Pablo", "Gómez", "Av. del Libertador 6796");
		mostrarPersona(persona1);
		mostrarPersona(persona2);
		
	}
	
	

}
