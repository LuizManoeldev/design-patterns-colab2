package cartas;

import utils.Cor;

public class CartaTradicional 
{
   private String face; 
   private String naipe; 
   private Cor cor;
   private int valor;

   // construtor de dois argumentos inicializa face e naipe da carta
   public CartaTradicional( String face, String naipe, int valor )
   {
	   this(face, naipe, valor, Cor.PRETO);
   } 
   
   // construtor de dois argumentos inicializa face e naipe da carta
   public CartaTradicional( String face, String naipe, int valor, Cor cor )
   {
      this.face = face; 
      this.naipe = naipe; 
      this.valor = valor;
      this.cor = cor;
   } 


   public String getFace() {
	  return face;
   }

   public int getValor() {
	   return valor;
   }
   
   public Cor getCor() {
	   return cor;
   }


   public String getNaipe() {
	  return naipe;
   }

   public void setValue(int value) {
      this.valor = value;
   }
   
   // retorna representa��o String de Card
   public String toString()               
   {                                      
      return String.format("%6s", face) + " de " + cor.ansiCode() + naipe + Cor.RESET.ansiCode() + ", valor " + valor;        
   } // fim do m�todo toString
   

} // fim da classe Card


