
package Paquete1;

public class Protegido {
    
    protected String protegido;
    
    public void metodoProtegido(){
        System.out.println("Soy un metodo protegido");
    }

    @Override
    public String toString() {
        return "Protegido: " + protegido;
    }
    
}
