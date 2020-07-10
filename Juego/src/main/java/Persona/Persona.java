package Persona;


import Arma.Ak;


public class Persona {
    
    private int vida;
    private String nombre;
    private Ak arma;
    
    public Persona() {
        this.vida = 100;
    }
    
    public Persona(String nombre) {
        this();
        this.nombre = nombre;
        this.arma = new Ak();
    }
    
    //--------------------------Nuevos
    
    public String menuAk(){
        return this.arma.menuAk();
    }
    
    public double disparar(){
        return this.arma.disparar();
    }
    
    //--------------------------
    
    public void equiparArma(int opcion) {
        
        arma = new Ak(opcion);
    }
    
    public void recibirDanio(double danio){
        this.vida -= danio;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ak getArma() {
        return this.arma;
    }

    public void setArma(Ak arma) {
        this.arma = arma;
    }
    
    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nvida: " + vida
                + "\nArma " + arma;
    }
    
}
