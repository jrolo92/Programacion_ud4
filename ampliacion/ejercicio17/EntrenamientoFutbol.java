package ampliacion.ejercicio17;

public class EntrenamientoFutbol extends Entrenamiento implements Compite{

	@Override
	public String competir() {
		return "El futbolista está compitiendo en un partido";
	}

	@Override
	public String entrenar() {
		return "Entrenando fútbol...";		
	}
	
	//TODO usar this?
	
}
