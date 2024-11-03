package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++) {
			System.out.println();
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
