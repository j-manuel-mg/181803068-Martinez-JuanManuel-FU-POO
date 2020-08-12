
package Paquete1;

public class Privado {
    
    private String privado;
    
    public void metodoPrivado(){
        System.out.println("Soy un metodo privado");
    }

    @Override
    public String toString() {
        return "Privado: " + privado;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }
    
    
}
