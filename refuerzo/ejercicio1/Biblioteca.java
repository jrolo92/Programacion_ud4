package refuerzo.ejercicio1;

public class Biblioteca {
	private Libro [] libros = new Libro [10];
	private int contadorLibros = 0;
	
	
	//Constructor
	public Biblioteca(int cantidadLibros) {
		libros = new Libro[cantidadLibros];
		contadorLibros = 0;
	}

	//Getter y setter:
	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}


	//METODOS
	//Metodo para agregar un libro nuevo al array:
	public void agregarLibro (Libro libro) {
			libros[contadorLibros] = libro;
			contadorLibros ++;
	}
	
	//Método para mostrar todos los libros:
	public void mostrarLibro() {
		for (int i=0; i<=libros.length;i++)
		libros[i].mostrarInfo();
	}
	
	/*Método que busque un libro por su nombre, cambie de true a false
	 * cuando se preste y si no está disponible muestre mensaje de "no disponible":
	 */
	public void prestarLibro (String titulo) {
		for (int i = 0; i < contadorLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (libros[i].prestar()) {
                    System.out.println("El libro '" + titulo + "' ha sido prestado.");
                } else {
                    System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }
}