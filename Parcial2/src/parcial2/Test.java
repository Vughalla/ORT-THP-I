package parcial2;

public class Test {

	public static void main(String[] args) {
		Concurso concurso = new Concurso();
		concurso.agregarParticipante("14723980", "Agustina", "Gonzalez");
		concurso.agregarParticipante("14723980", "Samanta", "Pérez");
		concurso.agregarParticipante("36581454", "Damian", "Martínez");
		concurso.agregarParticipante("17606987", "Martina", "Luna");
		concurso.agregarParticipante("33887253", "Emilio", "Caxi");
		concurso.votarParticipante("123456789");
		concurso.votarParticipante("14723980");
		concurso.votarParticipante("36581454");
		concurso.votarParticipante("36581454");
		concurso.votarParticipante("36581454");
		concurso.votarParticipante("17606987");
		concurso.votarParticipante("33887253");
		concurso.votarParticipante("33887253");
		concurso.obtenerCantParticipantes();
		concurso.eliminarParticipante("17606987");
		concurso.eliminarParticipante("999999999");
		concurso.obtenerCantParticipantes();
		concurso.listarDesdePuntaje(2);
		concurso.mostrarMasVotado();
	}

}
