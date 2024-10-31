package laco_for;

import java.util.Scanner;

public class Laco_For {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo:  ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Digite o último número do intervalo: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 >= numero2) {
			System.out.println("Intervalo inválido");
			return;
		}
		
		for(int i = numero1; i<= numero2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {;
			System.out.println(i + " é múltiplo de 3 e 5 ");
			
			}
			
		}

	}
}