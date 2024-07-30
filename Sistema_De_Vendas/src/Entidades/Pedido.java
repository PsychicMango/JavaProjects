package Entidades;

import java.util.Date;

import Entidades.enums.EstatusPedido;

public class Pedido {
	private Integer id;
	private Date momento;
	private EstatusPedido status;
	
	public Pedido(Integer id, Date momento, EstatusPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public EstatusPedido getStatus() {
		return status;
	}

	public void setStatus(EstatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
}
