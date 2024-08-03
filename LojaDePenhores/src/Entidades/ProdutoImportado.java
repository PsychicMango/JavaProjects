package Entidades;

public final class ProdutoImportado extends Produto {

	private Double taxaAlfandegaria;
	
	
	public ProdutoImportado() {
		super();
	}


	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}
	
	public double precoTotal() {
		 return getPreco() + taxaAlfandegaria;
	}
	
	@Override
	public String etiquetaProduto() {
		return nome + " $ " + precoTotal() + " (Taxa alfandegária) " + taxaAlfandegaria;
	}
	
}
