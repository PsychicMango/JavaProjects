package Entidades;

public class ContaEmpresarial extends ContaBancaria {
	
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
		super(numero, proprietario, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double quantidade) {
		if(quantidade <= limiteEmprestimo)
			saldo += quantidade - 10.0;
	}
	
	@Override
	public void saque(double quantidade) {
		super.saque(quantidade);
		saldo -= 2.0;
	}
}
