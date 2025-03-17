package ampliacion.ejercicio17;

public class Deportista {
	private String nombre;
	private int edad;
	private String deporte;
	protected static int totalDeportistas;
	
	//Métodos:
	
	public void modificarEdad (int edad) {
		this.edad = edad;
	}
	
	public String toString () {
		return "Nombre: " + nombre + ", edad: " + edad + ", deporte: " + deporte;
	}
	
	//Constructor:
	public Deportista (String nombre, int edad, String deporte, int totalDeportistas) {
		this.nombre = nombre;
		this.edad = edad;
		this.deporte = deporte;
		totalDeportistas ++;
	}
	
	//Getters y setters:
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return nombre;
	}
	public void setEdad (int edad) {
		this.edad = edad;
	}
	public int getEdad () {
		return edad;
	}
	public void setDeporte (String deporte) {
		this.deporte = deporte;
	}
	public String getDeporte () {
		return deporte;
	}
	public static int getTotalDeportistas() {
		return totalDeportistas;
	}
}
