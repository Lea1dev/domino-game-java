package entity;

public class PecaDiamante extends Peca {

    public PecaDiamante() {
    }

    // o valor atribuído a pedra será a subtração do quadrado do maior número
    // presente na pedra pelo quadrado do
    // menor número presente na pedra

    @Override
    public void setValor(){
        int faceEsquerda = this.getFaces().get(0);
		int faceDireita = this.getFaces().get(1);

        if(faceEsquerda < faceDireita){ // operador exponencial não funcionou.
            this.valor = (faceDireita * faceDireita) - (faceEsquerda * faceEsquerda);
        }
        else{
            this.valor = (faceEsquerda * faceEsquerda) - (faceDireita * faceDireita);
        }
    }
}
