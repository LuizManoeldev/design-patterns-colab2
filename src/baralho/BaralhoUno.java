package baralho;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cartas.CartaTradicional;
import interfaces.BaralhoInterface;

public class BaralhoUno implements BaralhoInterface {
    private List<CartaTradicional> deck;
    private final int NUMBER_OF_CARDS = 113;
    private Random randomNumbers;

    public BaralhoUno() {
        String cores[] = { "Vermelho", "Azul", "Verde", "Amarelo" };

        deck = new ArrayList<>();
        randomNumbers = new Random();

        // Adiciona as cartas numeradas
        for (String cor : cores) {
            for (int i = 0; i <= 9; i++) {
                deck.add(new CartaTradicional(String.valueOf(i), cor, i)); // Carta 0 a 9
            }
        }

        // Adiciona cartas especiais
        for (String cor : cores) {
            // Compre duas, Inverter e Pular (2 de cada cor)
            for (int i = 0; i < 2; i++) {
                deck.add(new CartaTradicional("Compre duas", cor, 20));
                deck.add(new CartaTradicional("Inverter", cor, 20));
                deck.add(new CartaTradicional("Pular", cor, 20));
            }
        }

        // Cartas sem cor
        for (int i = 0; i < 4; i++) {
            deck.add(new CartaTradicional("Compre 4", "Coringa", 50));
            deck.add(new CartaTradicional("Curinga", "Coringa", 50));
        }

        // Carta Trocar Mãos
        deck.add(new CartaTradicional("Trocar Mãos", "Coringa", 50));
    }

    @Override
    public void shuffle() {
        for (int first = 0; first < deck.size(); first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            CartaTradicional temp = deck.remove(second);
            deck.add(0, temp);
        }
    }

    @Override
    public CartaTradicional dealCard() {
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
        for (CartaTradicional card : deck) {
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
