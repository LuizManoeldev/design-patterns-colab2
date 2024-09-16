package factory;

import baralho.BaralhoInterface;
import baralho.BaralhoUno;

class BaralhoUnoFactory extends BaralhoFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new BaralhoUno();
    }
}