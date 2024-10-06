package cartas;

import interfaces.CartaInterface;
import utils.Cor;

public class CartaTradicional implements CartaInterface{

   private String naipe;
   private Cor cor; 
   private int valor;

   public CartaTradicional(String naipe, int valor, Cor cor ){
      this.naipe = naipe; 
      this.valor = valor;
      this.cor = cor;
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

   @Override
   public String getDescricao() {
      return "";
   }
   
} 


