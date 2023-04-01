package entity;

import java.util.Scanner;

public class Jogador extends Peca{
	protected String nome;
	protected Peca peca;
	public int pontuacao;

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	protected Scanner scanName;
	
	public Jogador() {
		this.setNome();
		this.pontuacao = 0;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome() {
		try{
			scanName = new Scanner(System.in);
			System.out.println("Qual o nome do jogador? ");
			this.nome = scanName.nextLine();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Jogador: " + nome + "\npeca: " + this.peca.getPeca();
	}
	
}
