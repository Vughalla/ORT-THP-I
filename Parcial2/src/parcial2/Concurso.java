package parcial2;

import java.util.ArrayList;

/**
 * Clase Concurso. Segundo Parcial.
 * @author Emmanuel P. Belascuain
 *
 */
public class Concurso {
	private String nombre;
	private ArrayList<Participante> participantes;
	
	/**
	 * Constructor de la clase Concurso
	 */
	public Concurso() {
		setNombre("Quarantine Bakers");
		participantes = new ArrayList<Participante>();
	}
	
	/**
	 * Setter del atributo nombre de la clase Consurso.
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Recibe por parametro un dni y devuelve en caso de existir, un participante con ese Dni.
	 * @param dni
	 * @return
	 */
	private Participante buscarParticipante(String dni) {
		Participante partEncontrado = null;
		int i = 0;
		while (partEncontrado == null && i < participantes.size()) {
			if (participantes.get(i).getDni().matches(dni)) {
				partEncontrado = participantes.get(i);
			} else {
				i++;
			}
		}
		return partEncontrado;
	}
	
	/**
	 * En caso que no exista el participante en la lista, lo agrega.
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @return
	 */
	public boolean agregarParticipante(String dni, String nombre, String apellido) {
		boolean agregado = false;
		if (buscarParticipante(dni) == null) {
			participantes.add(new Participante(dni, nombre, apellido));
			agregado = true;
			System.out.println("Se agregó participante con dni " +dni);
		} else {
			System.out.println("Ya existia un participante con ese DNI");
		}
		return agregado;
	}
	
	/**
	 * En caso que exista el participante en la lista, lo elimina.
	 * @param dni
	 * @return
	 */
	public boolean eliminarParticipante(String dni) {
		boolean eliminado = false;
		Participante participante = buscarParticipante(dni);
		if (participante != null) {
			participantes.remove(participante);
			eliminado = true;
			System.out.println("Se eliminó participante con dni "+dni);
		} else {
			System.out.println("No se pudo eliminar participante con ese dni.");
		}
		return eliminado;
	}
	
	/**
	 * En caso que exista el participante en la lista, suma +1 en su puntaje.
	 * @param dni
	 */
	public void votarParticipante(String dni) {
		Participante participante = buscarParticipante(dni);
		if (participante != null) {
			participante.sumarVoto();
			System.out.println("Voto para "+participante.getNombre()+" "+ participante.getApellido());
		} else {
			System.out.println("Voto inválido: Dni inexistente.");
		}
	}
	
	/**
	 * Devuelve la cantidad de participantes en la lista.
	 */
	public void obtenerCantParticipantes() {
		System.out.println("Hay "+participantes.size()+" participantes");
	}
	
	/**
	 * Verifica cual es el participante con mayor cantidad de votos. Si hay más de uno con el mismo puntaje, muestra al primero.
	 */
	public void mostrarMasVotado() {
		if(participantes.isEmpty() == false) {
			Participante masVotado = participantes.get(0);
			for(Participante participante: participantes) {
				if (participante.getPuntaje() > masVotado.getPuntaje()) {
					masVotado = participante;
				}
			}
			System.out.println("El participante con mayor puntaje es "+masVotado.getNombre()+" "+masVotado.getApellido());
		} else {
			System.out.println("No hay participantes inscriptos.");
		}
	}
	
	/**
	 * Lista los participantes que tengan igual o mayor puntaje al recibido por parámetro.
	 * @param puntaje
	 */
	public void listarDesdePuntaje(int puntaje) {
		for(Participante participante: participantes) {
			if (participante.getPuntaje() >= puntaje) {
				System.out.println(participante.toString());
			}
		}
	}
}
