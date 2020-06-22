package ej4;

public class Test {
	public static void testearCafetera(Cafetera cafetera) {
		System.out.println(cafetera.toString());
		cafetera.agregarCafe(20);
		System.out.println(cafetera.toString());
		cafetera.servirTaza(10);
		System.out.println(cafetera.toString());
		cafetera.servirTaza(15);
		System.out.println(cafetera.toString());
		cafetera.llenar();
		System.out.println(cafetera.toString());
		cafetera.vaciar();
		cafetera.agregarCafe(2000);
		System.out.println(cafetera.toString());
		
	}
	
	public static void main(String[] args) {
		Cafetera cafetera1 = new Cafetera();
		Cafetera cafetera2 = new Cafetera(500);
		Cafetera cafetera3 = new Cafetera(750, 500);

		testearCafetera(cafetera1);
		testearCafetera(cafetera2);
		testearCafetera(cafetera3);
		
		
		
	}

}
