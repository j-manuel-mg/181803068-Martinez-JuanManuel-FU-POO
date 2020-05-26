
//Clas de plantilla
public class Ak {
    
    //Atributo o caracteristicas
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    
    //Metodos --> acciones del objeto
    public void disparar(){
        System.out.println("Te estoy disparando con un daño de " + danio);
    }
    
    public void apuntar(){
        
    }
    
    public void cargar(){
        
    }

    @Override
    public String toString() {
        return "\nTipo: " + tipo
             + "\nCargador: " + cargador
             + "\nPrecision: " + precision
             + "\nVelocidad de carga: " + velocidadCarga
             + "\nPrecio: " + precio
             + "\nDaño: " + danio;
    }
    
}

