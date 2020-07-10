package Arma;

public class Ak extends Armas {

    //Atributo o caracteristicas
    String tipo;

    //Constructor vacio
    public Ak() {

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

    public Ak(int tipo) {
        switch (tipo) {
            case 1:
                this.tipo = "Madera";
                this.cargador = 4;
                this.precision = 20;
                this.velocidadCarga = 1;
                this.precio = 1;
                this.danio = 10;
                break;
            case 2:
                this.tipo = "Bronce";
                this.cargador = 5;
                this.precision = 75;
                this.velocidadCarga = 5;
                this.precio = 1000;
                this.danio = 10;
                break;
            case 3:
                this.tipo = "plata";
                this.cargador = 8;
                this.precision = 70;
                this.velocidadCarga = 4.5;
                this.precio = 2300;
                this.danio = 11;
                break;
            case 4:
                this.tipo = "Oro";
                this.cargador = 10;
                this.precision = 85;
                this.velocidadCarga = 4.3;
                this.precio = 2500;
                this.danio = 13;
                break;
            case 5:
                this.tipo = "Diamante";
                this.cargador = 20;
                this.precision = 95;
                this.velocidadCarga = 3;
                this.precio = 4000;
                this.danio = 20;
                break;
            case 6:
                this.tipo = "Adamantium";
                this.cargador = 30;
                this.precision = 100;
                this.velocidadCarga = 1;
                this.precio = 10000;
                this.danio = 27;
                break;
        }
    }

    public String menuAk() {
        String menu = "\nMenu: "
                + "\n1.- Madera"
                + "\n2.- Bronce"
                + "\n3.- Plata"
                + "\n4.- Oro"
                + "\n5.- Diamante"
                + "\n6.- Adamantium"
                + "\nOpcion: ";
        return menu;
    }

    public double disparar() {
        return (this.danio * this.precision) / 100;
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
