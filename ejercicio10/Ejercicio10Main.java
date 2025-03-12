package ejercicio10;

public class Ejercicio10Main {
	public static void main(String[] args) {
		//Creamos un array de tamaño 2 y de tipo Figura:
		Figura [] figuras1 = new Figura [2];
		
		//Creamos un Circulo y un Rectangulo y se los añadimos al array de tipo Figura:
		Circulo circulo = new Circulo ("Circulo", 5);
		Rectangulo rectangulo = new Rectangulo ("Rectangulo", 2, 5);
		
		figuras1 [0] = circulo; //El primer hueco del array va a ser un circulo.
		figuras1 [1] = rectangulo; //El segundo hueco del array va a ser un rectángulo.
		
		
		//Recorremos el array y llamamos a los métodos para cada figura con un bucle for:
		for(int i=0; i<=figuras1.length;i++) {
			
			figuras1[i].mostrarInformacion();
			figuras1[i].calcularArea();
			
		}
	}
}
