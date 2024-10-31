package laco_while;

import java.util.Scanner;

public class Laco_While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		int menor21 = 0;
		int maior50 = 0;
		
		
		
		while(true) {	
			
			System.out.println("Digite uma idade:");
			idade = scanner.nextInt();
			
			if (idade < 0) {
				break;
			}
			
			
			if (idade < 21) {
				menor21++;
				
			} else if (idade <= 50) {
					maior50++;
			}
				
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

	}
}
