package condicional_switch;

import java.util.Scanner;

// não prestrei atenção e não usei o Swich.

public class CondicionalSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		String[] produtos = new String[6];
		
		produtos[0] = "Cachorro Quente";
		produtos[1] = "X-Salada";
		produtos[2] = "X-Bacon";
		produtos[3] = "Bauru";
		produtos[4] = "Refrigerante";
		produtos[5] = "Suco de laranja";
		
		float [] precos = new float[6];
		
		precos[0] = (float) 10.00;
		precos[1] = (float) 15.00;
		precos[2] = (float) 18.00;
		precos[3] = (float) 12.00;
		precos[4] = (float) 8.00;
		precos[5] = (float) 13.00;
		
		int codigo;
		int quantidade;
		float valortotal;
		
		System.out.println("Código do Produto: ");
			codigo = ler.nextInt();
			
		System.out.println("Quantidade: ");
			quantidade = ler.nextInt();
			
		valortotal = quantidade * precos[codigo - 1];
		
		System.out.println("Produto: " + produtos[codigo -1]);
		System.out.println("Valor total: " + valortotal);

	}

}
