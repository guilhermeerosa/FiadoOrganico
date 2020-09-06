package atividade5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		//consumidor.fiados = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.print("Informe o numero de compras: ");
		Integer compras = Integer.valueOf(scanner.nextLine());
		
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

	}

}
