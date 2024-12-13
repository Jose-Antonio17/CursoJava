package es.cursojava.arrays;

public class Arryas {

	public static void main(String[] args) {

  	  String [] colores = new String [4];
		
  	  colores [0] = "azul";
  	  colores [1] = "amarillo";
  	  colores [2] = "rojo";
  	  colores [3] = "verde";
  	  
  	  System.out.println(colores [0]);
  	  System.out.println(colores [1]);
  	  System.out.println(colores [2]);
  	  System.out.println(colores [3]);
  	  
  	String[] colores2 = {"Blanco","Negro"};
	
	for (int i=0; i<colores.length ; i++) {
		String color = colores[i];
		System.out.println(color);
	}
	
	System.out.println("===========================");
	//Bucle foreach
	for ( String color : colores ) {
		System.out.println(color);
  	  }
  	  

	}

}
