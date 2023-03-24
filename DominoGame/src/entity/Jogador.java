package entity;

import java.util.Scanner;

public class Jogador{
	private String nome;
	public Peca peca;
	public String vencedor;
	private Scanner scanName;
	
	public Jogador() {
		setNome();
		this.peca = new Peca();
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome() {
		scanName = new Scanner(System.in);
		this.nome = scanName.nextLine();
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
