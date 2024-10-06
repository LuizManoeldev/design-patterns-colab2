package simple_actory;

import baralho.BaralhoUno;
import interfaces.BaralhoInterface;

class BaralhoUnoFactory extends BaralhoSimpleFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new BaralhoUno();
    }
}