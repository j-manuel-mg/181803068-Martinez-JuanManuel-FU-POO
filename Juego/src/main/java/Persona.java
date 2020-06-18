
public class Persona {
    
    int vida;
    String nombre;
    Ak arma;
    
    public Persona() {
        this.vida = 100;
    }
    
    public Persona(String nombre) {
        this();
        this.nombre = nombre;
        this.arma = new Ak();
    }
    
    public void equiparArma(int opcion) {
        
        arma = new Ak(opcion);
    }
    
    public void recibirDanio(double danio){
        this.vida -= danio;
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nvida: " + vida
                + "\nArma " + arma;
    }
    
}
