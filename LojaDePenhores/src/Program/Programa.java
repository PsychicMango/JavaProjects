package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner leitor = new Scanner(System.in);
		List<Produto> listaProduto = new ArrayList<>();
		System.out.println("Informe a quantidade de produtos");
		int p = leitor.nextInt();
		for (int i = 1; i <= p; i++) {
			System.out.printf("Dados do produto #%d: \n", i);
			System.out.printf("Comum,usado ou importado?: (c/u/i)");
			
			char tipoProd = leitor.next().charAt(0);
			if (tipoProd == 'i') 
			{	leitor.nextLine();
				System.out.printf("Nome: ");
				String nomeProd = leitor.nextLine();
				System.out.printf("Preço: ");
				double preco = leitor.nextDouble();
				System.out.printf("Taxa Alfandegária: ");
				double taxaAlfandegaria = leitor.nextDouble();
				listaProduto.add(new ProdutoImportado(nomeProd, preco, taxaAlfandegaria));
			}
			else if(tipoProd == 'u')
			{	
				leitor.nextLine();
				System.out.printf("Nome: ");
				String nomeProd = leitor.nextLine();
				System.out.printf("Preço: ");
				double preco = leitor.nextDouble();
				System.out.printf("Data de Fabricação (DD/MM/YYYY): ");
				LocalDate dataFabricacao = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				listaProduto.add(new ProdutoUsado(nomeProd, preco, dataFabricacao));
			}
			else if(tipoProd == 'c') 
			{
				leitor.nextLine();
				System.out.printf("Nome: ");
				String nomeProd = leitor.nextLine();
				System.out.printf("Preço: ");
				double preco = leitor.nextDouble();
				listaProduto.add(new Produto(nomeProd, preco));
			}
			
			
		}
		System.out.println();
		System.out.println("Etiquetas de preço:");
		for(Produto prod: listaProduto) {
			System.out.println(prod.etiquetaProduto());
		}

		leitor.close();

	}

}
