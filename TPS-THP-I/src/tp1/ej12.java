package tp1;
import java.util.Random;

public class ej12 {
	
	private static int tirarDados(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void informarTirada(int tirada) {
		String mensaje[] = {"Insuficiente", "Regular", "Muy bien", "Excelente"};
		System.out.println(mensaje[tirada]);
		System.out.println("----------Programa finalizado----------");
		System.exit(0);
		
	}
	public static void main(String[] args) {
		/*
		12. En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
		obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
		resultados:
		• Si los tres dados son seis, mostrar el mensaje “Excelente”
		• Si dos dados son seis, mostrar el mensaje “Muy bien”
		• Si un dado es seis, mostrar el mensaje “Regular”
		• Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente”
		*/
		int flag = 0;
		for (int i = 1; i < 4; i++) {
			int dado = tirarDados(1, 6);
			System.out.println("El dado N° "+ i +" es: "+ dado);
			if (dado == 6) {
				flag = flag + 1;
			}	
		}
		informarTirada(flag);
	}
}
