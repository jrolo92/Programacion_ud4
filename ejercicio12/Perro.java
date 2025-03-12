package ejercicio12;

public class Perro extends Animal {
	
	public void jugar () {
		System.out.println("jugar");
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("Guau Guau");
	}
	
	@Override
	public String moverse() {
		return "Corre en cuatro patas";
	}
}
