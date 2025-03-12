package ejercicio16;

public class Perro extends Animal implements Corredor {
	@Override
	public void hacerSonido() {
		System.out.println("Guau Guau");
	}
	
	@Override
	public String moverse() {
		return "Corre en cuatro patas";
	}
	
	@Override
	public void correr() {
		System.out.println("El perro está corriendo");
	}
}
