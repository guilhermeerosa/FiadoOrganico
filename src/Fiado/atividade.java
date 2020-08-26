package Fiado;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o numero de fiados: ");
		Integer f = Integer.valueOf(scanner.nextLine());
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		int[] fiados = new int[f];
		
		int i = 0;
		while (i < fiados.length) {
			System.out.print("Informe o valor da compra: ");
			fiados[i] = Integer.valueOf(scanner.nextLine());
			while (fiados[i] <= 0) {
				System.out.print("Valor invalido. Informe o valor da compra: ");
				fiados[i] = Integer.valueOf(scanner.nextLine());				
			}
			i++;
		}
		
		int total = somaWhile(fiados);
		
		System.out.println("Cliente " + nome + " deve: " + total);

	}
	
	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}
}