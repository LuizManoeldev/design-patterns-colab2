package interfaces;

import cartas.CartaTradicional;

public interface BaralhoInterface {
    void shuffle(); // Embaralhar

    CartaTradicional dealCard();

    int size();

    boolean hasCard();
}
