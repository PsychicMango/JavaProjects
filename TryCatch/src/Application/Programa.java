package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		metodo1();
		
		System.out.println("fim do pograma");
		

	}
	
	public static void metodo1() {
		System.out.println("Metodo 1 start");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	public static void metodo2() {
		System.out.println("Metodo 2 start");
		Scanner leitor = new Scanner(System.in);
		try {
			String[] vetor = leitor.nextLine().split(" ");
			int pos = leitor.nextInt();
			System.out.println(vetor[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida!!");
			e.printStackTrace();
			leitor.next();
		} catch (InputMismatchException e) {
			System.out.println("Input invalido!!");
		}
		leitor.close();
		System.out.println("Fim do metodo 2");
	}

}
