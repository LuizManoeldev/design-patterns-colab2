package interfaces;

import cartas.CartaTradicional;

public interface BaralhoInterface {
    void shuffle();

    CartaTradicional dealCard();

    int size();

    boolean hasCard();
}
