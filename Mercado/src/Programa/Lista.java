package Programa;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(10000);
		list.add(2, 200);
		
		System.out.println(list.size());
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		list.removeIf(i -> i == 1000);
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		System.out.println("INDEX OF 10000: " + list.indexOf(10000));
		System.out.println("INDEX OF 0: " + list.indexOf(0));
		System.out.println("--------------------");

	}

}