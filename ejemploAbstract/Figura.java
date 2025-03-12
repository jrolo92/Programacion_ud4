package ejemploAbstract;

//Siempre que tengamos un método abstracto le tenemos que poner a la clase tambien la palabra reservada 'abstract' (igual que al método).
abstract class Figura {
	protected String nombre;
	
	//Constructor
	public Figura (String nombre) {
		this.nombre	= nombre;
	}
	
	//METODOS
	/*
	 * Se pone abstracta cuando el metodo se deja sin implementar en la clase padre (Figura) 
	 * Las clases hijas van a tener obligatoriamente el mismo método pero implementado.
	 * Ésto se hace debido a que cada clase hija va a tener una forma distinta y específica de realizar el método.
	 */
	public abstract double calcularArea(); 
	
	void mostrarInformacion() {
		System.out.println(nombre);
	}
}
