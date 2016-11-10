package Libreria;

public class TryParse {
   public boolean esInteger(String dato){
       try {
           int numero=Integer.valueOf(dato);
           return true;
       } catch(Exception e) {
           return false;
       }
   } 
   public boolean esFloat(String dato){
       try {
           float numero=Float.valueOf(dato);
           return true;
       } catch(Exception e) {
           return false;
       }
   }    
}