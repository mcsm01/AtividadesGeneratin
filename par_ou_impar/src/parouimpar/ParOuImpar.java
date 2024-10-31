package parouimpar;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
				
		System.out.println("Digite o número: ");
		numero = ler.nextInt();
		
		if (numero %2 == 0 && numero > 0) {
			System.out.printf("O Número " + numero + " é par e positivo!");
			
		} else {
				System.out.printf("O Número " + numero +  " é ímpar e negativo!");
			}
	}

}