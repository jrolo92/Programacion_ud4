package ejercicio12;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Se podría iniciar de uno en uno:
		 * Animal [] animales = new Animal [3];
		 * Animal perro = new Perro();
		 * Gato gato = new Gato();
		 * Pajaro pajaro = new Pajaro();
		 * Y luego incluir cada objeto en la matriz animales.
		 * animales [1] = perro...
		 */
		
		Animal [] animales = {new Perro(), new Gato(), new Pajaro()};
		
		// Recorremos el array y llamamos al método para cada animal.
		for (int i=0; i<animales.length; i++) {
			animales[i].mostrarInformacion();
		}
		
	}
}
