package Entidades;

public abstract class ContaBancaria {

	private Integer numero;
	private String proprietario;
	protected Double saldo;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(Integer numero, String proprietario, Double saldo) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
}
