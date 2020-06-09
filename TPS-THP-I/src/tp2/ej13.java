package tp2;
import java.util.Scanner;
import java.util.Arrays;

public class ej13 {
	static Scanner entrada = new Scanner(System.in);
	
	private static int validarNumero() {
		int i = 0;
		int flagImput = 0;
		while (flagImput == 0) {
			String num = entrada.nextLine();
			if (num.matches("[0-9]+")) {
				i = Integer.parseInt(num);
				flagImput = 1;
			} else {
				System.out.println("El valor ingresado no es un número. Inténtelo nuevamente.");
			}
		}
		return i;
	}
	
	private static void validarCurso() {
		String curso = "";
		int flagImput = 0;
		while (flagImput == 0) {
			System.out.println("¿A qué curso pertenece el alumno? Ingrese: 'A' / 'B' / 'C' / 'D'.");
			curso = entrada.nextLine();
			if (curso.toLowerCase().matches("a") || curso.toLowerCase().matches("b") || curso.toLowerCase().matches("c") || curso.toLowerCase().matches("d")) {
				System.out.println("Curso ingresado.");
				flagImput = 1;
			} else {
				System.out.println("El curso ingresado no es correcto. Inténtelo nuevamente.");
			}
		}
	}
	
	private static String validarMateria() {
		String materia = "";
		int flagImput = 0;
		while (flagImput == 0) {
			System.out.println("¿Que materia está cursando? Ingrese: 'taller' / 'fundamentos' / 'matematica'.");
			materia = entrada.nextLine();
			if (materia.toLowerCase().matches("taller") || materia.toLowerCase().matches("fundamentos") || materia.toLowerCase().matches("matematica")) {
				System.out.println("Materia ingresada.");
				flagImput = 1;
			} else {
				System.out.println("La materia ingresada no es correcta. Inténtelo nuevamente.");
			}
		}
		return materia;
	}
	private static void informarMasCursada(int taller, int fundamentos, int matematica) {
		String masCursada = "";
		
		if (taller == fundamentos) {
			if (fundamentos == matematica) {
				masCursada = ""; //las 3 son iguales
			} else {
				if (matematica > taller) {
					masCursada = "matematica"; //la mayor es matematica
				} else {
					masCursada = ""; //taller y fundamentos son las mayores
				}
			}
		} else if (fundamentos == matematica) {
			if (taller > fundamentos) {
				masCursada = "taller"; //la mayor es taller
			} else {
				masCursada = ""; //fundamentos y matematica son las mayores.
			}
		} else if (taller > fundamentos) {
			if (taller > matematica) {
				masCursada = "taller"; //la mayor es taller
			} else {
				masCursada = "matematica"; //la mayor es matematica
			}
		} else if (fundamentos > matematica) {
			masCursada = "fundamentos"; //el mayor es fundamentos
		} else {
			masCursada = "matematica"; //el mayor es matematica
		}
				
		
		if (masCursada != "") {
			System.out.println("La materia con más cantidad de alumnos inscriptos es: "+masCursada+ ".");			
		} else {
			System.out.println("Hay empate entre materias con mayor cantidad de alumnos.");
		}
	}
		
	
	public static void main(String[] args) {
		/* 13. Se desea realizar un programa para saber qué prioridad darle a cada materia en cuanto a clases de apoyo
		 * de acuerdo a la necesidad de cada alumno.
		 * Al comenzar el programa, se pedirá la cantidad de alumnos que desea cargar. Luego, por cada alumno, se pedirá curso
		 * (a/b/c/d. Validar), y materia en la cual necesita clase de apoyo (taller/fundamentos/matemática).
		 * Una vez realizado el ingreso de datos, se deberá mostrar por pantalla cuál fue la materia más requerida.
		 */

		String[] materiaIngresada = {""};
		
		System.out.println("Indique la cantidad de alumnos que desea ingresar: ");
		int numAlum = validarNumero();
		System.out.println("Se ingresarán los datos de " +numAlum+ " alumnos.");
		
		for (int i=0; i<numAlum; i++) {
			System.out.println("COMIENZA CARGA DE DATOS DEL ALUMNO N° " +(i+1));
			validarCurso();
			String materia = validarMateria();
			materiaIngresada[i] = materia;
			materiaIngresada = Arrays.copyOf(materiaIngresada, materiaIngresada.length + 1);
			
			System.out.println("CARGA DE DATOS DEL ALUMNO N° " +(i+1)+ " FINALIZADA.");
		}
		materiaIngresada = Arrays.copyOf(materiaIngresada, materiaIngresada.length - 1);
		
		int cantTaller = 0, cantFundamentos = 0, cantMatematica = 0;
		for (int i=0; i<materiaIngresada.length; i++) {
			if (materiaIngresada[i].matches("taller")) {
				cantTaller = cantTaller +1;
			} else if (materiaIngresada[i].matches("fundamentos")) {
				cantFundamentos = cantFundamentos +1;
			} else if (materiaIngresada[i].matches("matematica")) {
				cantMatematica = cantMatematica +1;
			}
		}
		informarMasCursada(cantTaller, cantFundamentos, cantMatematica);
		entrada.close();
	}
}
