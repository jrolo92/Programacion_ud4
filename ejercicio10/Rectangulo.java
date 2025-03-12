package ejercicio10;

public class Rectangulo extends Figura {
	//Atributos adicionales:
	private double base;
	private double altura;
	
	//Constructor:
	public Rectangulo (String nombre, double base, double altura) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}
	
	//Getters y setters:
	public double getBase() {
		return base;
	}

	public void setBase (double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	//METODOS
	//Area = base x altura:
	public void calcularArea() {
		double area = base * altura;
		System.out.println(area);
	}
}
