package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		System.out.print("Quantos funcionarios serao registrados? ");
		int n = leitor.nextInt();
		
		for(int  i = 0; i < n;i++) {
			System.out.printf("Empregado #%d:\n",i+1);
			System.out.printf("Id:\n");
			Integer id = leitor.nextInt();
			while(existeId(lista,id)) {
				System.out.println("Id ja cadastrado! Informe novamente");
				id = leitor.nextInt();
			}
			System.out.printf("Nome:\n");
			leitor.nextLine();
			String nome = leitor.nextLine();
			System.out.printf("Salario:\n");
			Double salario = leitor.nextDouble();
			Funcionario func = new Funcionario(nome,id,salario);
			lista.add(func);

			
		}
		System.out.println("Informe o id do funcionario que tera aumento");
		int idAumento = leitor.nextInt();
		//Resulocao longa = Integer pos = posicao(lista,idAumento);
		/*Resolucao curta*/ Funcionario func = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		if(func == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.print("Informe a porcentagem");
			double procentagem = leitor.nextDouble();
			func.aumentoSal(procentagem);
		}
		System.out.println();
		System.out.println("Lista de funcionarios:");
		for(Funcionario e : lista)
			System.out.println(e);
		
		
		leitor.close();
	}
	/*Forma de resolução longa*/
	public static Integer posicao(List<Funcionario> lista, int id) {
		for(int i = 0; i< lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean existeId(List<Funcionario> lista, int id) {
		 Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		 return func != null;
	}

}
