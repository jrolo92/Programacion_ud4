package ampliacion.ejercicio17;

public class Futbolista extends Deportista{
	private String posicion;
	private int golesMarcados;
	
	//Métodos:
	
	public void anotarGol() {
		golesMarcados ++;
	}
	
	//Constructor:
	public Futbolista (String nombre, int edad, String deporte, String posicion, int golesMarcados) {
		super(nombre, edad, deporte, totalDeportistas);
		this.posicion = posicion;
		this.golesMarcados = golesMarcados;
	}
	
	//Getters y setters:
	public void setPosicion (String posicion) {
		this.posicion = posicion;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public int getGolesMarcados () {
		return golesMarcados;
	}
	
	@Override
	public String toString () {
		return "Nombre: " + super.getNombre() + ", edad: " + super.getEdad() + 
				", deporte: " + super.getDeporte() + ", posición: " + posicion +
				", golesMarcados: " + golesMarcados;
	}
}
