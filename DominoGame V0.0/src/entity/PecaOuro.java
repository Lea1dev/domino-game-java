package entity;

public class PecaOuro extends Peca {

    public PecaOuro(){
    }
     // valor atribuído a pedra será a subtração do maior número presente na pedra pelo menor número presente na
// pedra

    @Override
    public void setValor(){
        int faceEsquerda = this.getFaces().get(0);
		int faceDireita = this.getFaces().get(1);

        if(faceEsquerda < faceDireita){
            this.valor = faceDireita - faceEsquerda;
        }
        else{
            this.valor = faceEsquerda - faceDireita;
        }
    }
}
