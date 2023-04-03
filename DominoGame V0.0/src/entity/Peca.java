package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Peca {
	private List<Integer> faces = new ArrayList<Integer>();
	private List<Integer> lista = new ArrayList<Integer>();
	// private List<Integer> deck = new ArrayList<Integer>();
	protected int valor;

	public Peca() {
	
	}

	public void setLista() {
		for (int i = 1; i <= 6; i++) {
			this.lista.add(0, i);
		}
	}

	public List<Integer> getFaces() {
		return faces;
	}

	public void setFaces() {
		this.setLista();
		Collections.shuffle(this.lista);
		this.faces.clear();
		this.faces.add(lista.get(0));
		this.faces.add(lista.get(1));
	}

	public void setValor() {
		int faceEsquerda = this.faces.get(0);
		int faceDireita = this.faces.get(1);
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
		return "peca: " + this.faces;
	}

	public String toStringValor() {
		return "\nValor: " + this.valor;
	}

	public List<Integer> getLista() {
		return lista;
	}
}
