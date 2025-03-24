import es.cursojava.poo.herencia.ejercicios.vehiculos.MainVehiculos;

public class PruebaJar {

public static void main(String[] args) {
		
	        int a = 5;
	        modifyPrimitive(a);
	        System.out.println("a = " + a);  // a will still be 5 because primitive types are passed by value
	        
	        MyObject obj = new MyObject();
	        obj.value = 5;
	        modifyObject(obj);
	        System.out.println("obj.value = " + obj.value);  // obj.value will be 10 because objects are passed by reference
	    }

	    public static void modifyPrimitive(int x) {
	        x = 10;  // This change won't affect the original variable 'a'
	    }

	    public static void modifyObject(MyObject o) {
	        o.value = 10;  // This will modify the object because it is passed by reference
	    }
	}

	class MyObject {
	    int value;
	}
