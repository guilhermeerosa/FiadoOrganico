package atividade5;

public class Consumidor {
	
	//Atributos
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String fone;
	
	//Construtor
	public Consumidor (String nome, String fone, int compras) {
		this.nome = nome;
		this.fone = fone;
		this.fiados = new int [compras];
	}
	
	//GETTER e SETTER
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int valor : fiados) {
			total += valor;
		}
		return total;
	}
	
	public String getFone() {
		return this.fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}

}
