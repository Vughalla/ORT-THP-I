package primerParcial;
import java.util.Scanner;

public class primerParcial {
	static Scanner entrada = new Scanner(System.in);
	static int GRADOMIN = 0;
	static int GRADOMAX = 7;
	static int VALORCUOTA1 = 10000;
	static int VALORCUOTA2 = 12000;
	static int VALORCUOTA3 = 14000;
	static int VALORCOM = 3000;
	static int VALORMAT = 1200;
	static int VALORMIC = 2000;
	static int VALORMUS = 800;
	static int CONCEPTOSMINIMOS = 2;
	static double DESCSEGHIJO = 5;
	static double DESCTERHIJO = 2;
	
	private static String ingresarNombre(String mje) {
		int flag = 0;
		String nombre = "";
		
		while (flag == 0) {
			System.out.println("Ingrese el nombre del " +mje+".");
			nombre = entrada.next();
			if (nombre.matches("^[a-zA-Z]*$")) {
				flag = 1;
			} else {
				System.out.println("Por favor, ingrese sólo caractéres alfabéticos.");
			}
		}
		return nombre;
	}
	
	private static int ingresarGrado() {
		int grado = 0, flag = 0;
		
		while (flag == 0) {
			System.out.println("Ingrese el grado del alumno (0 a 7).");
			grado = entrada.nextInt();
			if (grado>=GRADOMIN && grado<=GRADOMAX) {
				flag = 1;
			} else {
				System.out.println("Error, sólo puede ingresar valores entre "+GRADOMIN+"-"+GRADOMAX+".");
			}
		}
		return grado;	
	}
	
	private static int calcularMayor(int mayorGrado, int grado) {
		int mayor = 0;
		if (mayorGrado < grado) {
			mayor = grado;
		} else {
			mayor = mayorGrado;
		}
		return mayor;
	}
	private static String ingresarConcepto() {
		String concepto = "";
		int flag = 0;
			while (flag == 0) {
				System.out.println("Ingrese el codigo de concepto ('X' - No hay mas conceptos)");
				System.out.println("COM - Comedor");
				System.out.println("MAT - Materiales");
				System.out.println("MIC - Micro Escolar");
				System.out.println("MUS - Taller de Musica");
				concepto = entrada.next();
				if (concepto.toLowerCase().matches("com") || concepto.toLowerCase().matches("mat") || concepto.toLowerCase().matches("mic") || concepto.toLowerCase().matches("mus") || concepto.toLowerCase().matches("x")) {
					flag = 1;
				}
			}
		return concepto;
	}

	private static int sumarMonto(String concepto) {
		int monto = 0;
		switch (concepto) {
		case ("com"):
			monto = VALORCOM;
			break;
		case ("mat"):
			monto = VALORMAT;
			break;
		case ("mic"):
			monto = VALORMIC;
			break;
		case ("mus"):
			monto = VALORMUS;
			break;
		}
		return monto;
	};
	
	static double calcularTotal(int grado, int conceptos, int hijos) {
		double subtotal = 0, descuento = 0, total = 0;
		
		if (grado <= 1) {
			subtotal = VALORCUOTA1;
		} else if (grado >= 2 && grado <= 4) {
			subtotal = VALORCUOTA2;
		} else if (grado >= 5) {
			subtotal = VALORCUOTA3;
		}
		
		if (hijos == 1) {
			total = subtotal + conceptos;
		} else if (hijos == 2) {
			descuento = subtotal*(DESCSEGHIJO/100);
			total = subtotal - descuento + conceptos;
		} else if (hijos >= 3) {
			descuento = subtotal*(DESCTERHIJO/100);
			total = subtotal - descuento + conceptos;
		}
		
		return total;
	}
	private static void informar(String familia, double total, String alumnoMayor, int gradoMayor) {
		System.out.println("Familia " +familia+ ".");
		System.out.println("El importe total es de $" +total+ ".");
		System.out.println("Entregar factura al alumno " +alumnoMayor+ " en " +gradoMayor+ " grado.");
		
	}
	public static void main(String[] args) {

		String responsable, nombreHijo = "", mayorAlumno = "";
		int hijosAnotados = 0, mayorGrado = 0, anteriorMayor = -1;
		double totalPorHijos = 0;
		
		System.out.println("¡¡Bienvenido al sistema Colegio!!");
		responsable = ingresarNombre("responsable (padre/madre)");
		
		while (!nombreHijo.matches("fin")) {
			System.out.println("Para finalizar la carga de alumnos ingrese FIN.");
			nombreHijo = ingresarNombre("alumno");
			String concepto = "";
			int grado, cantConceptos = 0, subTotalConceptos = 0, totalConceptos = 0;
			double cuotaTotal = 0;
			
			if (!nombreHijo.matches("fin")) {
				hijosAnotados = hijosAnotados + 1;
				grado = ingresarGrado();
				mayorGrado = calcularMayor(mayorGrado, grado);
				
				if (anteriorMayor < mayorGrado) {
					mayorAlumno = nombreHijo;
				}
				
				while (!concepto.matches("x")) {
					concepto = ingresarConcepto();
					if (!concepto.matches("x")) {
						subTotalConceptos = sumarMonto(concepto);
						totalConceptos = totalConceptos + subTotalConceptos;
						cantConceptos = cantConceptos+1;
					} else if (cantConceptos < CONCEPTOSMINIMOS) {
						System.out.println("Debe cargar al menos dos conceptos.");
						concepto = "";
					}
				}
				
				cuotaTotal = calcularTotal(grado, totalConceptos, hijosAnotados);
				System.out.println("La cuota total por " +nombreHijo+ " es de $" +cuotaTotal);
				totalPorHijos = totalPorHijos + cuotaTotal;
			}
			
		}
		informar(responsable, totalPorHijos, mayorAlumno, mayorGrado);
		entrada.close();
	}
}
