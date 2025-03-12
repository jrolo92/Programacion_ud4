package ejercicio12;

public class Gato extends Animal{
	
	@Override
	public void hacerSonido() {
		System.out.println("Miau Miau");
	}
	
	@Override
	public String moverse() {
		return "Se desliza sigilosamente";
	}
}
