package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Peca {
	private List<Integer> peca = new ArrayList<Integer>();
	private List<Integer> lista = new ArrayList<Integer>();
	private List<Integer> deck = new ArrayList<Integer>();
	private int valor;
	private int score;

	public Peca(){	
	}
	
	public void setLista() {
	    for(int i=1; i <= 6; i++) {
	    	this.lista.add(0,i);
	    }
	}
	
	public void setPeca() {
		this.setLista();
		Collections.shuffle(this.lista);
		this.peca.add(lista.get(0));
		this.peca.add(lista.get(1));
	}
	
	public List<Integer> getDeck() {
		return deck;
	}

	public void setDeck() {
		this.deck.addAll(this.peca.subList(0, 2));
		this.peca.clear();
	}

	public List<Integer> getPeca(){
		return this.peca;
	}
	
	
	public void setValor(){
		int num1 = this.peca.get(0);
		int num2 = this.peca.get(1);
		if(num1 == num2){
			this.valor = 2 * (num1 + num2);
		}
		else if((num1 % 2 != 0) && (num2 % 2 != 0) && (num1 != num2)){
			this.valor = (2 * Math.max(num1, num2)) - 1;
		}
		else{
			this.valor = num1 + num2;
		}
	}
	
	public void setScore(Jogador j1, Jogador j2) {
		if(j1.peca.getValor() > j2.peca.getValor()) {
			this.score += 1;
		}
		else if(j1.peca.getValor() == j2.peca.getValor()) {
			this.score += 1;
		}
		}

	public int getScore() {
		return score;
	}

	public int getValor(){
		return this.valor;
	}

	@Override
	public String toString() {
		return "peca: " + this.peca;
	}
	
	public String toStringDeck() {
		return "\nDeck: " + getDeck();
	}
	
	public String toStringValor() {
		return "\nValor: " + this.valor;
	}
}
