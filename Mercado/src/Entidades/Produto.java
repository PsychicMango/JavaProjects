package Entidades;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double totalEstoque() {
		return preco * quantidade;
	}
	
	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() 
	{
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f", totalEstoque());
	}
}
