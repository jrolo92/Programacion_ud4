package ejercicio10;

public class Figura {
	//Atributo:
	protected String nombre;
	
	//Constructor:
	public Figura (String nombre) {
		this.nombre	= nombre;
	}
	
	//METODOS
	//Area que devuelva 0.0:
	void calcularArea() {
		System.out.println("0.0");
	}
	
	//Mostrar nombre de la figura:
	void mostrarInformacion() {
		System.out.println(nombre);
	}
}
