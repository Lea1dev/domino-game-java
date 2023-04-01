package domino;

public class Main {
	public static void main(String[] args) {
		ManipuladorDeDomino manipulador = new ManipuladorDeDomino();
		System.out.println(manipulador.getJogador(0).getPeca());
		System.out.println(manipulador.getJogador(1).getPeca());
		System.out.println(manipulador.getJogador(2).getPeca());
	}
}