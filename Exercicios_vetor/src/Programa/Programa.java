package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor =  new Scanner(System.in);
		
		/* Atividade 1
		System.out.println("Quantos numeros ira digitar?");
		int n = leitor.nextInt();
		if(n > 10 || n < 0) {
			do {
				System.out.print("Informe um numero valido: ");
				n = leitor.nextInt();
				
			}while(n > 10 || n < 0);
		}
		int[] vetor = new int[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = leitor.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) 
				System.out.printf("%d\n",vetor[i]);
		
		}
		*/
		
		/*Atividade 2
		double soma = 0.0;
		System.out.println("Quantos numeros ira digitar?");
		int n = leitor.nextInt();
		double[] vetor = new double[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = leitor.nextDouble();
			soma += vetor[i];
		}
		System.out.print("VALORES: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("%.2f ",vetor[i]);
		}
		System.out.printf("\n");
		System.out.printf("SOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", soma/vetor.length);
		*/
		leitor.close();
		
		
	}
}
