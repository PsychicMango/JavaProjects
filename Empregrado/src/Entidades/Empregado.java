package Entidades;

public class Empregado {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public void aumento(double aumento) {
		 double porcentagem = (aumento/100) * salarioBruto;
		 salarioBruto += porcentagem;
		
	}
	
	public void taxacao() {
		 salarioBruto = salarioBruto - taxa;
	}
}
