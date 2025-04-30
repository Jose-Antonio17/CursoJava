package es.cursojava.hibernate.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_PEDIDOS")
public class Pedido {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripción;
    
    private Date fechaPedido;
    
    private int totalPedido;
    
    @ManyToOne
    @JoinColumn(name = "FK_CLIENTE")
    private Cliente cliente;

	public Pedido() {

	}

	public Pedido(String descripción, Date fechaPedido, int totalPedido) {
		super();
		this.descripción = descripción;
		this.fechaPedido = fechaPedido;
		this.totalPedido = totalPedido;
		this.cliente = null;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(int totalPedido) {
		this.totalPedido = totalPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
}
