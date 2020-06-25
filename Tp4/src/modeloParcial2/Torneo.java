package modeloParcial2;

public class Torneo {

	public static void main(String[] args) {
		Equipo equipo1 = new Equipo("Atlanta");
		Equipo equipo2 = new Equipo("Sacachispa");
		Equipo equipo3 = new Equipo("Racing club S.A.");
		
		for(int i=0; i<14; i++) {
			Jugador jugador = new Jugador(i+1, "Apellido"+(i+1), 0);
			equipo1.agregarJugador(jugador);
		}
		for(int i=0; i<10; i++) {
			Jugador jugador = new Jugador(i+1, "Apellido"+(i+1), 0);
			equipo2.agregarJugador(jugador);
		}
		for(int i=0; i<12; i++) {
			Jugador jugador = new Jugador(i+1, "Apellido"+(i+1), 0);
			equipo3.agregarJugador(jugador);
		}
		
		System.out.println(equipo1.jugadores.size());
		equipo1.mostrarPlantel();
		System.out.println(equipo2.jugadores.size());
		equipo2.mostrarPlantel();
		System.out.println(equipo3.jugadores.size());
		equipo3.mostrarPlantel();
		
		Jugador perez = new Jugador(1, "Perez", 0);
		equipo2.agregarJugador(perez);
		equipo2.mostrarPlantel();
		
		equipo1.mostrarGoles();
		equipo1.jugar(equipo2);
		Jugador gomez = new Jugador(13, "Gomez", 2);
		equipo2.agregarJugador(gomez);
		equipo1.jugar(equipo2);
	}

}
