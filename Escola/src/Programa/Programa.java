package Programa;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		Aluno al = new Aluno();
		al.nome = leitor.nextLine();
		al.nota1 = leitor.nextDouble();
		al.nota2 = leitor.nextDouble();
		al.nota3 = leitor.nextDouble();
		System.out.printf("NOTA FINAL = %.2f\n", al.calcNota());
		if(al.calcNota() > 60.00) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - al.calcNota());
		}
		leitor.close();

	}

}
