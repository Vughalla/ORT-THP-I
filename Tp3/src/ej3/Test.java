package ej3;

public class Test {

	public static void main(String[] args) {
		TarjetaDeCredito visaGold =  new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		
		visaGold.realizarCompra(4000);
		System.out.println(visaGold.toString());
		visaGold.actualizarLimite(3000);
		if (visaGold.realizarCompra(4000)) {
			System.out.println("Compra realizada.");
		} else {
			System.out.println("No posee saldo suficiente para procesar su compra.");
		}
		System.out.println(visaGold.toString());
		
	}

}
