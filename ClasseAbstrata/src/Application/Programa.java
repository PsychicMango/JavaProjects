package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Circulo;
import Entidades.Forma;
import Entidades.Retangulo;
import Entidades.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		List<Forma> listaFormas = new ArrayList<>();
		
		System.out.print("Informe a quantidaded e formas: ");
		int f = leitor.nextInt();
		for(int i = 1; i <= f; i++) {
			System.out.printf("Dados da figura #%d:\n ",i);
			System.out.print("Retangulo ou circulo? (r/c) ");
			char ch = leitor.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(leitor.next());
			if(ch == 'r') {
				System.out.print("Largura: ");
				double largura = leitor.nextDouble();
				System.out.print("Altura: ");
				double altura = leitor.nextDouble();
				listaFormas.add(new Retangulo(cor, largura, altura));
			}else {
				System.out.print("Raio: ");
				double raio = leitor.nextDouble();
				listaFormas.add(new Circulo(cor, raio));
			}
			System.out.println();
			System.out.println("Area de formas");
			for(Forma formas : listaFormas) {
				System.out.println(formas.area());
			}
		}
		
		
		
		leitor.close();

	}

}
