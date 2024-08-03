package Program;

import java.util.ArrayList;
import java.util.List;

import Entidades.ContaBancaria;
import Entidades.ContaEmpresarial;
import Entidades.ContaPoupança;

public class Programa {

	public static void main(String[] args) {
		
		
		List<ContaBancaria> listaBancaria =new ArrayList<>();
		
		listaBancaria.add(new ContaPoupança(1001, "Alex", 500.00, 0.01));
		listaBancaria.add(new ContaEmpresarial(1002, "Maria", 1000.00, 400.00));
		listaBancaria.add(new ContaPoupança(1003, "Logan", 300.00, 0.01));
		listaBancaria.add(new ContaEmpresarial(1004, "Bob", 500.00, 500.00));
		
		double soma = 0.0;
		for(ContaBancaria cb : listaBancaria) {
			soma += cb.getSaldo();
		}
		System.out.printf("SALDO TOTAL: %.2f\n", soma);
		
		for(ContaBancaria cb : listaBancaria) {
		    cb.deposito(10);
		}
		
		for(ContaBancaria cb : listaBancaria) {
		    System.out.printf("Deposito recebido na conta %d %.2f\n ",cb.getNumero(),cb.getSaldo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		ContaBancaria cb1 = new ContaBancaria(1001, "Alex", 1000.00);
		cb1.saque(200.00);
		System.out.println(cb1.getSaldo());
		
		ContaBancaria cb2 = new ContaPoupança(1002, "Maria", 1000.00, 0.01);
		cb2.saque(200.00);
		System.out.println(cb2.getSaldo());
		
		ContaBancaria cb3 = new ContaEmpresarial(1003, "bob", 1000.00, 500.00);
		cb3.saque(200.00);
		System.out.println(cb3.getSaldo());

		/*
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		ContaBancaria cb = new ContaBancaria(1001, "Alex", 0.0);
		ContaEmpresarial ce = new ContaEmpresarial(1002, "Maria", 0.0, 500.00);
		//UPCASTING
		 
		ContaBancaria cb1 = ce;
		ContaBancaria cb2 = new ContaEmpresarial(1003, "Marcos", 0.0, 200.00);
		ContaBancaria cb3 = new ContaPoupança (1004, "Saguadin", 0.0, 200.00);
		
		//DOWNCASTING
		ContaEmpresarial ce1 = (ContaEmpresarial) cb2;
		ce1.emprestimo(100.0);
		//ContaEmpresarial ce2 = (ContaEmpresarial) cb3;
		if (cb3 instanceof ContaEmpresarial) {
			ContaEmpresarial ce2 = (ContaEmpresarial) cb3;
			 ce2.emprestimo(200.0);
			 System.out.println("Emprestimo!");
		}
		if(cb3 instanceof ContaPoupança) {
			ContaPoupança cp1 = (ContaPoupança) cb3;
			cp1.atualizarSaldo();
			System.out.println("Atualizado!");
			
			
		}
		*/
	}

}
