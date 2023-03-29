package domino;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entity.Jogador;

public class Main{
	public static void main(String[] args) {
		System.out.println("O nome do jogador é: ");
		ManipuladorDeDomino manipulador = new ManipuladorDeDomino();
		System.out.println(manipulador.getVencedor());
	}
	}