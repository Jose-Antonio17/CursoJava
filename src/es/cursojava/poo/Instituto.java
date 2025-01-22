package es.cursojava.poo;

public class Instituto {
	
	public static void main(String [] args) {
		
		String [] asignaturasAlumno1 = {"Algebra","Fisica"};
		Alumno Alumno1 = new Alumno ("Jorge", "Rufo",32,6,"jorge@gmail.com");
		Alumno1.setAsignaturas(asignaturasAlumno1);
		
		String [] asignaturasAlumno2 = {"Historia","Ingles","Arte"};
		Alumno Alumno2 = new Alumno ("Sergio", "Melero",28,10,"sergio@gmail.com");
		Alumno2.setAsignaturas(asignaturasAlumno2);
		
		String [] asignaturasAlumno3 = {"Matematica","Quimica","Fisica"};
		Alumno Alumno3 = new Alumno ("Jose", "Cordoba",35,8,"jose@gmail.com",asignaturasAlumno3);
		
		Alumno Alumno4 = new Alumno ();
		Alumno4.setNombre("Diego");
		Alumno4.setApellidos("Condori");
		Alumno4.setEdad(28);
		Alumno4.setNotaMedia(2);
		Alumno4.setEmail("diego@gmail.com");
		String [] asignaturasAlumno4 = {"Lengua","Musica","Arte"};
		Alumno4.setAsignaturas(asignaturasAlumno4);
		
		Alumno [] alumnosInstituto = {Alumno1, Alumno2, Alumno3, Alumno4};
		
		System.out.println("Lista de estudiantes");
		
		for(Alumno alumnoArray : alumnosInstituto ) {
				System.out.println("--------------");
				System.out.println(alumnoArray.getNombre());
				alumnoArray.estudiar();
				System.out.println("Asignaturas:");
				for(String asignaturas : alumnoArray.getAsignaturas()) {
					System.out.println("  " + asignaturas);
				}
			
		}
	}

}
