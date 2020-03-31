package TP1;
import java.util.Scanner;
public class ej9 {
	static Scanner entrada = new Scanner(System.in);
	public static void cerrarPrograma(int close) {
		entrada.close();
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	public static void main(String[] args) {
		/*
		9. Realizá un programa que resuelva el siguiente problema:
		Tres personas aportan diferente capital a una sociedad. Se desea saber qué porcentaje del
		total aportó cada una (indicando nombre y porcentaje) y cuál es el monto del total aportado
		por las tres.
		Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego
		mostrar lo pedido en el siguiente formato:
		Nombre: capital aportado: $ … , Porcentaje del capital: %.... , Monto total aportado: $ ….
		*/
		try {
			int monto[] = new int[3];

			String nombre[] = new String[3];
				
			for (int i=0; i<monto.length; i++) {
				System.out.println("Ingrese nombre del inversor: ");
				nombre[i]=entrada.next();
				System.out.println("Ingrese un monto");
		        monto[i]=entrada.nextInt();
		        
		        if (monto[i] <= 0 ) {
		            System.out.println("Error, el monto mínimo a invertir es 1");
		            cerrarPrograma(1);
		        }
		    }
				int total = monto[0] + monto[1] + monto[2];
				float porcen[] = new float[3];
					
			for (int j=0; j<porcen.length; j++) {
				porcen[j]=((monto[j]*100) / total);
				System.out.println("Nombre: "+ nombre[j] + ". Capital aportado: " + monto[j] + ". Porcentaje del capital: %" +porcen[j]);
			}
			System.out.println("Monto total aportado: " + total);
			cerrarPrograma(0);
		} catch(Exception e) {
			System.out.println("Error, ingrese valores numéricos.");
			cerrarPrograma(1);
		}
	}
}
