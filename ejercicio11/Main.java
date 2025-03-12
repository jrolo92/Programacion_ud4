package ejercicio11;

public class Main {
	public static void main(String[] args) {
		// Creamos varios objetos del tipo Libros:
		Libro libro1 = new Libro ("El Principito", "Antoine de Saint-Exupery", "98765432J", 1943);
		Libro libro2 = new Libro ("Jurassic Park", "Michael Crichton", "98765432J", 1990);
		Libro libro3 = new Libro ("¿Sueñan los androides con ovejas eléctricas?", "Philip K. Dick", "12345678A", 1968);
		
		// Imprimimos los libros con el método toString de la clase Libros:
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		
		// Comparamos dos libros con el mismo ISBN usando el método equals:
		System.out.println(libro1.equals(libro2));
		
		// Comparamos dos libros con distinto ISBN usando el método equals:
		System.out.println(libro1.equals(libro3));
		
	}
}
