
import factory.BaralhoSimpleFactory;
import interfaces.BaralhoInterface;

public class Main {
   public static void main(String[] args) {
      BaralhoSimpleFactory factory = BaralhoSimpleFactory.getFactory("tradicional");
      BaralhoInterface baralhoTradicional = factory.criarBaralho();

      System.out.println("Baralho Tradicional:");
      System.out.println(baralhoTradicional);
      baralhoTradicional.shuffle();
      System.out.println("Após embaralhar:");
      System.out.println(baralhoTradicional);

      System.out.println("\n\nBaralho Uno:");
      factory = BaralhoSimpleFactory.getFactory("uno");
      BaralhoInterface baralhoUno = factory.criarBaralho();
      System.out.println(baralhoUno);
   }
}
