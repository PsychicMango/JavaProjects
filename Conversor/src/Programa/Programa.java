package Programa;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Programa {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner leitor = new Scanner(System.in);
			double dolar, compra;
			System.out.println("Qual o preço do dolar? ");
			dolar = leitor.nextDouble();
			System.out.println("Quanto sera comprado de dolar?");
			compra = leitor.nextDouble();
			System.out.printf("Quantidade a ser paga em reais: %.2f", Conversor.converteDolar(compra, dolar));
			leitor.close();
	}

}
