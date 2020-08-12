package MainAlumno;

import Alumno.Egresado;
import Alumno.Irregular;
import Alumno.Regular;
import Archivo.Archivo;
import java.util.Scanner;

class Principal {

    public static void main(String[] args) {

        Archivo archivo = new Archivo();
        Scanner dato = new Scanner(System.in);

        Regular alumnoRegular;
        Irregular alumnoIrregular;
        Egresado alumnoEgresado;

        int opcion;
        String regular = "regular.txt";
        String irregular = "irregular.txt";
        String egresado = "egresado.txt";

        do {
            System.out.println("1.- Agregar un alumno");
            System.out.println("2.- Editar Alumno");
            System.out.println("3.- Imprimir Alumno");
            System.out.println("4.- Eliminar Archivo");
            System.out.println("5.- Salir");
            System.out.print("Opcion: ");
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:
                    int opcionAgregarAlumno;
                    do {

                        System.out.println("\n\t1.- Agregar alumno regular");
                        System.out.println("\t2.- Agregar alumno irregular");
                        System.out.println("\t3.- Agregar alumno egresado");
                        System.out.println("\t4.- Salir");
                        System.out.print("\tOpcion: ");
                        opcionAgregarAlumno = dato.nextInt();

                        switch (opcionAgregarAlumno) {
                            case 1:
                                archivo.crearArchivo(regular);
                                alumnoRegular = new Regular().agregarAlumnoRegular();
                                archivo.escribirAlumnoRegular(alumnoRegular);
                                break;
                            case 2:
                                archivo.crearArchivo(irregular);
                                alumnoIrregular = new Irregular().agregarAlumnoIrregular();
                                archivo.escribirAlumnoIrregular(alumnoIrregular);
                                break;
                            case 3:
                                archivo.crearArchivo(egresado);
                                alumnoEgresado = new Egresado().agregarAlumnoEgresado();
                                archivo.escribirAlumnoEgresado(alumnoEgresado);
                                break;
                            case 4:
                                System.out.println("\n\tSaliendo...\n");
                                break;
                            default:
                                System.out.println("\n\tOpcion no reconocida\n");
                                break;
                        }
                    } while (opcionAgregarAlumno != 4);
                    break;
                case 2:
                    int opcionEditarAlumno;
                    do {
                        System.out.println("\n\t1.- Editar alumno regular");
                        System.out.println("\t2.- Editar alumno irregular");
                        System.out.println("\t3.- Editar alumno egresado");
                        System.out.println("\t4.- Salir");
                        System.out.print("\tOpcion: ");
                        opcionEditarAlumno = dato.nextInt();
                        switch (opcionEditarAlumno) {
                            case 1:
                                if (archivo.existeArchivo(regular)) {
                                    archivo.editarAlumnoRegular(regular);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado");
                                }
                                break;
                            case 2:
                                if (archivo.existeArchivo(irregular)) {
                                    archivo.editarAlumnoIrregular(irregular);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado");
                                }
                                break;
                            case 3:
                                if (archivo.existeArchivo(egresado)) {
                                    archivo.editarAlumnoEgresado(egresado);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado");
                                }
                                break;
                            case 4:
                                System.out.println("\n\tSaliendo...\n");
                                break;
                            default:
                                System.out.println("\n\tOpcion no reconocida\n");
                                break;
                        }
                    } while (opcionEditarAlumno != 4);
                    break;
                case 3:
                    int opcionImprimir;
                    do {
                        System.out.println("\n\t1.- Imprimir archivo alumno regular");
                        System.out.println("\t2.- Imprimir archivo alumno irregular");
                        System.out.println("\t3.- Imprimir archivo alumno egresado");
                        System.out.println("\t4.- Salir");
                        System.out.print("\tOpcion: ");
                        opcionImprimir = dato.nextInt();
                        switch (opcionImprimir) {
                            case 1:
                                if (archivo.existeArchivo(regular)) {
                                    archivo.mostrarAlumno(regular);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado\n");
                                }
                                break;
                            case 2:
                                if (archivo.existeArchivo(irregular)) {
                                    archivo.mostrarAlumno(irregular);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado\n");
                                }
                                break;
                            case 3:
                                if (archivo.existeArchivo(egresado)) {
                                    archivo.mostrarAlumno(egresado);
                                } else {
                                    System.out.println("\n\tEl archivo no se ha creado\n");
                                }
                                break;
                            case 4:
                                System.out.println("\n\tSaliendo...\n");
                                break;
                            default:
                                System.out.println("\n\tOpcion no reconocida\n");
                                break;
                        }
                    } while (opcionImprimir != 4);
                    break;
                case 4:
                    int opcionEliminar;
                    do {
                        System.out.println("\n\t1.- Eliminar archivo alumno regular");
                        System.out.println("\t2.- Eliminar archivo alumno irregular");
                        System.out.println("\t3.- Eliminar archivo alumno egresado");
                        System.out.println("\t4.- Salir");
                        System.out.print("\tOpcion: ");
                        opcionEliminar = dato.nextInt();
                        switch (opcionEliminar) {
                            case 1:
                                int opcionEliminarRegular;
                                if (archivo.existeArchivo(regular)) {
                                    System.out.println("\n\t¿Seguro que quiere borrar al archivo?");
                                    System.out.println("\t1.- Si");
                                    System.out.println("\t2.- No");
                                    System.out.print("\tOpcion: ");
                                    opcionEliminarRegular = dato.nextInt();
                                    if (opcionEliminarRegular == 1) {
                                        archivo.borrarArchivo(regular);
                                    }
                                } else {
                                    System.out.println("\n\tEl archivo no existe\n");
                                }
                                break;
                            case 2:
                                int opcionEliminarIrregular;
                                if (archivo.existeArchivo(irregular)) {
                                    System.out.println("\n\t¿Seguro que quiere borrar al archivo?");
                                    System.out.println("\t1.- Si");
                                    System.out.println("\t2.- No");
                                    System.out.print("\tOpcion: ");
                                    opcionEliminarIrregular = dato.nextInt();
                                    if (opcionEliminarIrregular == 1) {
                                        archivo.borrarArchivo(irregular);
                                    }
                                } else {
                                    System.out.println("\n\tEl archivo no existe\n");
                                }
                                break;
                            case 3:
                                int opcionEliminarEgresado;
                                if (archivo.existeArchivo(egresado)) {
                                    System.out.println("\n\t¿Seguro que quiere borrar al archivo?");
                                    System.out.println("\t1.- Si");
                                    System.out.println("\t2.- No");
                                    System.out.print("\tOpcion: ");
                                    opcionEliminarEgresado = dato.nextInt();
                                    if (opcionEliminarEgresado == 1) {
                                        archivo.borrarArchivo(egresado);
                                    }
                                } else {
                                    System.out.println("\n\tEl archivo no existe\n");
                                }
                                break;
                            case 4:
                                System.out.println("\n\tSaliendo...\n");
                                break;
                            default:
                                System.out.println("\tOpcion no reconocida\n");
                                break;
                        }
                    } while (opcionEliminar != 4);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        } while (opcion != 5);
    }
}
