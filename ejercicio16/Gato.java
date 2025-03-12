package ejercicio16;

public class Gato extends Animal implements Corredor{
	@Override
	public void hacerSonido() {
		System.out.println("Miau Miau");
	}
	
	@Override
	public String moverse() {
		return "Se desliza sigilosamente";
	}
	
	@Override
	public void correr() {
		System.out.println("El gato está corriendo");
	}
}
