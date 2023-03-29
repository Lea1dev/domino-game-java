package domino;

import java.util.ArrayList;
import java.util.List;

import entity.Jogador;

public class ManipuladorDeDomino extends Jogador{
    private List<Jogador> jogadores = new ArrayList<Jogador>();
// 	public static void clearConsole() {
// 	    for (int i = 0; i < 100; i++) {
// 	        System.out.println();
// 	    }
// 	}
	
// 	public static void main(String[]args) throws InterruptedException{
// 		String flag;
		
// 		Scanner scan = new Scanner(System.in);
// 		System.out.println("Para iniciar o jogo, pressione ENTER");
// 		flag = scan.nextLine();
// 		while(flag.equals("")) {
		
// 		long tempoEmMili = TimeUnit.SECONDS.toMillis(1);
		
		
// 		System.out.println("Bem-Vindo ao jogo !!");
// 		System.out.println("\nInsira o nome do jogador 1:");
// 		Jogador jogador1 = new Jogador();
// 		System.out.println("Insira o nome do jogador 2:");
// 		Jogador jogador2 = new Jogador();

// 		for(int i = 0; i<3; i++) {
// 			switch(i) {
// 			case 0:
// 				int rodada = i + 1;
// 				clearConsole();
// 				System.out.println("\nIniciando a " + rodada + "ª rodada em:");
				
// 				System.out.println("\n1");
// 				Thread.sleep(tempoEmMili);
// 				System.out.println("2");
// 				Thread.sleep(tempoEmMili);
// 				System.out.println("3");
// 				break;
// 			case 1:
// 				rodada = 2;
// 				Thread.sleep(tempoEmMili);
// 				clearConsole();
// 				System.out.println(rodada + "ª rodada:");
// 				break;
// 			case 2:
// 				rodada = 3;
// 				Thread.sleep(tempoEmMili);
// 				clearConsole();
// 				System.out.println(rodada + "ª rodada:");
// 				break;
// 			}
			
// 			jogador1.setBasics();
// 			jogador2.setBasics();
			
// 			System.out.println("\n Jogador 1" + "               " + " Jogador 2");
// 			System.out.println("Peça: " + jogador1.peca.getPeca() + "             " +  "Peça: " + jogador2.peca.getPeca());	
// 			System.out.println("Valor: " + jogador1.peca.getValor() + "                 " +  "Valor: " + jogador2.peca.getValor());	
// 			jogador1.peca.setScore(jogador1, jogador2);
// 			jogador2.peca.setScore(jogador2, jogador1);
// 			jogador1.peca.setDeck();
// 			jogador2.peca.setDeck();
			
// 			scan = new Scanner(System.in);
// 			System.out.println("\nPara continuar, pressione ENTER");
// 			flag = scan.nextLine();
// 		}
		
// 		clearConsole();
// 		setVencedor(jogador1, jogador2);
// 		System.out.println(vencedor != null?"O vencedor foi: " + vencedor + ", Parabéns!": "Empate.");
// 		System.out.println("\nJogador: " + jogador1.getNome() + jogador1.peca.toStringDeck() + "\nScore: "+jogador1.peca.getScore() + "\n\nJogador: " + jogador2.getNome() + jogador2.peca.toStringDeck() + "\nScore: "+jogador2.peca.getScore());
		
// 		scan.close();
// 		flag = "Fim!";
// 		System.out.println("Sistema finalizado com sucesso.");
// 	}
// }
    
	public Jogador getVencedor() {
        Jogador vencedor = jogadores[0];
        for(int i = 0; i< jogadores.length; i++){
            if(jogadores[i].getScore() > jogadores[i + 1].getScore()) {
				vencedor = jogadores[i];
			} 
        }
        return vencedor;
			// if(jogadores[0].getScore() > jogadores[1].getScore()) {
			// 	return jogador1;
			// } else if (jogador2.peca.getScore() > jogador1.peca.getScore()) {
			// 	vencedor = jogador2.getNome();
			// }
		}
}