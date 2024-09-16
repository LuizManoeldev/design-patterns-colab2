package main;
import baralho.BaralhoInterface;
import factory.BaralhoFactory;

public class MainBaralho {
   public static void main(String[] args) {
      BaralhoFactory factory = BaralhoFactory.getFactory("tradicional");
      BaralhoInterface baralhoTradicional = factory.criarBaralho();

      System.out.println("Baralho Tradicional:");
      System.out.println(baralhoTradicional);
      baralhoTradicional.shuffle();
      System.out.println("Após embaralhar:");
      System.out.println(baralhoTradicional);

      System.out.println("\n\nBaralho Uno:");
      factory = BaralhoFactory.getFactory("uno");
      BaralhoInterface baralhoUno = factory.criarBaralho();
      System.out.println(baralhoUno);
   }
}
