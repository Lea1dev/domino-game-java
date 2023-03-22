package entity;

import java.util.Scanner;

public class Jogador{
	private String nome;
	public Peça peça;
	public String vencedor;
	private Scanner scanName;
	
	public Jogador() {
		setNome();
		this.peça = new Peça();
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome() {
		scanName = new Scanner(System.in);
		this.nome = scanName.nextLine();
	}
	
	public void setBasics() {
		peça.setPeça();
		peça.setValor();
		}
	
	@Override
	public String toString() {
		return "Jogador: " + nome + "\nPeça: " + this.peça.getPeça();
	}
	
}
