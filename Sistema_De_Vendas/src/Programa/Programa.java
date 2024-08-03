package Programa;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.Pedido;
import Entidades.PedidoItem;
import Entidades.Produto;
import Entidades.enums.EstatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe os dados do cliente:");
		System.out.print("Nome: ");
		String nome = leitor.nextLine();
		System.out.print("Email: ");
		String email = leitor.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(leitor.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println("Informe os dados do pedido: ");
		System.out.print("Stauts: ");
		EstatusPedido status = EstatusPedido.valueOf(leitor.next());
		Pedido pedido = new Pedido(new Date(), status, cliente);
		System.out.println("Quantos itens tera o pedido?: ");
		int itens = leitor.nextInt();
		for(int i = 1; i <= itens; i++) {
			System.out.printf("Informe o item #%d dados:\n",i);
			System.out.printf("Nome do produto: ");
			String nomeProduto = leitor.nextLine();
			leitor.nextLine();
			System.out.printf("Preco do produto: ");
			double valorProduto = leitor.nextDouble();
			System.out.printf("Quantidade: ");
			int quantidade = leitor.nextInt();
			
			Produto prod = new Produto(nomeProduto, valorProduto);
			
			PedidoItem pi = new PedidoItem(quantidade, valorProduto, prod);
			pedido.adicionaPedidoItem(pi);
		}
		System.out.println();
		System.out.println(pedido);

	}
}


