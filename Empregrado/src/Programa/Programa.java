package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Empregado emp = new Empregado();
		System.out.println("Nome: ");
		emp.nome = leitor.nextLine();
		System.out.println("Salario Bruto: ");
		emp.salarioBruto = leitor.nextDouble();
		System.out.println("Taxa: ");
		emp.taxa = leitor.nextDouble();
		emp.taxacao();
		System.out.println();
		System.out.printf("Empregado: %s, $ %.2f", emp.nome, emp.salarioBruto);
		System.out.println();
		System.out.println("Qual a porcentagem de aumento de salario? ");
		emp.aumento(leitor.nextDouble());
		System.out.println();
		System.out.printf("Dados atualizados: %s, $ %.2f",emp.nome,emp.salarioBruto);
		leitor.close();
	}

}
