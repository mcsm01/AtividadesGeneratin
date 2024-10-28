package diferencaproduto;

import java.util.Scanner;

public class DiferencaProduto {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferencaproduto;
		
		System.out.println("Digite o primeira numero:  ");
		numero1 = ler.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextFloat();
		
		System.out.println("Digite o terceira numero: ");
		numero3 = ler.nextFloat();
		
		System.out.println("Digite o quarta numero: ");
		numero4 = ler.nextFloat();
		
		diferencaproduto = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("A diferença do produtoé " + diferencaproduto);
	}

}
