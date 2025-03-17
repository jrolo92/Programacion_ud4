package ampliacion.ejercicio17;

public class Main {
	public static void main(String[] args) {
		//Crear dos instancias de Futbolista
		Futbolista futbolista1 = new Futbolista ("Raúl", 47, "Fútbol", "Delantero", 323);
		Futbolista futbolista2 = new Futbolista ("Ronaldo", 48, "Fútbol", "Delantero", 352);
		EntrenamientoFutbol futbolista3 = new EntrenamientoFutbol ();
		
		//Usar el instanceof para comprobar a qué clases pertenece una instancia.
		System.out.println(futbolista1 instanceof Futbolista);
		System.out.println(futbolista1 instanceof Deportista);
		System.out.println(futbolista1 instanceof Object);
		System.out.println(futbolista1 instanceof Compite);
		
		//Modificar valores de una de las instancias creadas:
		System.out.println(futbolista1);
		futbolista1.setGolesMarcados(355);
		System.out.println(futbolista1);
		
		//Llamar al método anotarGol:
		futbolista1.anotarGol();
		System.out.println(futbolista1);
		
		
	}
}
