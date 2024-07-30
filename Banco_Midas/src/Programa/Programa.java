package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Associado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Associado ass;
		System.out.println("INFORME O NUMERO DA CONTA: ");
		int id = leitor.nextInt();
		leitor.nextLine();
		System.out.println("INFORME O NOME DO DONO DA CONTA: ");
		String nome = leitor.nextLine();
		System.out.println("EXISTE UM VALOR INICIAL DE DEPÓSITO? (Y/N)");
		char opcao = leitor.next().charAt(0);
		if(opcao == 'Y' || opcao == 'y') {
			double deposito = leitor.nextDouble();
			ass = new Associado(id,nome,deposito);
		}else {
			ass = new Associado(id, nome);
		}
		System.out.println("DADOS DA CONTA: ");
		System.out.printf("Conta %d, Proprietario: %s, Saldo: $ %.2f",ass.getId(), ass.getNome(), ass.getSaldo());
		System.out.println();
		System.out.println("INFORME UM VALOR DE DEPOSITO: ");
		double deposito = leitor.nextDouble();
		ass.deposito(deposito);
		System.out.println("DADOS ATUALIZADOS DA CONTA");
		System.out.printf("Conta %d, Proprietario: %s, Saldo: $ %.2f",ass.getId(), ass.getNome(), ass.getSaldo());
		System.out.println();
		System.out.println("INFORME UM VALOR DE SAQUE: ");
		double saque = leitor.nextDouble();
		ass.saque(saque);
		System.out.println("DADOS ATUALIZADOS DA CONTA");
		System.out.printf("Conta %d, Proprietario: %s, Saldo: $ %.2f",ass.getId(), ass.getNome(), ass.getSaldo());
		leitor.close();

	}

}
