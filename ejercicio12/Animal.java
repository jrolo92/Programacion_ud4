package ejercicio12;

public abstract class Animal {
	protected String nombre;
	protected int edad;
	

	//Metodos:
	public abstract void hacerSonido();
	
	public abstract String moverse();
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre + " Edad: " + edad);
		hacerSonido();
		System.out.println(moverse());
	}
	
}
