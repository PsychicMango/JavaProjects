package Funcoes;

import java.util.Scanner;

public class AprendendoFunc {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a, b, c;
		System.out.println("DIGITE TRES NUMEROS: ");
		a = leitor.nextInt();
		b = leitor.nextInt();
		c = leitor.nextInt();

		int maior = max(a, b, c);
		showResult(maior);
		leitor.close();

	}

	public static int max(int x,int y, int z) 
	{
		int aux;
		if (x > y && x > z)
			aux = x;
		else if (y > z)
			aux = y;
		else
			aux = z;
		
		return aux;
		
	}
	
	public static void showResult(int valor) 
	{
		System.out.println("MAIOR = " + valor );
	}

}
