package baralho;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaralhoUno implements BaralhoInterface {
    private List<Carta> deck;
    private final int NUMBER_OF_CARDS = 113;
    private Random randomNumbers;

    public BaralhoUno() {
        String cores[] = { "Vermelho", "Azul", "Verde", "Amarelo" };

        deck = new ArrayList<>();
        randomNumbers = new Random();

        // Adiciona as cartas numeradas
        for (String cor : cores) {
            for (int i = 0; i <= 9; i++) {
                deck.add(new Carta(String.valueOf(i), cor, i)); // Carta 0 a 9
            }
        }

        // Adiciona cartas especiais
        for (String cor : cores) {
            // Compre duas, Inverter e Pular (2 de cada cor)
            for (int i = 0; i < 2; i++) {
                deck.add(new Carta("Compre duas", cor, 20));
                deck.add(new Carta("Inverter", cor, 20));
                deck.add(new Carta("Pular", cor, 20));
            }
        }

        // Cartas sem cor
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta("Compre 4", "Coringa", 50));
            deck.add(new Carta("Curinga", "Coringa", 50));
        }

        // Carta Trocar Mãos
        deck.add(new Carta("Trocar Mãos", "Coringa", 50));
    }

    @Override
    public void shuffle() {
        for (int first = 0; first < deck.size(); first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Carta temp = deck.remove(second);
            deck.add(0, temp);
        }
    }

    @Override
    public Carta dealCard() {
        return deck.remove(deck.size() - 1);
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public boolean hasCard() {
        return deck.size() > 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int column = 0;
        for (Carta card : deck) {
            column++;
            s.append(card.toString()).append("   ");
            if (column % 4 == 0) {
                s.append("\n");
                column = 0;
            }
        }
        return s.toString();
    }
}
