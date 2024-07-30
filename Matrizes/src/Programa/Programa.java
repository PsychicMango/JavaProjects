package Programa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		int[][] matriz = new int[n][n];
		for(int i= 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;i++) {
				matriz[i][j] = leitor.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL: ");
		for(int i= 0; i < matriz.length;i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		int contador = 0;
		for(int i= 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;i++) {
				if(matriz[i][j] < 0)
					contador++;
			}
		}
		System.out.println(contador);
		leitor.close();
	}


}
