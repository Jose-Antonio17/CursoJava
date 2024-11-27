package es.cursojava.inicio;

public class OperadoresAritmeticos {

	public static void main (String [] args) {
		
		int num= 4;
		System.out.println(num/4); // resultado
		System.out.println(num%4); // muestra el resto
		
		//operador ++ suma 1 a la varible sobre la que se aplica
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
		
		//num = num + 3
		//System.out.println(num+=3);
		
		//num = num * 3
		//System.out.println(num*=3);
		
		int num2 = 10;
		System.out.println(num+num2); //num mantiene su valor
		System.out.println(num);
		System.out.println(num+=num2); //num modifica su valor
		System.out.println(num); 
	}
	
}
