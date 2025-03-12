package ejercicio16;

public class Pajaro extends Animal implements Volador{
	@Override
	public void hacerSonido () {
		System.out.println("Pío Pío");
	}
	@Override
	public String moverse () {
		return "Vuela por el aire";
	}
	
	@Override
	public void volar () {
		System.out.println("El pajaro está volando");
	}
	
	
}
