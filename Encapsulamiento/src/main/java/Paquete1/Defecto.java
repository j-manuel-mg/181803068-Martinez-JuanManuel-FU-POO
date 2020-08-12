
package Paquete1;

public class Defecto {
    
    String defecto;
    
    public void metodoDefecto(){
        System.out.println("Soy un metodo defecto");
    }

    @Override
    public String toString() {
        return "Defecto: "+ defecto;
    }
    
    
}
