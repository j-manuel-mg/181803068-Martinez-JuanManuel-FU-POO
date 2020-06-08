
public class Tarjeta {

    //Atributos
    int nCuenta;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;

    //Contructor vacio
    public Tarjeta() {
    }

    //Constructor con todos los atributos
    public Tarjeta(int nCuenta, String nombre, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.nCuenta = nCuenta;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;
    }

    public Tarjeta verificarCuenta(int nCuenta, int nip) {

        if (nCuenta == 123123 && nip == 1133) {

            return new Tarjeta(123123, "Eduardo Diaz Flores", 1, 1, 2020, 543, 45987.22, 550);

        } else if (nCuenta == 456789 && nip == 3377) {

            return new Tarjeta(456789, "Kevin Meza Gonzalez", 31, 12, 2031, 544, 360, 5322.23);

        } else {

            return new Tarjeta();
        }
    }

    public double calcularTotal() {

        return this.monto + this.apartado;

    }

    public void depositar(double depositar) {
        this.monto += depositar;
    }

    public void retirar(double retirar) {
        if (retirar <= this.monto) {
            this.monto -= retirar;
            System.out.println("¡Retiro con exito!");
        } else {
            System.out.println("¡Saldo insuficiente!");
        }
    }

    public void crearApartado(double apartar) {
        if (apartar > this.monto) {
            System.out.println("¡Saldo insuficiente!");

        } else {
            this.apartado += apartar;
            this.monto -= apartar;
            System.out.println("¡Apartado realizado con exito!");
        }
    }

    public void eliminarApartado() {
        this.monto += this.apartado;
        this.apartado = 0;
    }

    //
    public void verificarFecha() {
        this.anio += 5;
    }
    //

    @Override
    public String toString() {
        if (this.apartado > 0) {
            return "\nNumero de cuenta: " + nCuenta
                    + "\nNombre: " + nombre
                    + "\nFecha de vencimiento: " + dia + " / " + mes + " / " + anio
                    + "\ncv: " + cv
                    + "\nMonto: " + monto
                    + "\nApartado: " + apartado
                    + "\nTotal: " + this.calcularTotal();

        } else {
            return "\nNumero de cuenta: " + nCuenta
                    + "\nNombre: " + nombre
                    + "\nFecha de vencimiento: " + dia + " / " + mes + " / " + anio
                    + "\ncv: " + cv
                    + "\nMonto: " + monto
                    + "\nTotal: " + this.calcularTotal();

        }
    }
}
