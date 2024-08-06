package Entidades;

public final class PessoaJuridica extends Impostos {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncioanrios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncioanrios;
	}


	public Integer getNumeroDeFuncioanrios() {
		return numeroDeFuncionarios;
	}


	public void setNumeroDeFuncioanrios(Integer numeroDeFuncioanrios) {
		this.numeroDeFuncionarios = numeroDeFuncioanrios;
	}


	@Override
	public double taxa() {
		if(numeroDeFuncionarios < 10) {
			return getRendaAnual() * 0.16;
		}else {
			return getRendaAnual() * 0.14;
		}
	}

}
