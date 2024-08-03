package Entidades;

public class FuncionarioTerceirizado extends Funcionario {

	private Double taxaExtra;
	
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorPorHora, Double taxaExtra) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.taxaExtra = taxaExtra;
	}

	public Double getTaxaExtra() {
		return taxaExtra;
	}

	public void setTaxaExtra(Double taxaExtra) {
		this.taxaExtra = taxaExtra;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + taxaExtra * 1.1;
	}
	
}
