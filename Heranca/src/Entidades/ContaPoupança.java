package Entidades;

public class ContaPoupança extends ContaBancaria {

	private Double rendimento;
	
	public ContaPoupança() {
		super();
	}

	public ContaPoupança(Integer numero, String proprietario, Double saldo, Double rendimento) {
		super(numero, proprietario, saldo);
		this.rendimento = rendimento;
	}

	public Double getRendimento() {
		return rendimento;
	}

	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * rendimento;
	}
	
	@Override
	public final void saque(double quantidade) {
		saldo -= quantidade;
	}
}
