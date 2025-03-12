package ejercicio13;

public final class MatematicasUtil {
	final static double PI = 3.141592;
	
	/**
	 * Método para calcular el área de un circulo proporcionando el radio de éste.
	 * @param radio será el valor del radio del circulo.
	 * @return el área.
	 */
	public static double calcularAreaCirculo(double radio) {
		double area = PI * Math.pow(radio, 2);
		return area;
	}
	
	/**
	 * Metodo para calcular el perímetro de un rectángulo a partir del largo y el ancho.
	 * @param largo longitud del lado largo
	 * @param ancho longitud del lado ancho
	 * @return el perímetro
	 */
	public static double calcularPerimetroRectangulo (double largo, double ancho) {
		double perimetro = (2 * largo) + (2 * ancho);
		return perimetro;
	}
	
	/**
	 * Método para saber si un número es primo o no.
	 * @param numero
	 * @return True / False
	 */
	public static boolean esPrimo (int numero) {
		if (numero <= 1)
			return false;
		else if (numero == 2)
			return true;
		else {
			for (int i=2; i<numero; i++) {
				if (numero % i == 0)
					return false;
			}
			return true;
		}
	}
	
	/**
	 * Método para calcular el factorial de un número n.
	 * @param n
	 */
	public static void factorial (int n) {
		int factor = 1;
		for (int i=2; i<=n; i++) {
			factor *= i;
		}
		System.out.println("Factorial de " + n + ": " + factor);
	}
	
	/**
	 * Método que redondea decimales
	 * @param numero
	 * @param decimales
	 */
	public static void redondearDecimal (double numero, int decimales) {
		double potencia = Math.pow(10, decimales);
		double decimalRedondeado = Math.round(numero * potencia) / potencia;
		System.out.println(decimalRedondeado);
	}
}
