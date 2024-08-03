package Entidades;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class ProdutoUsado extends Produto {

	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
		
	}
	
	
	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}


	@Override
	public String etiquetaProduto(){
		return nome + " (usado)" + " $ " + preco + " (Data de fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +")";
	}

}
