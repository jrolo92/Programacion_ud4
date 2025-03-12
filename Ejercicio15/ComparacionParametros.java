package Ejercicio15;

public class ComparacionParametros {
	 public static void modificarPrimitivo(int numero) {
	        numero = numero * 2;
	        System.out.println("Dentro del método, numero = " + numero);
	    }
	    
	    public static void modificarObjeto(StringBuilder texto) {
	        texto.append(" modificado");
	        System.out.println("Dentro del método, texto = " + texto);
	    }
	    
	    public static void main(String[] args) {
	        int valorPrimitivo = 5;
	        StringBuilder valorObjeto = new StringBuilder("Hola");
	        
	        System.out.println("Antes de llamar al método, valorPrimitivo = " + valorPrimitivo);// El valor de valorPrimitivo es 5.
	        modificarPrimitivo(valorPrimitivo);//Llamamos a la función que multiplica el numero * 2 (10).
	        System.out.println("Después de llamar al método, valorPrimitivo = " + valorPrimitivo);// El valor se sigue manteniendo en 5.
	        
	        System.out.println("\nAntes de llamar al método, valorObjeto = " + valorObjeto); // El valor de valorObjeto es "Hola"
	        modificarObjeto(valorObjeto);// Llamamos a la función que le añade 'modificado' al final al valor del objeto ("Hola modificado")
	        System.out.println("Después de llamar al método, valorObjeto = " + valorObjeto);// Devuelve "Hola modificado"
	        
	        /*
	         * Cuando es de tipo primitivo, el valor de una vv no se cambia al usar un método 
	         * Solo se cambiará dentro del metodo, pero la vv fuera del método se mantiene igual.
	         * Sin embargo, cuando es de tipo Objeto, las modificaciones que se hagan del valor de esa vv 
	         * hará que cambie el valor fuera del método.Ésto tambien sirve para los Strings solo 
	         * cuando se usa append. 
	         */
	    }

}
