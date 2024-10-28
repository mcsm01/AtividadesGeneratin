package salarioliquido;

import java.util.Scanner; 

public class SalarioLiquido {
	
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		
		float salario;
		float adicionalnoturno;
		float horasextras;
		float desconto;
		float salarioliquido;
		
		System.out.println("Digite seu Sálario:  ");
		salario = ler.nextFloat();
		
		System.out.println("Digite o Adicional noturno: ");
		adicionalnoturno = ler.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasextras = ler.nextFloat();
		
		System.out.println("Digite os descontos: ");
		desconto = ler.nextFloat();
		
		salarioliquido = salario + adicionalnoturno + (horasextras * 5) - desconto;
		
		System.out.println("Seu Sálario líquido é: " + salarioliquido);
		
		}
	}
