package entity;

import java.util.Scanner;

public class Jogador extends Peca{
	protected String nome;
	protected Peca peca;
	public int pontuacao;

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	protected Scanner scanName;
	
	public Jogador() {
		this.setNome();
		this.peca = new Peca();
		this.pontuacao = 0;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome() {
		try{
			scanName = new Scanner(System.in);
			this.nome = scanName.nextLine();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setBasics() {
		peca.setPeca();
		peca.setValor();
		}
	
	@Override
	public String toString() {
		return "Jogador: " + nome + "\npeca: " + this.peca.getPeca();
	}
	
}
