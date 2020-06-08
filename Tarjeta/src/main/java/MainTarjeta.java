
import java.util.Scanner;

public class MainTarjeta {

    public static void main(String[] args) {

        //Declarar una clase
        Tarjeta tarjeta;

        //Tarjeta tarjeta = new Tarjeta();
        Scanner dato = new Scanner(System.in);

        int nCuenta;
        int nip;

        int opcion;

        do {
            System.out.print("Ingrese el numero de cuenta: ");
            nCuenta = dato.nextInt();

            System.out.print("Ingrese su NIP: ");
            nip = dato.nextInt();

            tarjeta = new Tarjeta().verificarCuenta(nCuenta, nip);
            //tarjeta = tarjeta.verificarCuenta(nCuenta,nip);

            if (tarjeta.nombre == null) {

                System.out.println("Usuario incorrecto");
                System.out.println();

            }
        } while (tarjeta.nombre == null);

        if (tarjeta.nombre != null) {
            do {
                
                System.out.println("\n\tMenu");
                System.out.println("1.- Hacer un deposito");
                System.out.println("2.- Hacer un retiro");
                if (tarjeta.apartado <= 0) {
                    System.out.println("3.- Crear apartado");
                } else {
                    System.out.println("3.- Eliminar apartado");
                }
                System.out.println("4.- Imprimir datos de la cuenta");
                System.out.println("5.- Salir");
                if (tarjeta.anio <= 2020) {
                    System.out.println("6.- Verificar fecha");
                } else {

                }
                System.out.print("Opcion: ");

                opcion = dato.nextInt();

                switch (opcion) {

                    case 1:
                        //double depositar;
                        System.out.println("\nIngrese la cantidad que quiere depositar: ");
                        //depositar = dato.nextDouble();
                        //tarjeta.depositar(depositar);
                        tarjeta.depositar(dato.nextDouble());
                        System.out.println("¡Deposito con exito!");
                        System.out.println(tarjeta.toString());
                        break;
                    case 2:
                        double retirar;
                        System.out.print("\nIngrese la cantidad que quiere retirar: ");
                        retirar = dato.nextDouble();
                        tarjeta.retirar(retirar);
                        System.out.println(tarjeta.toString());
                        break;
                    case 3:
                        if (tarjeta.apartado > 0) {

                            tarjeta.eliminarApartado();
                            System.out.println("¡Apartado eliminado con exito!");

                        } else {
                            double apartar;
                            System.out.print("\nDigite el apartado que desea realizar: ");
                            apartar = dato.nextDouble();
                            tarjeta.crearApartado(apartar);
                        }
                        System.out.println(tarjeta.toString());
                        break;
                    case 4:
                        System.out.println(tarjeta.toString());
                        break;
                    case 5:
                        break;
                    case 6:
                        if (tarjeta.anio > 2020) {

                        } else {
                            int op;
                            System.out.println("\n¡La fecha de tu tarjeta ya expiro!");
                            System.out.println("Desea renovarla con este banco: ");
                            System.out.println("1.- Si");
                            System.out.println("2.- No");
                            System.out.print("Opcion: ");
                            op = dato.nextInt();
                            switch (op) {
                                case 1:
                                    tarjeta.verificarFecha();
                                    System.out.println("¡La fecha se renovo exitosamente!");
                                    break;
                                case 2:
                                    System.out.println("¡Se necesita renovar!");
                                    break;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nNo existe esa opcion");
                        break;
                }
            } while (opcion != 5);
        } else {
            System.out.println("!Usuario no verificado¡");

        }
    }
}
