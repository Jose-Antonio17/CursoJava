package es.cursojava.inicio;

public class VariablesJava {
	//Variables de instancia
	public static void main(String[] args) {
		//Variables locales
		
		//Tipos primitivos
		
			// Numeros
			byte numeroPequeno = 1; //-128 y 127
			short numeroMediano = 100; //-32.768 y 32.767
			int numero = 9; //-2^31 y 2^31-1
			long numeroMuyGrande = 1000; //-2^63 y 2^63-1
			
			//Decimales
			double numeroDecinal = 9.7;
			float numeroDecimal = 20.8f;
			
			//Caracteres
			char caracter=' ';
			
			//Booleanos
			boolean esPar = true;
		
		//Variables de tipo objeto y arrays
			String nombre = "Jose Luis"; //Objeto
			numero = 8;
			int [] numeros = {0,1,2,3}; //Array
			
		//Declarar variables
			//Tipo --> el tipo de informacion que almacena
			//nombre --> nombre de la variable
			byte edad; //Declarar una variable
			byte edadProfe=18; // Declarar e inicializar
			
		System.out.println(nombre + " " + (edadProfe + 30));
	}
}
