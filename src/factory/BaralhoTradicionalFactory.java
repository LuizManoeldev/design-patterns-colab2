package factory;

import baralho.Baralho;
import baralho.BaralhoInterface;

class BaralhoTradicionalFactory extends BaralhoFactory {
    @Override
    public BaralhoInterface criarBaralho() {
        return new Baralho();
    }
}