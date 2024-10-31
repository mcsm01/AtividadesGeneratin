package do_while;

import java.util.Scanner;

public class Do_While {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numint;
		int soma = 0;
		
			
		do {
			System.out.println("Digite uma número:");
			numint = scanner.nextInt();
			
			
			if (numint > 0) {
				soma += numint;
			}	
			
		}while(numint != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
	}

}
