package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor =  new Scanner(System.in);
		/*
		int n = leitor.nextInt();
		double[] vetor = new double[n];
		for(int i = 0; i < n; i++) {
			vetor[i] = leitor.nextDouble();
		}
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double media = soma/n;
		System.out.println("MEDIA = " + media );
		*/
		
		int n = leitor.nextInt();
		Produto[] vetor = new Produto[n];
		for(int i = 0; i < vetor.length; i++) {
			leitor.nextLine();
			String nome = leitor.nextLine();
			double preco = leitor.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		double soma = 0.0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma/vetor.length;
		System.out.println("MEDIA = " + media );
		leitor.close();
	}

}
