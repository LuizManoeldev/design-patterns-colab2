package creators;

import baralhos.BaralhoUno;
import factory.BaralhoSimpleFactory;
import interfaces.BaralhoInterface;

class BaralhoUnoFactory extends BaralhoSimpleFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new BaralhoUno();
    }
}