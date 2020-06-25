package modeloParcial2;

import java.util.ArrayList;

public class Equipo {
	public ArrayList<Jugador> jugadores;
	private String nombre;
	private int EQUIPOLLENO = 14;
	
	public Equipo(String nombre) {
		this.jugadores = new ArrayList<Jugador>(14);
		setNombre(nombre);
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private boolean buscarRepetidos(Jugador jugador) {
		boolean repetidos = false;
		for(Jugador futbolista: jugadores) {
			if(futbolista.getNumero() == jugador.getNumero()) {
				repetidos = true;
			}
		}
		return repetidos;
	}
	
	private boolean estaCompleto() {
		boolean estaCompleto = false;
		if (jugadores.size() >= EQUIPOLLENO) {
			estaCompleto = true;
		}
		return estaCompleto;
	}
	
	public void agregarJugador(Jugador jugador) {
		boolean repetidos = buscarRepetidos(jugador);
		boolean estaCompleto = estaCompleto();
		if (!repetidos){
			 if (!estaCompleto) {
				 jugadores.add(jugador);	 
			 } else {
				 System.out.println("El equipo está completo.");
			 }
		} else {
			System.out.println("Ya existe un jugador con ese número.");
		}
	}
	
	public void mostrarPlantel() {
		for(Jugador jugador: jugadores) {
			System.out.println(jugador.toString());
		}
	}
	
	private int sumarGoles() {
		int goles = 0;
		for(Jugador jugador: jugadores) {
			goles = goles + jugador.getNumGoles();
		}
		return goles;
	}
	
	public void mostrarGoles() {
		System.out.println("El equipo hizo "+sumarGoles()+ " goles.");
	}
	
	public void jugar(Equipo equipo) {
		int golesRival = equipo.sumarGoles();
		int goles = sumarGoles();
		if (!getNombre().matches(equipo.getNombre())) {
			if (golesRival > goles) {
				System.out.println("Gano el equipo rival "+equipo.getNombre()+".");
			} else if (golesRival < goles) {
				System.out.println("Gano el equipo "+getNombre()+".");
			} else {
				System.out.println("Empate.");
			}
		} else {
			System.out.println("No se puede jugar contra si mismos.");
		}
	}
	
}
