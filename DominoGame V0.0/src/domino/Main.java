package domino;

public class Main{
	public static void main(String[] args) {
		ManipuladorDeDomino manipulador = new ManipuladorDeDomino();
		manipulador.getJogador(0).setPontuacao(5);
		manipulador.getJogador(1).setPontuacao(3);
		System.out.println("MVP: " + manipulador.getMVP(manipulador.getJogadores()).getNome() + " - " + manipulador.getMVP(manipulador.getJogadores()).getPontuacao());
		System.out.println("Pontuação do jogador 0:" + manipulador.getJogador(0).getPontuacao());
		System.out.println("Pontuação do jogador 0:" + manipulador.getJogador(1).getPontuacao());
		System.out.println("Pontuação do jogador 0:" + manipulador.getJogador(2).getPontuacao());
		System.out.println("Pontuação do jogador 0:" + manipulador.getJogador(3).getPontuacao());
	}
	}