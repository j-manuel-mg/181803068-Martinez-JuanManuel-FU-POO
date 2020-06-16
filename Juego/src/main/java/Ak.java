
//Culaquier clase que creamos minimo tine un contructor

//Clas de plantilla
public class Ak {

    //Atributo o caracteristicas
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int danio;
    
    //Constructor vacio
    public Ak(){
        
    }
    
    //Constructor con todos los atributos
    public Ak(String tipo, int cargador, int precision, double velocidadCarga, double precio, int danio) {
        this.tipo = tipo;
        this.cargador = cargador;
        this.precision = precision;
        this.velocidadCarga = velocidadCarga;
        this.precio = precio;
        this.danio = danio;
    }
    
    //Metodos --> acciones del objeto
    public String disparar() {
        return "Te estoy disparando con un daño de " + danio + " pts";
    }

    public void apuntar() {
        
    }

    public void cargar() {
        
    }
    
    //Metodo predefinido por Java
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
