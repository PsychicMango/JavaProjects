package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.ContratoHora;
import Entidades.Departamento;
import Entidades.Funcionario;
import Entidades.enums.NivelCargo;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Entre com o nome do departamento:");
		String departamento = leitor.nextLine();
		System.out.print("Informe os dados do Funcionario:");
		System.out.println("Nome: ");
		String nomeFuncionario = leitor.nextLine();
		System.out.println("Cargo: ");
		String nivelCargo = leitor.nextLine();
		System.out.println("Salario Base: ");
		double salarioBase = leitor.nextDouble();
		Funcionario funcionario = new Funcionario(nomeFuncionario, NivelCargo.valueOf(nivelCargo), salarioBase, new Departamento(departamento));
		
		System.out.print("Quantos contratos tem o funcionario? ");
		int contratos = leitor.nextInt();
		for(int i = 0; i <= contratos; i++) {
			System.out.printf("Informe o contrato #%d dados:\n",i);
			System.out.printf("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(leitor.next());
			System.out.printf("Valor por Hora: ");
			double valorPorHora = leitor.nextDouble();
			System.out.printf("Duração (horas): ");
			int horas = leitor.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato,valorPorHora, horas);
			funcionario.adicionarContrato(contrato);
			
		}
		System.out.println();
		System.out.print("Informe mes e ano para calcular a renda (MM/YYYY): ");
		String mesEAno = leitor.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.printf("Nome: %s\n",funcionario.getNome());
		System.out.printf("Departamento: %s\n",funcionario.getDepartamento().getNome());
		System.out.printf("Renda do : %s %.2f\n",mesEAno,funcionario.renda(ano, mes));
		leitor.close();

	}

}
