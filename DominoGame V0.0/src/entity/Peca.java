package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peca {
	private List<Integer> peca = new ArrayList<Integer>();
	private List<Integer> lista = new ArrayList<Integer>();
	private List<Integer> deck = new ArrayList<Integer>();
	private int valor;

	public Peca() {

	}

	public void setLista() {
		for (int i = 1; i <= 6; i++) {
			this.lista.add(0, i);
		}
	}

	public List<Integer> getPeca() {
		return peca;
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

	public void setValor() {
		int faceEsquerda = this.peca.get(0);
		int faceDireita = this.peca.get(1);
		if (faceEsquerda == faceDireita) {
			this.valor = 2 * (faceEsquerda + faceDireita);
		} else if ((faceEsquerda % 2 != 0) && (faceDireita % 2 != 0) && (faceEsquerda != faceDireita)) {
			this.valor = (2 * Math.max(faceEsquerda, faceDireita)) - 1;
		} else {
			this.valor = faceEsquerda + faceDireita;
		}
	}

	public int getValor() {
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

	public List<Integer> getLista() {
		return lista;
	}
}
