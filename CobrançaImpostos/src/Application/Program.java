package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Impostos;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		List<Impostos> listaImpostos = new ArrayList<>();

		System.out.printf("Informe a quantidade de pagadores de impostos: ");
		int pag = leitor.nextInt();
		for (int i = 1; i <= pag; i++) {
			System.out.printf("Pagante numero #%d:\n", i);
			System.out.print("Pessoa Física ou Juridica?: (f/j) ");
			char resp = leitor.next().charAt(0);
			if (resp == 'f') {
				System.out.print("Nome: ");
				String nome = leitor.next();
				System.out.print("Renda Anual: ");
				double renda = leitor.nextDouble();
				System.out.print("Gastos com saude: ");
				double gastosComSaude = leitor.nextDouble();
				listaImpostos.add(new PessoaFisica(nome, renda, gastosComSaude));
			} else {
				System.out.print("Nome: ");
				String nome = leitor.next();
				System.out.print("Renda Anual: ");
				double renda = leitor.nextDouble();
				System.out.print("Quantidade de Funcionarios: ");
				int funcionarios = leitor.nextInt();
				listaImpostos.add(new PessoaJuridica(nome, renda, funcionarios));
			}

		}

		System.out.println();
		System.out.println("Taxas a pagar: ");
		double soma = 0.0;
		for (Impostos imp : listaImpostos) {
			System.out.printf("%s $ %.2f\n", imp.getNome(), imp.taxa());
			soma += imp.taxa();
		}
		System.out.printf("Total dos impostos: %.2f",soma);

		leitor.close();

	}

}
