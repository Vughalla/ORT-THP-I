package TP2;
import java.util.Scanner;

public class ej16 {
	static Scanner entrada = new Scanner(System.in);
	static int CLASICO = 300;
	static int CELIACO = 310;
	static int KOSHER = 430;
	static int LIGHT = 290;
	static int BEBIDAS = 30;

	public static void cerrarPrograma() {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(0);
	}
	
	private static void check() {
		String rta = "";
		int flag = 0;
		while (flag == 0) {
			rta = entrada.nextLine();
			if (rta.toLowerCase().matches("s") || rta.toLowerCase().matches("n")) {
				if (rta.toLowerCase().matches("n")) {
					cerrarPrograma();
				} else {
					flag = 1;
				}
			} else {
				System.out.println("Error, ingrese S/N.");
			}
		}
	}
	
	private static int ingresarInvitados() {
		int inv = 0, flag;
		flag = 0;
		while (flag == 0) {
			System.out.println("Ingrese la cantidad de invitados.");
			inv = entrada.nextInt();
			if (inv >= 0) {
				flag = 1;
			} else {
				System.out.println("Error, la cantidad de invitados no puede ser menor a 1.");
			}
		}
		return inv;
	}
	
	private static String ingresarMenu() {
		String menu = "";
		int flag = 0;
		System.out.println("Seleccione un menú: Clasico => CL / Celiaco => CE / Kosher => KO / Light => LI");
		System.out.println("Para salir ingrese: FIN");
		menu = entrada.nextLine();
		while (flag == 0) {
			menu = entrada.nextLine();
			if (menu.toLowerCase().matches("cl") || menu.toLowerCase().matches("ce") || menu.toLowerCase().matches("ko") || menu.toLowerCase().matches("li") || menu.toLowerCase().matches("fin")) {
				flag = 1;
			} else {
				System.out.println("Error, ingrese Clasico => CL / Celiaco => CE / Kosher => KO / Light => LI");
				System.out.println("Para salir ingrese: FIN");
			}
		}
		return menu;
	}
	
	private static int ingresarNroMenu(int menuesPedidos, int cantInv) {
		int restantes = cantInv-menuesPedidos;
		int menu = 0, flag;
		flag = 0;
		while (flag == 0) {
			System.out.println("Seleccione la cantidad de menúes que desea. Cantidad de invitados sin menú pedido: "+restantes);
			menu = entrada.nextInt();
			if (menu >= 0 && menu <= restantes) {
				flag = 1;
			} else {
				System.out.println("Error, seleccione una cantidad entre 1 y "+restantes);
			}
		}
		return menu;
	}
	
	private static double calcularCosto(String menu, int cantPedida) {
		double costo = 0;
		switch (menu) {
			case "cl":
				costo = (cantPedida*CLASICO)+(cantPedida*BEBIDAS);
				break;
			case "ce":
				costo = (cantPedida*CELIACO)+(cantPedida*BEBIDAS);
				break;
			case "ko":
				costo = (cantPedida*KOSHER)+(cantPedida*BEBIDAS);
				break;
			case "li":
				costo = (cantPedida*LIGHT)+(cantPedida*BEBIDAS);
				break;
		}
		return costo;
	}
	public static void main(String[] args) {
		/* 16. Una empresa de catering nos pode desarrollar un programa para calcular el precio que tendrá que cobrar a sus clientes
		 * según el menú elegido por los invitados de cada fiesta.
		 * Las alternativas de cubierto ofrecidas y sus precios por persona son (poner como constantes):
		 * OPCION 1: Menú Clásico       $300
		 * OPCION 2: Menú para celíacos $310
		 * OPCION 3: Menú kosher        $430
		 * OPCION 4: Menú light         $290
		 * A su vez, tenemos que tener en cuenta que se cobra $30 por persona para cubrir las bebidas,
		 * indistintamente del menú elegido.
		 * Al comenzar el programa, se le preguntará al usuario si desea calcular el precio total del catering para
		 * su fiesta (s/n - validar). En caso afirmativo, se le solicitará al usuario que ingrese la cantidad de invitados
		 * total (validar que sea mayor a 0).
		 * Una vez ingresada esa información, se le pedirá que ingrese el tipo de menú
		 * (clásico/celíaco/kpsher/light/fin - VALIDAR) para luego cargar la cantidad de invitados que eligieron ese cubierto.
		 * Estos dos datos se le pedirán hasta que el tipo de menú sea "fin".
		 * Una vez finalizado el ingreso de datos, se mostrará por pantalla un resúmen detallando lo ingresado y el costo final
		 * calculado.
		 * Obs: validar que concuerte la cantidad total de invitados y la cantidad total de Menues pedidos.
		 * Recuerde modularizar haciendo uso de las funciones, utilizar constantes, realizar validaciones y ser prolijo en el código.
		 */

		String tipoMenu = "";
		int cantInvitados = 0, menuesAPedir = 0, menuesPedidos = 0;
		double costoParcial = 0, costoTotal = 0;
		
		System.out.println("¿Desea calcular el precio total del catering para su fiesta? Ingrese S/N.");
		check();
		cantInvitados = ingresarInvitados();
		while (!tipoMenu.matches("fin")) {
			tipoMenu = ingresarMenu();
			if (!tipoMenu.matches("fin")) {
				menuesAPedir = ingresarNroMenu(menuesPedidos, cantInvitados);
				menuesPedidos = menuesPedidos+menuesAPedir;
				costoParcial = calcularCosto(tipoMenu, menuesAPedir);
				costoTotal = costoTotal+costoParcial;
				if (menuesPedidos == cantInvitados) {
					tipoMenu = "fin";
				}
			} else {
				System.out.println("Quedan invitados sin seleccionar su menú. ¿Desea completar la carga de menúes? S/N");
				check();
				tipoMenu = "";
			}
		}
		System.out.println("El presupuesto es de $"+costoTotal);
		entrada.close();
	}

}
