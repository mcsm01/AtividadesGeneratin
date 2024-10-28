package notasmedias;

import java.util.Scanner; 

public class NotasMedias {
	
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float medianota;
		
		System.out.println("Digite sua primeira nota:  ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		nota4 = ler.nextFloat();
		
		medianota = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media da sua nota é: " + medianota);
	}

}

