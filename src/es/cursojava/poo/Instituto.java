package es.cursojava.poo;

public class Instituto {
	
	public static void main(String [] args) {
		
		String [] asignaturasAlumno1 = {"Algebra","Fisica"};
		Alumno alumno1 = new Alumno ("Jorge", "Rufo",32,6,"jorge@gmail.com");
		alumno1.setAsignaturas(asignaturasAlumno1);
		
		String [] asignaturasAlumno2 = {"Historia","Ingles","Arte"};
		Alumno alumno2 = new Alumno ("Sergio", "Melero",28,10,"sergio@gmail.com");
		alumno2.setAsignaturas(asignaturasAlumno2);
		
		String [] asignaturasAlumno3 = {"Matematica","Quimica","Fisica"};
		Alumno alumno3 = new Alumno ("Jose", "Cordoba",35,8,"jose@gmail.com",asignaturasAlumno3);
		
		Alumno alumno4 = new Alumno ();
		alumno4.setNombre("Diego");
		alumno4.setApellidos("Condori");
		alumno4.setEdad(28);
		alumno4.setNotaMedia(2);
		alumno4.setEmail("diego@gmail.com");
		String [] asignaturasAlumno4 = {"Lengua","Musica","Arte"};
		alumno4.setAsignaturas(asignaturasAlumno4);
		//Alumno4.setAsignaturas(new String [] {""Lengua","Musica","Arte""})   ...ejemplo de como enviar un array sin declararlo antes
		
		Alumno [] alumnosInstituto = {alumno1, alumno2, alumno3, alumno4};
		
		System.out.println("Lista de estudiantes");
		
		for(Alumno alumnoArray : alumnosInstituto ) {
				System.out.println("--------------");
				System.out.println(alumnoArray.getNombre());
				alumnoArray.estudiar();
				System.out.println("Asignaturas:");
				for(String asignaturas : alumnoArray.getAsignaturas()) {
					System.out.println("\t" + asignaturas);  //si un array es null dara error, usar un if(array!=null)
				}
			
		}
	}

}
