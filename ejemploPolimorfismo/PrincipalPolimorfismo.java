package ejemploPolimorfismo;

public class PrincipalPolimorfismo {
	public static void main(String[] args) {
		//Creamos un objeto de la clase Animal
		Animal a = new Animal();
		a.sonido();
		
		//Le decimos que ese mismo objeto pase a ser de la clase perro (solo se puede si hay herencia)
		a = new Perro();
		a.sonido();
		
		//Le decimos que ese mismo objeto pase a ser de la clase gato.
		a = new Gato();
		a.sonido();
		
		//Le decimos que ese mismo objeto pase a ser de la clase pajaro
		a = new Pajaro();
		a.sonido();
	}
}
