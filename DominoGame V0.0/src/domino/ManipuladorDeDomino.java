package domino;

import java.util.ArrayList;
import java.util.List;

import entity.Jogador;

public class ManipuladorDeDomino {
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public Jogador getMVP(List<Jogador> jogadores) {
		Jogador jogadorComMaiorPontuacao = null;
		int maiorPontuacao = 0;

		for (Jogador jogador : jogadores) {
			int pontuacao = jogador.getPontuacao();
			if (pontuacao > maiorPontuacao) {
				jogadorComMaiorPontuacao = jogador;
				maiorPontuacao = pontuacao;
			}
		}
		return jogadorComMaiorPontuacao;
	}

	public List<Jogador> getJogadores() {
		return this.jogadores;
	}

	public ManipuladorDeDomino() {
		gerarJogadores(5);
		jogoClassico();
	}

	public void jogoClassico(){
		List<Jogador> jogadores = getJogadores();
		for(Jogador jogador:jogadores)
		jogador.setPeca();
	}

	public void gerarJogadores(int numeroDeJogadores) {
		for (int i = 0; i < numeroDeJogadores; i++) {
			Jogador jogador = new Jogador();
			this.jogadores.add(jogador);
		}
	}

	public Jogador getJogador(int posicao) {
		if (this.jogadores.size() >= posicao) {
			Jogador jogador = this.jogadores.get(posicao);
			return jogador;
		} else {
			return null;
		}
	}

	public static void limparConsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}
