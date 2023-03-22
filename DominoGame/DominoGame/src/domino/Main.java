package domino;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entity.Jogador;

public class Main{
	
	private static String vencedor;

	public static void clearConsole() {
	    for (int i = 0; i < 100; i++) {
	        System.out.println();
	    }
	}
	
	public static void main(String[]args) throws InterruptedException{
		String flag;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Para iniciar o jogo, pressione ENTER");
		flag = scan.nextLine();
		
		while(flag.equals("")) {
		
		long tempoEmMili = TimeUnit.SECONDS.toMillis(1);
		
		
		System.out.println("Bem-Vindo ao jogo !!");
		System.out.println("\nInsira o nome do jogador 1:");
		Jogador jogador1 = new Jogador();
		System.out.println("Insira o nome do jogador 2:");
		Jogador jogador2 = new Jogador();

		for(int i = 0; i<3; i++) {
			switch(i) {
			case 0:
				int rodada = i + 1;
				clearConsole();
				System.out.println("\nIniciando a " + rodada + "ª rodada em:");
				
				System.out.println("\n1");
				Thread.sleep(tempoEmMili);
				System.out.println("2");
				Thread.sleep(tempoEmMili);
				System.out.println("3");
				break;
			case 1:
				rodada = 2;
				Thread.sleep(tempoEmMili);
				clearConsole();
				System.out.println(rodada + "ª rodada:");
				break;
			case 2:
				rodada = 3;
				Thread.sleep(tempoEmMili);
				clearConsole();
				System.out.println(rodada + "ª rodada:");
				break;
			}
			
			jogador1.setBasics();
			jogador2.setBasics();
			
			System.out.println("\n Jogador 1" + "               " + " Jogador 2");
			System.out.println("Peça: " + jogador1.peça.getPeça() + "             " +  "Peça: " + jogador2.peça.getPeça());	
			System.out.println("Valor: " + jogador1.peça.getValor() + "                 " +  "Valor: " + jogador2.peça.getValor());	
			jogador1.peça.setScore(jogador1, jogador2);
			jogador2.peça.setScore(jogador2, jogador1);
			jogador1.peça.setDeck();
			jogador2.peça.setDeck();
			
			scan = new Scanner(System.in);
			System.out.println("\nPara continuar, pressione ENTER");
			flag = scan.nextLine();
		}
		
		clearConsole();
		setVencedor(jogador1, jogador2);
		System.out.println(vencedor != null?"O vencedor foi: " + vencedor + ", Parabéns!": "Empate.");
		System.out.println("\nJogador: " + jogador1.getNome() + jogador1.peça.toStringDeck() + "\nScore: "+jogador1.peça.getScore() + "\n\nJogador: " + jogador2.getNome() + jogador2.peça.toStringDeck() + "\nScore: "+jogador2.peça.getScore());
		
		scan.close();
		flag = "Fim!";
		System.out.println("Sistema finalizado com sucesso.");
	}
}

	static void setVencedor(Jogador jogador1, Jogador jogador2) {

			if(jogador1.peça.getScore() > jogador2.peça.getScore()) {
				vencedor = jogador1.getNome();
			} else if (jogador2.peça.getScore() > jogador1.peça.getScore()) {
				vencedor = jogador2.getNome();
			}
		}
	}