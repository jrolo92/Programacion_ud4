package ejercicio7.maquinaria;

import ejercicio7.personal.Mecanico;

public class Locomotora {
	private String matriculaId;
	private int potencia;
	private int annoFabricacion;
	Mecanico mecanico;
	
	//CONSTRUCTORES
	public Locomotora (String matriculaId, int potencia, int annoFabricacion, Mecanico mecanico) {
		this.matriculaId= matriculaId;
		this.potencia=potencia;
		this.annoFabricacion=annoFabricacion;
		this.mecanico= mecanico;
	}

}


