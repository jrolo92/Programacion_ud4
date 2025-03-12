package ejercicio10;

public class Circulo extends Figura {
	//Atributo adicional:
	private double radio;
	
	//Constructor:
	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	
	//Getter y setter:
	public double getRadio() {
		return radio;
	}
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	
	//METODOS
	//Area= PI * radio (2):
	void calcularArea () {
		final double PI = 3.141592;
		double area = PI * (radio*radio);
		System.out.println(area);
	}
	
}
