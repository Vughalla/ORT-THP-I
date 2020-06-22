package ej8;

public class Test {

	public static void main(String[] args) {
		Superheroe superheroe1 = new Superheroe("Batman", 90, 70, 0);
		Superheroe superheroe2 = new Superheroe("Superman", 95, 60, 70);
		Superheroe superheroe3 = new Superheroe("Aquaman", 95, 60, 0);
		Superheroe superheroe4 = new Superheroe("Goku", 9999, 9999, 9999);
		Superheroe superheroe5 = new Superheroe("Saitama", 9999, 9999, -100);
		
		System.out.println(superheroe1.competir(superheroe2));
		System.out.println(superheroe2.competir(superheroe1));
		System.out.println(superheroe1.competir(superheroe3));
		
		System.out.println(superheroe1.toString());
		System.out.println(superheroe2.toString());
		System.out.println(superheroe3.toString());
		System.out.println(superheroe4.toString());
		System.out.println(superheroe5.toString());
		
	}

}
