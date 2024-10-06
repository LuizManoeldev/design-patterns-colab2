package simple_actory;

import baralho.Baralho;
import interfaces.BaralhoInterface;

class BaralhoTradicionalFactory extends BaralhoSimpleFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new Baralho();
    }
}