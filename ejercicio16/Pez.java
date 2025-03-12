package ejercicio16;

public class Pez extends Animal implements Nadador{
	@Override
	public void hacerSonido() {
		System.out.println("Glup glup");
	}

	@Override
	public String moverse() {
		return "Mueve las aletas";
	}
	
	@Override
	public void nadar() {
		System.out.println("El pez está nadando");
	}
}
