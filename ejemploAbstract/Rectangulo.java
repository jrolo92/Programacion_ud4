package ejemploAbstract;

import ejercicio10.Figura;

public class Rectangulo extends Figura {
		private double base;
		private double altura;
		
		//Constructor
		public Rectangulo (String nombre, double base, double altura) {
			super(nombre);
			this.base = base;
			this.altura = altura;
		}
		//En la clase hija implementamos el método.
		public void calcularArea() {
			double area = base * altura;
			System.out.println(area);
		}
		
}
