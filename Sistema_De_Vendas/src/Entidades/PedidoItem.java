package Entidades;


public class PedidoItem {

	private Integer quantidade;
	private Double precoPedido;
	
	private Produto produto;
	
	public PedidoItem() {
		
	}

	public PedidoItem(Integer quantidade, Double precoPedido,Produto produto) {
		this.quantidade = quantidade;
		this.precoPedido = precoPedido;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoPedido() {
		return precoPedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return precoPedido * quantidade    ;
	}

	@Override
	public String toString() {
		return getProduto().getNomeProduto() + ", $"  
	+ String.format("%.2f", precoPedido) + ", Quantidade: " + quantidade 
	+ ", Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	
}
