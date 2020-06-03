
import java.util.Scanner;

public class MainTarjeta {

    public static void main(String[] args) {

        Tarjeta tarjeta; //Tarjeta tarjeta = new Tarjeta();

        Scanner dato = new Scanner(System.in);

        int nCuenta;
        int nip;

        int opcion;

        System.out.print("Ingrese el numero de cuenta: ");
        nCuenta = dato.nextInt();

        System.out.print("Ingrese su NIP: ");
        nip = dato.nextInt();

        tarjeta = new Tarjeta().verificarCuenta(nCuenta, nip);  //tarjeta = tarjeta.verificarCuenta(nCuneta,nip);

        //System.out.println(tarjeta.toString());
        tarjeta.verificarCuenta(nCuenta, nip);

        do {
            if (tarjeta.apartado <= 0) {
                System.out.println("\n\tMenu");
                System.out.println("1.- Hacer un deposito");
                System.out.println("2.- Hacer un retiro");
                System.out.println("3.- Crear apartado\n");
                System.out.println("5.- Imprimir datos de la cuenta");
                System.out.println("6.- Salir");
                System.out.print("Opcion: ");
                opcion = dato.nextInt();
            } else {
                System.out.println("\n\tMenu");
                System.out.println("1.- Hacer un deposito");
                System.out.println("2.- Hacer un retiro");
                System.out.println("3.- Crear apartado");
                System.out.println("4.- Eliminar apartado");
                System.out.println("5.- Imprimir datos de la cuenta");
                System.out.println("6.- Salir");
                System.out.print("Opcion: ");
                opcion = dato.nextInt();
            }
            switch (opcion) {

                case 1:
                    //double depositar;
                    System.out.println("\nIngrese la cantidad que quiere depositar: ");
                    //depositar = dato.nextDouble();
                    //tarjeta.depositar(depositar);
                    tarjeta.depositar(dato.nextDouble());
                    break;
                case 2:
                    double retirar;
                    System.out.println("\nIngrese la cantidad que quiere retirar: ");
                    retirar = dato.nextDouble();
                    tarjeta.retirar(retirar);
                    break;
                case 3:
                    double apartar;
                    System.out.println("\nDigite el aparatado que desea realizar: ");
                    apartar = dato.nextDouble();
                    tarjeta.crearApartado(apartar);
                    break;
                case 4:
                    System.out.println("\nApartado Eliminado");
                    tarjeta.eliminarApartado();
                    break;
                case 5:
                    System.out.println(tarjeta.toString());
                    break;
                case 6:
                    System.out.println("\nVuelva pronto");
                    break;
                default:
                    System.out.println("\nNo existe esa opcion");
                    break;
            }
        } while (opcion != 6);

    }

}
