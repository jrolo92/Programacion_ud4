package ejercicio17;

import ejercicio17.Vehicle.FuelType;

public class Main {
	public static void main(String[] args) {
		
		Vehicle coche = new Car("0011 ABC", "Volkswagen", 2018, FuelType.HYBRID, 5);
		Vehicle moto = new Motorcycle ("2233 DEF", "Honda", 2020, FuelType.GASOLINE, false);
		
		System.out.println(Vehicle.vehicleCount);
	}
}
