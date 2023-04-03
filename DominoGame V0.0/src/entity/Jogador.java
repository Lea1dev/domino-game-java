package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
	protected String nome;
	private Peca peca = new Peca();
	private List<Peca> packDePecas = new ArrayList<Peca>();
	private int pontuacao;

	public Peca getPeca() {
		return peca;
	}

	public List<Peca> getPackDePecas() {
		return this.packDePecas;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao += pontuacao;
	}

	protected Scanner scanName;

	public Jogador() {
		this.setNome();
		this.pontuacao = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public void setTipoPeca(String opcao) {
		if (opcao.equals("Ouro") || opcao.equals("ouro")) {
			this.peca = new PecaOuro();
		}

		if (opcao.equals("Diamante") || opcao.equals("diamante")) {
			this.peca = new PecaDiamante();
		}
	}

	public void setNome() {
		try {
			scanName = new Scanner(System.in);
			System.out.println("Qual o nome do jogador? ");
			this.nome = scanName.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "\nJogador: " + this.nome + "\npeca: " + this.peca.getFaces() + "\nAvaliação da Peça:"
				+ this.peca.getValor() + "\nPontuação do jogador: " + this.pontuacao;
	}

	public String toStringFinal() {
		return "\nJogador: " + this.nome + "\nPontuação do jogador: " + this.pontuacao;
	}
}
