package cartas;

import utils.Cor;
import interfaces.CartaInterface;

public class CartaUno implements CartaInterface {

    private Cor cor;
    private String valor;

    public CartaUno(Cor cor, String valor) {
        this.cor = cor;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }

    @Override
    public String getDescricao(){
        return ""; 
    }

    
}
