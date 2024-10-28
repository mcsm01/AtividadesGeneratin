package fluxograma;

import java.util.Scanner; 

public class SalarioAbono {
	
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		
		float salario;
		float abono;
		float somasalario;
		
		System.out.println("Digite o seu Sálario:  ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o seu Abono");
		abono = ler.nextFloat();
		
		somasalario = salario + abono;
		
		System.out.println("Seu Sálario no total é: " +somasalario);
	}

}
