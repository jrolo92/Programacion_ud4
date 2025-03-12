package refuerzo.ejercicio1;

public class Libro {
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean disponible;
	
	
	//Constructor:
	public Libro (String titulo, String autor, int anioPublicacion, boolean disponible) {
		this.titulo=titulo;
		this.autor=autor;
		this.anioPublicacion=anioPublicacion;
		this.disponible=disponible;
	}
	
	
	//Getters y setters:
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public int getAnioPublicacion () {
		return anioPublicacion;
	}
	
	public void setAnioPublicacion (int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public boolean getDisponible () {
		return disponible;
	}
	
	public void setDisponible (boolean disponible) {
		this.disponible = disponible;
	}
	
	
	//Metodo para mostrar la info de los libros.
	public void mostrarInfo () {
		System.out.println("Titulo: " + titulo + ", ");
		System.out.print("Autor: "+ autor + ", ");
		System.out.print("Año: "+ anioPublicacion + ", ");
		System.out.print("Disponible: "+ disponible + ".");
		
	}
	
	//Método para prestar un libro (necesario para el método prestar libro de la clase Biblioteca):
	public boolean prestar() {
	    if (disponible) {
	    	disponible = false;
	            return true;
	        } else {
	            return false;
	        }
	    }
}
