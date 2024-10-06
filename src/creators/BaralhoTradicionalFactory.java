package creators;

import baralhos.Baralho;
import factory.BaralhoSimpleFactory;
import interfaces.BaralhoInterface;

class BaralhoTradicionalFactory extends BaralhoSimpleFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new Baralho();
    }
}