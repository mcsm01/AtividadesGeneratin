package condicional;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numeroA;
		int numeroB;
		int numeroC;
		int soma;
		
		System.out.println("Digite o número A: ");
		numeroA = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		numeroB = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		numeroC = ler.nextInt();
		
		soma = numeroA + numeroB;
		
		if (soma > numeroC) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < numeroC) {
			System.out.println("A Soma de A + B é Menor do que C");
			
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
	}

}
