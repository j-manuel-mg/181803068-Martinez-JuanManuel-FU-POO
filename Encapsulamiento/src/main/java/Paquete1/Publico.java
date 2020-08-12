
package Paquete1;

public class Publico {
    
    public String publico;
    
    public void metodoPublico(){
        System.out.println("Soy un metodo publico");
    }

    @Override
    public String toString() {
        return "Publico: " + publico;
    }
    
}
