package simple_actory;

import interfaces.BaralhoInterface;

public abstract class BaralhoSimpleFactory {
    public abstract BaralhoInterface criarBaralho();

    public static BaralhoSimpleFactory getFactory(String tipo) {
        
        if (tipo.equalsIgnoreCase("tradicional")) {

            return new BaralhoTradicionalFactory();

        } else if (tipo.equalsIgnoreCase("uno")) {

            return new BaralhoUnoFactory();

        }
        throw new IllegalArgumentException("Tipo de baralho desconhecido");
    }
}




