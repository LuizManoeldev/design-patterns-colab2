package factory;

import baralho.BaralhoInterface;

public abstract class BaralhoFactory {
    public abstract BaralhoInterface criarBaralho();

    public static BaralhoFactory getFactory(String tipo) {
        if (tipo.equalsIgnoreCase("tradicional")) {
            return new BaralhoTradicionalFactory();
        } else if (tipo.equalsIgnoreCase("uno")) {
            return new BaralhoUnoFactory();
        }
        throw new IllegalArgumentException("Tipo de baralho desconhecido");
    }
}




