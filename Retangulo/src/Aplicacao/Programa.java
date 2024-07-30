package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor =  new Scanner(System.in);
		Retangulo ret = new Retangulo();
		System.out.println("Informe as medidas do retangulo: ");
		ret.altura = leitor.nextDouble();
		ret.largura = leitor.nextDouble();
		System.out.printf("AREA = %.2f\n",ret.area());
		System.out.printf("PERIMETRO = %.2f\n",ret.perimetro());
		System.out.printf("DIAGONAL = %.2f\n",ret.diagonal());
		leitor.close();
		
		

	}

}
