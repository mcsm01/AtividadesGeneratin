package salario;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String colaborador;
		int codigo;
		float salario;
		float novosalario;
		
		
		System.out.println("Nome do colaborador: ");
		colaborador = ler.next();
		
		System.out.println("Cargo: ");
			codigo = ler.nextInt();
		
		System.out.println("Salário: ");
			salario = ler.nextFloat();
			
			
		switch (codigo) {
			case 1: 
				novosalario = (float) (salario * 1.1);
				System.out.println(colaborador);
				System.out.println("Gerente");
				System.out.println(novosalario);
				break;
			case 2: 
				novosalario = (float) (salario * 1.07);
				System.out.println(colaborador);
				System.out.println("Vendedor");
				System.out.println(novosalario);
				break;
			case 3: 
				novosalario = (float) (salario * 1.09);
				System.out.println(colaborador);
				System.out.println("Supervisora");
				System.out.println(novosalario);
				break;
			case 4: 
				novosalario = (float) (salario * 1.06);
				System.out.println(colaborador);
				System.out.println("Motorista");
				System.out.println(novosalario);
				break;
			case 5: 
				novosalario = (float) (salario * 1.05);
				System.out.println(colaborador);
				System.out.println("Estoquista");
				System.out.println(novosalario);
				break;
			case 6: 
				novosalario = (float) (salario * 1.08);
				System.out.println(colaborador);
				System.out.println("Técnico de TI");
				System.out.println(novosalario);
				break;
		}
		
	}

}
