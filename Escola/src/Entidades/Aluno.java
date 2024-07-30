package Entidades;

public class Aluno {
	
	public String nome;
	public double nota1,nota2,nota3;
	
	public double calcNota() {
		return nota1 + nota2 + nota3;
	}
}
