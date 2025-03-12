package ejercicio16;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro ();
		Gato gato = new Gato();
		Pez pez = new Pez ();
		Pajaro pajaro = new Pajaro();
		Pato pato = new Pato();
		
		Corredor [] corredores = {perro, gato};
		
		perro.correr();
		gato.correr();
		pez.nadar();
		pajaro.volar();
		pato.nadar();
		pato.volar();
		
		

	}

}
