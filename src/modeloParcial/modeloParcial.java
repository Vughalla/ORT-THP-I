package modeloParcial;
import java.util.Scanner;
import java.text.DecimalFormat;

public class modeloParcial {
	static Scanner entrada = new Scanner(System.in);
	static DecimalFormat df2 = new DecimalFormat("#.##");
	
	static int COSTOPORCION = 90;
	static int PORCIONPA = 250; 
	static int PORCIONVE = 400;
	static int PORCIONCA = 350;
	static int PORCIONPO = 300;
	static int PESOTOPE = 4000;
	static int CANTTOPE = 10;
	static int RECARGOCA = 10;
	
	private static String ingresarNombre() {
		int flag = 0;
		String nombre = "";
		while ( flag == 0 ) {
			System.out.println("Ingrese el nombre del cliente.");
			nombre = entrada.nextLine();
			if (nombre.toLowerCase().matches("[a-z]+")) {
				flag = 1;
			} else {
				System.out.println("El nombre sólo debe contener letras. Inténtelo nuevamente.");
			}
		}
		return nombre;
	}
	
	private static String ingresarMenu(String nombreCliente) {
		String menu = "";
		int flag = 0;
		System.out.println("Seleccione un menú: Pastas => PA / Vegetales => VE / CARNES => CA / POSTRES => PO");
		while (flag == 0) {
			menu = entrada.nextLine();
			if (menu.toLowerCase().matches("pa") || menu.toLowerCase().matches("ve") || menu.toLowerCase().matches("ca") || menu.toLowerCase().matches("po")) {
				flag = 1;
				switch (menu) {
				case ("pa"):
					System.out.println(nombreCliente+" seleccionó porción de pastas. La misma pesa "+PORCIONPA+"gr.");
					break;
				case ("ve"):
					System.out.println(nombreCliente+" seleccionó porción de verduras. La misma pesa "+PORCIONVE+"gr.");
					break;
				case ("ca"):
					System.out.println(nombreCliente+" seleccionó porción de carne. La misma pesa "+PORCIONCA+"gr.");
					break;
				case ("po"):
					System.out.println(nombreCliente+" seleccionó porción de postre. La misma pesa "+PORCIONPO+"gr.");
					break;
				}
			} else {
				System.out.println("Error, ingrese Pastas => PA / Vegetales => VE / CARNES => CA / POSTRES => PO");
			}
		}
		
		return menu;
	}
	
	private static void informarPorcentajes(double pesoAcumulado, double pesoPa, double pesoVe, double pesoCa, double pesoPo){
		double porPa, porVe, porCa, porPo;
		porPa = (pesoPa*100)/pesoAcumulado;
		porVe = (pesoVe*100)/pesoAcumulado;
		porCa = (pesoCa*100)/pesoAcumulado;
		porPo = (pesoPo*100)/pesoAcumulado;
		
		System.out.println("Porcentaje de Pastas: " + df2.format(porPa) +"%.");
		System.out.println("Porcentaje de Verduras: "+ df2.format(porVe) +"%.");
		System.out.println("Porcentaje de Carne: " + df2.format(porCa) +"%.");
		System.out.println("Porcentaje de Postre: " + df2.format(porPo) +"%.");
	}
	
	private static void informarCosto(int cantidadPedidos, double pesoPa, double pesoVe, double pesoCa, double pesoPo) {
		double subTotal, costo;
		if (pesoCa > pesoPa && pesoCa > pesoVe && pesoCa > pesoPo) {
			subTotal = (cantidadPedidos * COSTOPORCION);
			costo = subTotal + ((subTotal*RECARGOCA)/100);
		} else {
			costo = (cantidadPedidos * COSTOPORCION);
		}
		System.out.println("El costo del pedido es de $"+ costo);
		
	}
	public static void main(String[] args) {
		/* ENUNCIADO:
		 * La casa de comidas "El tenedor loco" abre sus puertas ofreciendo un menú de ofertas, con todos sus platos al
		 * módico costo de $90 cada uno. Sin embargo, para controlar un poco el negocio, ha implementado un programa
		 * para hacer el seguimiento de los platos consumidos por cada comensal. El programa realizará para cada uno de sus
		 * clientes un seguimiento personalizado. Para ello, al llegar un comensal a la mesa, el programa registra su nombre
		 * y comienza a registrar sus acciones:
		 * 
		 * Mientras que esté en condiciones de hacerlo, el programa le permite ordenar un plato. Entre las opciones
		 * disponibles puede ordenar alguno de los siguientes (incluye el peso de la porción):
		 * - Degustación de pastas (PA) - 250gr
		 * - Degustación de vegetales (VE) - 400gr
		 * - Degustación de carnes (CA) - 350gr
		 * - Degustación de postres (PO) - 300gr
		 * 
		 * Una vez elegido el plato que se desea consumir (PA, VE, CA, PO) se deberá mostrar a modo de confirmación el nombre
		 * y peso del plato.
		 * 
		 * Si en algún momento se cumple alguna de las siguientes condiciones...
		 * 
		 * - El peso de los alimentos supere los 4Kg.
		 * - La cantidad de platos ordenados sea de 10 o más unidades.
		 * ...Finalizará la entrega de platos.
		 * 
		 * Al finalizar la entrega, se muestra la cuenta. Esta debe incluir:
		 * - Nombre del cliente.
		 * - El porcentaje ingerido de cada plato (sobre el peso total de todos los platos ordenados)
		 * - El monto total a pagar, que deberá incluir un recargo del 10% sobre el total, si el mayor porcentaje (en peso)
		 *   ingerido fue de carne (sobre el peso total).
		 */
		
		
		String menu, nombreCte;
		double pesoAcumulado = 0, pesoPa= 0, pesoVe = 0, pesoCa = 0, pesoPo = 0;
		int flag = 0, cantPedidos = 0;
		nombreCte = ingresarNombre();
		while (flag == 0) {
			menu = ingresarMenu(nombreCte);
			switch (menu) {
			case ("pa"):
				pesoPa = pesoPa + PORCIONPA;
				pesoAcumulado = pesoAcumulado + PORCIONPA;
				break;
			case ("ve"):
				pesoVe = pesoVe + PORCIONVE;
				pesoAcumulado = pesoAcumulado + PORCIONVE;
				break;
			case ("ca"):
				pesoCa = pesoCa + PORCIONCA;
				pesoAcumulado = pesoAcumulado + PORCIONCA;
				break;
			case ("po"):
				pesoPo = pesoPo + PORCIONPO;
				pesoAcumulado = pesoAcumulado + PORCIONPO;
				break;
			}
			cantPedidos = cantPedidos+1;
			System.out.println("Peso total acumulado: "+pesoAcumulado);
			if (cantPedidos == CANTTOPE || pesoAcumulado >= PESOTOPE) {
				flag=1;
			}
		}
		
		System.out.println("Datos de la compra de " +nombreCte+ ".");
		informarPorcentajes(pesoAcumulado, pesoPa, pesoVe, pesoCa, pesoPo);
		informarCosto(cantPedidos, pesoPa, pesoVe, pesoCa, pesoPo);
	}
}
