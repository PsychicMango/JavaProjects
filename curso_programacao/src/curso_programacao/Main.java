package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		/*
		 * double renda = 4000.00; String nome = "Maria";
		 * 
		 * String produto1 = "Computador"; String produto2 = "Mesa de escritório";
		 * 
		 * int idade = 30; int codigo = 5290; char genero = 'F';
		 * 
		 * 
		 * double preco1 = 2100.0; double preco2 = 650.50; double medida = 53.234567;
		 */

		/*
		 * System.out.println("Bom dia!!"); System.out.println(idade);
		 * System.out.println(renda); System.out.printf("%.2f\n", renda);
		 * System.out.printf("%.4f\n", renda); //System.out.println("RESULTADO = " +
		 * idade + " METROS"); //System.out.printf("RESULTADO = %.2f metros\n", altura);
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade,
		 * renda);
		 * 
		 */
		/*
		 * System.out.println("Produtos:");
		 * System.out.printf("%s, no qual o preço é $ %.2f\n",produto1, preco1);
		 * System.out.printf("%s, no qual o preço é $ %.2f\n\n",produto2, preco2);
		 * System.out.printf("Registro: %d anos de idade, codigo %d e sexo: %c\n\n"
		 * ,idade, codigo ,genero);
		 * System.out.printf("Medida com oito casas decimais: %f\n", medida);
		 * System.out.printf("Medida arredondada (tres casas decimais): %.3f\n",
		 * medida); Locale.setDefault(Locale.US);
		 * System.out.printf("Medida estadunidense: %.3f\n", medida);
		 */
		String x;
		int y;
		double z;
		char a;
		x = leitor.next();
		y = leitor.nextInt();
		z = leitor.nextDouble();
		a = leitor.next().charAt(0);
		System.out.println("Voce digitou: " + x + " e possui " + y + " anos " + z + a);

		leitor.close();

	}

}
