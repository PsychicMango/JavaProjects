package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto:");
		System.out.println("Nome: ");
		String nome = leitor.nextLine();
		System.out.println("Preco: ");
	    double preco = leitor.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantidade = leitor.nextInt();
		Produto produto = new Produto(nome, preco, quantidade);

		System.out.println();
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		System.out.println("Entre a quantidade de produtos a ser adicionado ao estoque");
	    quantidade = leitor.nextInt();
		produto.adicionaProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);

		System.out.println();
		System.out.println("Entre a quantidade de produtos a ser removido do estoque");
		quantidade = leitor.nextInt();
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		leitor.close();

	}

}
