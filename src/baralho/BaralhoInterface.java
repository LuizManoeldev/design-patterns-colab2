package baralho;
public interface BaralhoInterface {
    void shuffle(); // Embaralhar

    Carta dealCard(); // Distribuir

    int size();

    boolean hasCard();
}
