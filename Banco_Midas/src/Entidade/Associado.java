package Entidade;

public class Associado {

		private String nome;
		private int id;
		private double saldo;
		
		public Associado() {
			
		}
		
		public Associado(int id,String nome,double saldo) {
			this.id = id;
			this.nome = nome;
			deposito(saldo);
		}
		
		public Associado(int id,String nome) {
			this.id = id;
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getId() {
			return id;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public void deposito(double deposito) {
			saldo += deposito;
		}
		public void saque(double saque) {
			saldo = (saldo - saque) - 5.00;
		}
}
