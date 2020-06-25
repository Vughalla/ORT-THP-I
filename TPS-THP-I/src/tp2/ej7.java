package tp2;
import java.util.Scanner;

public class ej7 {
	static Scanner entrada = new Scanner(System.in);
	
	//Array que simula ser una base de datos.
	static String[] USERSPASS = {"juan:ORT123", "emmanuel:DBZ2001", "rocio:Metallica99"};
	
	private static void cerrarPrograma(int close) {
		entrada.close();
		if (close == 0) {
			System.out.println("Ha ingresado correctamente");
		} else {
			System.out.println("Su cuenta ha sido bloqueada. Por favor pónganse en contacto con el administrador.");
		}
		System.out.println("----------Programa finalizado----------");
		System.exit(close);
	}
	
	private static String checkearUser() {
		String user = "";
		int flagImputOk = 0;
		System.out.println("Ingrese su usuario");
		while (flagImputOk == 0) {
			user = entrada.nextLine();			
			for (int i = 0; i < USERSPASS.length; i++){
				String[] USUARIOS = USERSPASS[i].split(":");
				if (user.toLowerCase().matches(USUARIOS[0])) {
					System.out.println("Usuario ingresado correctamente");
					flagImputOk = 1;
					break;
				}
			}
			if (flagImputOk == 0) {
				System.out.println("Error. El usuario ingresado no existe. Intentelo nuevamente.");
			}
		}
		return user;
	}
	
	private static void checkearPass() {
		String pass = "";
		int flagImputOk = 0;
		int passError = 0;
		
		System.out.println("Ingrese su contraseña");
		while (flagImputOk == 0) {
			pass = entrada.nextLine();			
			for (int i = 0; i < USERSPASS.length; i++){
				String[] USUARIOS = USERSPASS[i].split(":");
				if (pass.matches(USUARIOS[1])) {
					flagImputOk = 1;
					break;
				}
			}
			if (flagImputOk == 0) {
				System.out.println("Error. La contraseña ingresada es incorrecta. Intentelo nuevamente.");
				passError = passError + 1;
				int intentos = 3 - passError;
				if (intentos == 0) {
					cerrarPrograma(1);
				} else {
					System.out.println("Intentos restantes: " + intentos);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		/* 7.El ingreso a un sitio web se valida por nombre de usuario y contraseña. Realiza un programa que impida que el usuario
		 * ingrese hasta poner los datos correctos. Si intenta más de 3 veces erróneamente, se debe mostrar el mensaje "Se ha bloqueado
		 * su cuenta", de lo contrario, mostrar "Ha ingresado correctamente".
		 */
		
		String usuario = checkearUser();
		System.out.println("Bienvenido " +usuario+ ". Por favor, introduce tu contraseña.");
		
		checkearPass();		
		cerrarPrograma(0);
	}

}
