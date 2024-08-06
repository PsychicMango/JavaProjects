package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		try {
		String[] vetor = leitor.nextLine().split(" ");
		int pos = leitor.nextInt();
		System.out.println(vetor[pos]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!!");
		}
		catch(InputMismatchException e) {
			System.out.println("Input invalido!!");
		}
		leitor.close();

	}

}
