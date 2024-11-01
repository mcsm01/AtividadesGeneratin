package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vetorInteiro[] = new int[10];
		int soma = 0;
		double media;

		System.out.println("Digite 10 números inteiros:");

		for (int i = 0; i < 10; i++) {
			System.out.print("vetor: ");
			vetorInteiro[i] = scanner.nextInt();
			soma += vetorInteiro[i];
		}
		System.out.print("Elementos nos índices ímpares: ");
		for (int n = 0; n < 10; n++)
		{
			if (vetorInteiro[n] % 2 != 0) {
				System.out.print(vetorInteiro[n] + " ");
			}
			
		}
		
		System.out.print("Elementos pares: ");
		for (int n = 0; n < 10; n++)
		{
			if (vetorInteiro[n] % 2 == 0) {
				System.out.print(vetorInteiro[n] + " ");
			}
			
		}

		
		System.out.println("Soma: " + soma);
		media = (double) soma / 10;
		System.out.println("Média: " + String.format("%.2f", media));

	}

}
