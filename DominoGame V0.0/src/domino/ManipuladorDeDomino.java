package domino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entity.Jogador;

public class ManipuladorDeDomino {
	private List<Jogador> jogadores = new ArrayList<Jogador>();

	public ManipuladorDeDomino() {
		gerarJogadores(5);
	}

	public void gameLoop() {
		Scanner scan = new Scanner(System.in);
		boolean opcaoValida = false;
		String opcao = "";
	
		while (!opcaoValida) {
			try {
				System.out.println("Informe o tipo de jogo (Classico/Diamante/Ouro): ");
				opcao = scan.nextLine();
	
				switch (opcao.toLowerCase()) {
					case "classico":
						setTipoJogo(opcao);
						opcaoValida = true;
						break;
					case "diamante":
						setTipoJogo(opcao);
						opcaoValida = true;
						break;
					case "ouro":
						setTipoJogo(opcao);
						opcaoValida = true;
						break;
					default:
						throw new Exception("Opção inválida. Tente novamente.");
				}
	
				System.out.println("Informe o número de rodadas entre 3 e 7: ");
				int qtdRodadas = scan.nextInt();
	
				if (qtdRodadas >= 3 && qtdRodadas <= 7) {
					setRodada(qtdRodadas);
				} else {
					throw new Exception("Quantidade de rodadas inválida. Tente novamente.");
				}
	
				mostrarInformacoesFinais();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scan.nextLine(); // Limpa o buffer do scanner para evitar loop infinito
			}
		}
		scan.close();
	}
	

	public void setRodada(int qtdRodadas) {
		for (int i = 0; i <= qtdRodadas - 1; i++) {
			limparConsole();
			System.out.println("--------- RODADA " + (i + 1) + " --------- ");
			distribuirPecas(i);

			for (Jogador jogador : jogadores) {
				jogador.getPackDePecas().get(i).setValor();
			}
			distribuirPontuacao(i);
			mostrarInformacoes();
			System.out.println("Aperte Enter para continuar.");
			Scanner scan = new Scanner(System.in);
			scan.nextLine();
		}
	}

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

	public void distribuirPontuacao(int rodadaAtual) {
		int maiorValor = Integer.MIN_VALUE;
		int segundoMaiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;

		for (Jogador jogador : jogadores) {
			int valorPeca = jogador.getPackDePecas().get(rodadaAtual).getValor();

			if (valorPeca > maiorValor) {
				segundoMaiorValor = maiorValor;
				maiorValor = valorPeca;
			} else if (valorPeca <= maiorValor && valorPeca > segundoMaiorValor) {
				segundoMaiorValor = valorPeca;
			}
			if (valorPeca < menorValor) {
				menorValor = valorPeca;
			}
		}

		for (Jogador jogador : jogadores) {
			int valorPeca = jogador.getPackDePecas().get(rodadaAtual).getValor();

			if (valorPeca == maiorValor) {
				jogador.setPontuacao(3);
			} else if (valorPeca == segundoMaiorValor) {
				jogador.setPontuacao(2);
			} else if (valorPeca == menorValor) {
				jogador.setPontuacao(1);
			}
		}
	}

	public List<Jogador> getJogadores() {
		return this.jogadores;
	}

	public void gerarJogadores(int numeroDeJogadores) {
		for (int i = 0; i < numeroDeJogadores; i++) {
			Jogador jogador = new Jogador();
			this.jogadores.add(jogador);
		}
	}

	public void distribuirPecas(int rodadaAtual) {
		try {
			for (Jogador jogador : this.jogadores) {
				jogador.getPeca().setFaces();
				jogador.getPackDePecas().add(jogador.getPeca());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mostrarInformacoes() {
		for (Jogador jogador : jogadores) {
			System.out.println(jogador.toString());
		}
	}

	public void mostrarInformacoesFinais() {
		limparConsole();
		System.out.println("\nO vencedor da partida foi, " + getMVP(jogadores).getNome() + " Parabéns!");
		for (Jogador jogador : jogadores) {
			System.out.println(jogador.toStringFinal());
		}
	}

	public void setTipoJogo(String opcao) {
		for (Jogador jogador : jogadores) {
			jogador.setTipoPeca(opcao);
		}
	}

	public static void limparConsole() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}
}
