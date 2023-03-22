package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Peça {
	private List<Integer> peça = new ArrayList<Integer>();
	private List<Integer> lista = new ArrayList<Integer>();
	private List<Integer> deck = new ArrayList<Integer>();
	private int valor;
	private int score;

	public Peça(){	
	}
	
	public void setLista() {
	    for(int i=1; i <= 6; i++) {
	    	this.lista.add(0,i);
	    }
	}
	
	public void setPeça() {
		this.setLista();
		Collections.shuffle(this.lista);
		this.peça.add(lista.get(0));
		this.peça.add(lista.get(1));
	}
	
	public List<Integer> getDeck() {
		return deck;
	}

	public void setDeck() {
		this.deck.addAll(this.peça.subList(0, 2));
		this.peça.clear();
	}

	public List<Integer> getPeça(){
		return this.peça;
	}
	
	public void setValor(){
		int num1 = this.peça.get(0);
		int num2 = this.peça.get(1);
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
		if(j1.peça.getValor() > j2.peça.getValor()) {
			this.score += 1;
		}
		else if(j1.peça.getValor() == j2.peça.getValor()) {
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
		return "Peça: " + this.peça;
	}
	
	public String toStringDeck() {
		return "\nDeck: " + getDeck();
	}
	
	public String toStringValor() {
		return "\nValor: " + this.valor;
	}
}
