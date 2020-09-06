package Fiado;

public class Consumidor {
	
	//Atributos
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	
	//Construtor
	public Consumidor (String nome) {
		this.nome = nome;
		this.fiados = new int [10];
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
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}
