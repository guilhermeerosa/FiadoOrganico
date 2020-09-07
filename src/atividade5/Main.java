package atividade5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
				
		System.out.print("Informe o telefone do cliente: ");
		String fone = scanner.nextLine();
		
		System.out.print("Informe o numero de compras: ");
		Integer compras = Integer.valueOf(scanner.nextLine());
		
		Consumidor consumidor = new Consumidor(nome, fone, compras);
		
		int c = 0;
		while(c < compras) {
			System.out.print("Informe o valor da compra: ");
			int fiado = Integer.valueOf(scanner.nextLine());
			consumidor.registrarFiado(fiado);
			c++;
		}
		
		int total = consumidor.getFiado();
		
		if (total > 100 ) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " reais - ganhou brinde");
		}
		else {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " reais");
		}
		
		System.out.println("Telefone para contato é: " + consumidor.getFone());
		scanner.close();
	}

}
