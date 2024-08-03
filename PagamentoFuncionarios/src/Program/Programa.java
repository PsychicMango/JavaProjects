package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		System.out.print("Informe a quantidade de funcionarios:");
		int func = leitor.nextInt();
		for(int i = 1; i <= func; i++) {
			System.out.printf("Funcionario #%d dados:\n",i);
			System.out.print("Terceirizado? (y/n)");
			char resp = leitor.next().charAt(0);
			System.out.println("Nome: ");
			leitor.nextLine();
			String nomeFunc = leitor.nextLine();
			System.out.println("Horas: ");
			int horas = leitor.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHora = leitor.nextDouble();
			if(resp == 'y') {
				System.out.print("Taxa Adicional: ");
				double taxaAdicional = leitor.nextDouble();
				lista.add(new FuncionarioTerceirizado(nomeFunc, horas, valorPorHora, taxaAdicional));
			}else {
				lista.add(new Funcionario(nomeFunc, horas, valorPorHora));
			}
			
		}
		System.out.println();
		System.out.println("Pagamento Final: ");
		for(Funcionario funcionario : lista) {
			System.out.printf("%s - $ %.2f",funcionario.getNome(), funcionario.pagamento());
		}
		leitor.close();
	}

}
