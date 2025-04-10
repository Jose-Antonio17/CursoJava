package es.cursojava.hibernate.entity;

import java.util.Calendar;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CarnetDeBiblioteca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date fechaEmision;
    
    private Date fechaExpiracion;

    //Bidireccional
    @OneToOne(mappedBy = "carnetDeBiblioteca")
    private Estudiante estudiante;
    
    
	public CarnetDeBiblioteca() {

	}


	public CarnetDeBiblioteca(Date fechaEmision) {

		this.fechaEmision = fechaEmision;
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaEmision);
        calendar.add(Calendar.YEAR, 1);
        this.fechaExpiracion = calendar.getTime();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getFechaEmision() {
		return fechaEmision;
	}


	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}


	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}


	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


}
