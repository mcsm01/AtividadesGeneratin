package condicional_swich2;

import java.util.Scanner;

public class Condicional_Swich2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float numero1;
		float numero2;
		float resultado;
		int operacao;
		
		
		System.out.println("Digite o 1º número: ");
			numero1 = ler.nextFloat();
			
		System.out.println("Digite o 2º número: ");
			numero2 = ler.nextFloat();
			
		System.out.println("Operação: ");
			operacao = ler.nextInt();
			
			
		switch (operacao) {
			case 1: 
				resultado = numero1 + numero2;
				System.out.println(resultado);
				break;
			case 2: 
				resultado = numero1 - numero2;
				System.out.println(resultado);
				break;
			case 3: 
				resultado = numero1 * numero2;
				System.out.println(resultado);
			case 4: 
				resultado = numero1 / numero2;
				System.out.println(resultado);
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
		}
	}

}
