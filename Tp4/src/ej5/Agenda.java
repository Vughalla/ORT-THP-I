package ej5;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;
	
	/**
	 * Constructor de la clase Agenda.
	 */
	public Agenda() {
		personas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	public void eliminarPersona(Persona persona) {
		personas.remove(persona);
	}
	
	public void listarPersonas() {
		for(Persona persona: personas) {
			System.out.println(persona.toString());
		}
		System.out.println("-------------");
	}
	
	private void listarPersona(Persona persona) {
		System.out.println(persona.toString());
		System.out.println("-------------");
	}
	
	public void buscarPorDni(String dni) {
		Persona personaEncontrada = null;
		int i = 0;
		while(personaEncontrada == null && i < personas.size()) {
			if(personas.get(i).getDni().matches(dni)) {
				personaEncontrada = personas.get(i);
			} else {
				i++;
			}
		}
		if (personaEncontrada != null) {
			listarPersona(personaEncontrada);	
		} else {
			System.out.println("No se encontro a ninguna persona con ese DNI.");
		}
	}
}
