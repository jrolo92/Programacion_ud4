package refuerzo.ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Creamos 3 objetos de la clase Libro:
		Libro libro1 = new Libro ("El principito", "Antoine de Saint-Exupery", 1943, true);
		Libro libro2 = new Libro ("1984", "George Orwell", 1949, true);
		Libro libro3 = new Libro ("Cien años de soledad", "Gabriel García Márquez", 1967, true);
		
		//Creamos 1 objeto de la clase Biblioteca:
		Biblioteca biblioteca1 = new Biblioteca (10);
		
		//Agregamos los 3 libros creados a la biblioteca:
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarLibro(libro3);
		
		//Mostramos los libros de nuestra biblioteca:
		biblioteca1.mostrarLibro();
		
		//Prestar libro y volver a mostrar la biblioteca:
		biblioteca1.prestarLibro("El principito");
		biblioteca1.mostrarLibro();
	}
}
