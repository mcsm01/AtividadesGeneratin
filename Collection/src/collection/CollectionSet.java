package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> inteiros = new HashSet<Integer>(10);
		
		System.out.println("Digite 10 números inteiros não repetidos: ");
		while (inteiros.size() < 10) {
			
			int numero = scanner.nextInt(); 
			if (inteiros.add(numero)) { 
				System.out.println("Digite mais um número: ");
				
			}
		
		}
		
		System.out.println("\nListar dados do Set:"); 
		Iterator<Integer> iterator = inteiros.iterator(); 
		
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
	}

}
