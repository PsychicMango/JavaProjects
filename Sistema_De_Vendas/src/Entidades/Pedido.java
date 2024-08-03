package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.enums.EstatusPedido;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private EstatusPedido status;
	private Cliente cliente;
	private List<PedidoItem> pedidoItens = new ArrayList<PedidoItem>();
	
	public Pedido() {
		
	}

	public Pedido(Date momento, EstatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaPedidoItem(PedidoItem pedidoItem) {
		pedidoItens.add(pedidoItem);
		
	}
	public void removePedidoItem(PedidoItem pedidoItem) {
		pedidoItens.remove(pedidoItem);
		
	}
	
	public double total() {
		double soma = 0.0;
		for(PedidoItem pi : pedidoItens) {
			soma += pi.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do Pedido: ");
		for(PedidoItem pi : pedidoItens) {
			sb.append(pi + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
