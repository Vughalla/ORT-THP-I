package tp1;
import java.util.Random;


public class ej15 {

	private static int generarNumero(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) {
		/*15. Existen dos reglas que identifican dos conjuntos de valores:
		- El número es de un solo dígito.
		- El número es impar.
		A partir de estas reglas, creá un algoritmo que asigne a las variables 
		booleanas estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero 
		o falso, según corresponda, para indicar si el valor ingresado pertenece al 
		primer conjunto, al segundo, a ambos o a ninguno, respectivamente. 
		Definí un lote de prueba de varios números y probá el algoritmo,
		escribiendo los resultados. */
		
		
		for (int i = 0; i < 100; i++) {
			boolean estaEnA = false, estaEnB = false, estaEnAmbos = false, noEstaEnNinguno = true;
			
			int numero = generarNumero(-100, 100);
			if (numero < 10 && numero > -10) {
				estaEnA = true;
				noEstaEnNinguno = false;
			}
			if (numero %2 != 0) {
				estaEnB = true;
				noEstaEnNinguno = false;
			}
			if (estaEnA && estaEnB) {
				estaEnAmbos = true;
			}
			if (noEstaEnNinguno) {
				System.out.println(numero + " No pertenece a ningun grupo.");
			} 
			if (estaEnA && !estaEnB) {
				System.out.println(numero + " Está sólo en el primer grupo.");
			} 
			if (!estaEnA && estaEnB) {
				System.out.println(numero + " Está sólo en el segundo grupo.");
			} 
			if (estaEnAmbos) {
				System.out.println(numero + " Está en ambos grupos.");
			}
		}
	}
}