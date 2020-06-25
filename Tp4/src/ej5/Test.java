package ej5;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Persona persona1 = new Persona("Juan", "Perez", "33.525.219", "11-4085-4131", "juanperez@gmail.com");
		Persona persona2 = new Persona("Matias", "Martin", "40.525.235", "11-2020-1234", "matiasmartin@gmail.com");
		Persona persona3 = new Persona("Florencia", "Peña", "12.525.895", "11-4885-0000", "florenciapenia@gmail.com");
		Persona persona4 = new Persona("Sasha", "Grey", "24.258.241", "11-5506-1452", "sashalove@gmail.com");
		Persona persona5 = new Persona("Niño", "Pollos", "22.565.810", "11-4896-9874", "niniopolleron@gmail.com");
		
		agenda.agregarPersona(persona1);
		agenda.listarPersonas();

		agenda.agregarPersona(persona2);
		agenda.agregarPersona(persona3);
		agenda.listarPersonas();
		agenda.eliminarPersona(persona2);
		agenda.listarPersonas();
		agenda.agregarPersona(persona4);
		agenda.agregarPersona(persona5);
		agenda.listarPersonas();
		agenda.buscarPorDni("24.258.241");
		agenda.buscarPorDni("24.258.000");
	}

}
