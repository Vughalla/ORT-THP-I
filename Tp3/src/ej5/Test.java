package ej5;

public class Test {

	public static void main(String[] args) {
		Hotel hotel = new Hotel("Hilton", "CABA", 200);
		hotel.ocuparHabitaciones(201, false);
		System.out.println(hotel.toString());
		hotel.ocuparHabitaciones(30, false);
		System.out.println(hotel.toString());
		hotel.reservarHabitaciones(50);
		System.out.println(hotel.toString());
		hotel.desocuparHabitaciones(200);
		System.out.println(hotel.toString());
		hotel.ocuparHabitaciones(30, true);
		System.out.println(hotel.toString());
		hotel.ocuparHabitaciones(30, true);
		System.out.println(hotel.toString());
		hotel.desocuparHabitaciones(40);
		System.out.println(hotel.toString());
	}

}
