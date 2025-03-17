package ejercicio17;

public abstract class Vehicle {
	protected String licensePlate;
	protected String brand;
	protected int year;
	protected static int vehicleCount;
	
	/*
	 * Los enum no son atributos si no clases.
	 * Se podría crear el tipo FuelType en otra clase y luego importarla aquí.
	 * Y luego crear un objeto de tipo Fueltype.
	 */
	enum FuelType {
		GASOLINE, DIESEL, ELECTRIC, HYBRID
	}
	private FuelType fuelType; //Éste es el objeto del tipo del enum.
	
	//METODOS:
	public abstract double maxSpeed ();
	
	//Constructor:
	public Vehicle (String licensePlate, String brand, int year, FuelType fuelType) {
		this.licensePlate = licensePlate;
		this.brand = brand;
		this.year = year;
		this.fuelType = fuelType;
		vehicleCount ++;
	}
	
	//Getters y setters:
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Vehicle licensePlate=" + licensePlate + ", brand=" + brand + 
				", year=" + year + ", fuelType=" + fuelType;
	}
	
	@Override //Se sobrescribe de Object y compara dos objetos de una clase.
	public boolean equals(Object obj) {
		//Comparar referencia:
		if (this == obj) 
			return true;
		//Casting:
		Vehicle vehiculo = (Vehicle) obj;
		//Comparar atributos (Cuando son de tipos primitivos se usa ==, si no .equals):
		if (this.brand.equals(vehiculo.brand) && this.licensePlate.equals(vehiculo.licensePlate)
				&& this.year == vehiculo.year && this.fuelType == vehiculo.fuelType);
			return true;
	}
}
