
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
    }
    
    public void equiparArma(int opcion) {
        switch (opcion) {
            case 1:
                arma = new Ak("Bronce", 5, 75, 5, 1000, 10);
                break;
            case 2:
                arma = new Ak("Plata", 8, 70, 4.5, 2300, 11);
                break;
            case 3:
                arma = new Ak("Oro", 10, 85, 4.3, 2500, 13);
                break;
            case 4:
                arma = new Ak("diamante", 20, 95, 3, 4000, 20);
                break;
            case 5:
                arma = new Ak("Adamantium", 30, 100, 1, 10000, 27);
                break;
        }
    }
    
    public String disparar() {
        return "Te estoy disparando con un daño de " + arma.danio + " pts";
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nvida: " + vida
                + "\nArma " + arma;
    }
    
}
