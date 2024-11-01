package vetor;

import java.util.Scanner;

public class Vetor1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] lista = {74, 8, 52, 7, 1, 78, 3, 45, 10, 36};
		
		System.out.print("Digite o número que você deseja encontrar:");
		int numeroint = scanner.nextInt();
		
		int posicaonum = -1;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == numeroint) {
				posicaonum = i;
				break;
			}
		}
		
		if(posicaonum != -1) {
			System.out.println("O número " + numeroint + " está localizado na posição: " + posicaonum); 
			} else { System.out.println("O número " + numeroint + " não foi encontrado!");
		}
		
	}

}
