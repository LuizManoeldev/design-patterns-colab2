package baralho;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Baralho implements BaralhoInterface {
   private List<Carta> deck;
   private final int NUMBER_OF_CARDS = 52;
   private Random randomNumbers;

   public Baralho() {
      String faces[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };
      String naipes[] = { "\u2665", "\u2666", "\u2663", "\u2660" };

      deck = new ArrayList<>();
      randomNumbers = new Random();

      for (int count = 0; count < NUMBER_OF_CARDS; count++) {
         deck.add(new Carta(faces[count % 13], naipes[count / 13], 0,
               naipes[count / 13] == "\u2665" || naipes[count / 13] == "\u2666" ? Cor.VERMELHO : Cor.PRETO));
      }
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
