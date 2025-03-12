package ejercicio12;

public class Pajaro extends Animal{
	@Override
	public void hacerSonido () {
		System.out.println("Pío Pío");
	}
	@Override
	public String moverse () {
		return "Vuela por el aire";
	}
}
