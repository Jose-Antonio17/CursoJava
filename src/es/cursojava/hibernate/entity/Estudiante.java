package es.cursojava.hibernate.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Estudiante {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    //@OneToOne
    @JoinColumn(name = "carnet_id") // crea la foreign key en la tabla Usuario
    private CarnetDeBiblioteca carnetDeBiblioteca ;
    
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, CarnetDeBiblioteca carnetDeBiblioteca) {
		super();
		this.nombre = nombre;
		this.carnetDeBiblioteca = carnetDeBiblioteca;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CarnetDeBiblioteca getCarnetDeBiblioteca() {
		return carnetDeBiblioteca;
	}

	public void setCarnetDeBiblioteca(CarnetDeBiblioteca carnetDeBiblioteca) {
		this.carnetDeBiblioteca = carnetDeBiblioteca;
	}
    
}
