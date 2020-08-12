package Archivo;

import Alumno.Egresado;
import Alumno.Irregular;
import Alumno.Regular;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Archivo {

    File file;
    FileWriter fileWriter;
    FileReader fileReader;
    BufferedReader bufferedReader;

    public void crearArchivo(String nombreArchivo) {
        file = new File(nombreArchivo);

        try {
            if (file.createNewFile()) {
                System.out.println("\tEl archivo se ha creado correctamente");
                System.out.println("\tEl archivo esta listo para escribir:\n");
            } else {
                System.out.println("\tEl archivo esta listo para escribir:\n");
            }
        } catch (IOException e) {
            System.err.println("\n\tError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n\tError: " + e.getMessage());
        }
    }

    public void escribirAlumnoRegular(Regular regular) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("Nombre: " + regular.getNombre()
                    + "\nApellido paterno: " + regular.getApellidoPaterno()
                    + "\nApellido materno: " + regular.getApellidoMaterno()
                    + "\nEdad: " + regular.getEdad()
                    + "\nMatricula: " + regular.getMatricula()
                    + "\nCorreo: " + regular.getCorreo()
                    + "\nGrado: " + regular.getGrado()
                    + "\nGrupo: " + regular.getGrupo()
                    + "\nTurno: " + regular.getTurno()
                    + "\nBeca: " + regular.getBeca()
                    + "\n\n");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("\n\tError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n\tError: " + e.getMessage());
        }
    }

    public void escribirAlumnoIrregular(Irregular irregular) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("Nombre: " + irregular.getNombre()
                    + "\nApellido paterno: " + irregular.getApellidoPaterno()
                    + "\nApellido materno: " + irregular.getApellidoMaterno()
                    + "\nEdad: " + irregular.getEdad()
                    + "\nMatricula: " + irregular.getMatricula()
                    + "\nCorreo: " + irregular.getCorreo()
                    + "\nGrado: " + irregular.getGrado()
                    + "\nGrupo: " + irregular.getGrupo()
                    + "\nTurno: " + irregular.getTurno()
                    + "\nMaterias reprobadas: " + irregular.getMateriasReprobadas()
                    + "\n\n");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("\n\tError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n\tError: " + e.getMessage());
        }
    }

    public void escribirAlumnoEgresado(Egresado egresado) {
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write("Nombre: " + egresado.getNombre()
                    + "\nApellido paterno: " + egresado.getApellidoPaterno()
                    + "\nApellido materno: " + egresado.getApellidoMaterno()
                    + "\nEdad: " + egresado.getEdad()
                    + "\nMatricula: " + egresado.getMatricula()
                    + "\nCorreo: " + egresado.getCorreo()
                    + "\nCedula: " + egresado.getCedula()
                    + "\nTitulo: " + egresado.getTitulo()
                    + "\n\n");
            fileWriter.close();

        } catch (IOException e) {
            System.err.println("\n\tError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n\tError: " + e.getMessage());
        }
    }

    public List<Regular> obtenerAlumnoRegular(String nombreArchivo) {
        file = new File(nombreArchivo);
        List<Regular> listaRegular = new ArrayList<>();
        if (file.exists()) {
            String[] datosAlumno = new String[10];
            int pos = 0;

            Regular regular;

            String linea;
            String dato;
            int i;
            char[] cars;

            try {
                try (Scanner sc = new Scanner(file)) {
                    while (sc.hasNextLine()) {
                        linea = sc.nextLine();
                        cars = linea.toCharArray();
                        i = 0;
                        if (linea.length() > 0) {
                            for (char car : cars) {
                                if ((int) car == 58) {
                                    dato = linea.substring(i + 2);
                                    datosAlumno[pos] = dato;
                                    pos++;
                                    break;
                                }
                                i++;
                            }
                        } else {
                            regular = new Regular(datosAlumno[0], datosAlumno[1], datosAlumno[2], Integer.parseInt(datosAlumno[3]), Integer.parseInt(datosAlumno[4]), datosAlumno[5], Integer.parseInt(datosAlumno[6]), datosAlumno[7], datosAlumno[8], datosAlumno[9]);
                            listaRegular.add(regular);
                            pos = 0;
                        }
                    }
                    sc.close();
                }
            } catch (FileNotFoundException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("\n\tError: " + e.getMessage());
            }
        } else {
            System.out.println("\n\tEl archivo no ha sido creado\n");
        }
        return listaRegular;
    }

    public void editarAlumnoRegular(String nombreArchivo) {
        Scanner sc = new Scanner(System.in);
        List<Regular> listaRegular = obtenerAlumnoRegular(nombreArchivo);

        if (listaRegular.isEmpty()) {
            System.out.println("\n\tLa lista se encuentra vacia");
        } else {
            System.out.print("\n\tDigite la matricula del alumno a buscar: ");
            int matricula = sc.nextInt();

            for (Regular lista : listaRegular) {
                if (lista.getMatricula() == matricula) {
                    System.out.println("\n\tMatricula encontrada");
                    System.out.println(lista);
                    System.out.println();
                    int opcion;
                    do {
                        System.out.println("\n\t¿Que dato desea modificar del alumno?");
                        System.out.println("\t1.- Nombre");
                        System.out.println("\t2.- Apellido paterno");
                        System.out.println("\t3.- Apellido materno");
                        System.out.println("\t4.- Edad");
                        System.out.println("\t5.- Matricula");
                        System.out.println("\t6.- Correo");
                        System.out.println("\t7.- Grado");
                        System.out.println("\t8.- Grupo");
                        System.out.println("\t9.- Turno");
                        System.out.println("\t10.- Beca");
                        System.out.println("\t11.- Salir");
                        System.out.print("\tOpcion: ");
                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                            case 1:
                                System.out.print("\n\tDigite el nuevo nombre: ");
                                lista.setNombre(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 2:
                                System.out.print("\n\tDigite el nuevo apellido paterno: ");
                                lista.setApellidoPaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 3:
                                System.out.print("\n\tDigite el nuevo apellido materno: ");
                                lista.setApellidoMaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 4:
                                System.out.print("\n\tDigite la nueva edad: ");
                                lista.setEdad(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 5:
                                System.out.print("\n\tDigite la nueva matricula: ");
                                lista.setMatricula(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 6:
                                System.out.print("\n\tDigite el nuevo correo: ");
                                lista.setCorreo(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 7:
                                System.out.print("\n\tDigite el nuevo grado: ");
                                lista.setGrado(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 8:
                                System.out.print("\n\tDigite el nuevo grupo: ");
                                lista.setGrupo(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 9:
                                System.out.print("\n\tDigite el nuevo turno: ");
                                lista.setTurno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 10:
                                System.out.print("\n\tDigite la nueva beca: ");
                                lista.setBeca(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 11:
                                try {
                                vaciarArchivo(nombreArchivo);
                                for (Regular regular : listaRegular) {
                                    escribirAlumnoRegular(regular);
                                }
                                System.out.println("\n\tDatos modificados exitosamente");
                                System.out.println("\n\t Saliendo...\n");
                            } catch (IOException e) {
                                System.err.println("\n\tNo se pudo completar la operacion: " + e.getMessage());
                            }
                            break;
                            default:
                                System.out.println("\n\tOpcion no reconocida");
                                break;
                        }
                    } while (opcion != 11);
                    break;
                }
            }
        }
    }

    public List<Irregular> obtenerAlumnoIrregular(String nombreArchivo) {
        file = new File(nombreArchivo);
        List<Irregular> listaIrregular = new ArrayList<>();
        if (file.exists()) {
            String[] datosAlumno = new String[10];
            int pos = 0;

            Irregular irregular;

            String linea;
            String dato;
            int i;
            char[] cars;

            try {
                try (Scanner sc = new Scanner(file)) {
                    while (sc.hasNextLine()) {
                        linea = sc.nextLine();
                        cars = linea.toCharArray();
                        i = 0;
                        if (linea.length() > 0) {
                            for (char car : cars) {
                                if ((int) car == 58) {
                                    dato = linea.substring(i + 2);
                                    datosAlumno[pos] = dato;
                                    pos++;
                                    break;
                                }
                                i++;
                            }
                        } else {
                            irregular = new Irregular(datosAlumno[0], datosAlumno[1], datosAlumno[2], Integer.parseInt(datosAlumno[3]), Integer.parseInt(datosAlumno[4]), datosAlumno[5], Integer.parseInt(datosAlumno[6]), datosAlumno[7], datosAlumno[8], Integer.parseInt(datosAlumno[9]));
                            listaIrregular.add(irregular);
                            pos = 0;
                        }
                    }
                    sc.close();
                }
            } catch (FileNotFoundException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("\n\tError: " + e.getMessage());
            }
        } else {
            System.out.println("\n\tEl archivo no ha sido creado\n");
        }
        return listaIrregular;
    }

    public void editarAlumnoIrregular(String nombreArchivo) {
        Scanner sc = new Scanner(System.in);
        List<Irregular> listaIrregular = obtenerAlumnoIrregular(nombreArchivo);

        if (listaIrregular.isEmpty()) {
            System.out.println("\n\tLa lista se encuentra vacia");
        } else {
            System.out.print("\n\tDigite la matricula del alumno a buscar: ");
            int matricula = sc.nextInt();

            for (Irregular lista : listaIrregular) {
                if (lista.getMatricula() == matricula) {
                    System.out.println("\n\tMatricula encontrada");
                    System.out.println(lista);
                    System.out.println();
                    int opcion;
                    do {
                        System.out.println("\n\t¿Que dato desea modificar del alumno?");
                        System.out.println("\t1.- Nombre");
                        System.out.println("\t2.- Apellido paterno");
                        System.out.println("\t3.- Apellido materno");
                        System.out.println("\t4.- Edad");
                        System.out.println("\t5.- Matricula");
                        System.out.println("\t6.- Correo");
                        System.out.println("\t7.- Grado");
                        System.out.println("\t8.- Grupo");
                        System.out.println("\t9.- Turno");
                        System.out.println("\t10.- Numero de materias reprobadas");
                        System.out.println("\t11.- Salir");
                        System.out.print("\tOpcion: ");
                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                            case 1:
                                System.out.print("\n\tDigite el nuevo nombre: ");
                                lista.setNombre(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 2:
                                System.out.print("\n\tDigite el nuevo apellido paterno: ");
                                lista.setApellidoPaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 3:
                                System.out.print("\n\tDigite el nuevo apellido materno: ");
                                lista.setApellidoMaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 4:
                                System.out.print("\n\tDigite la nueva edad: ");
                                lista.setEdad(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 5:
                                System.out.print("\n\tDigite la nueva matricula: ");
                                lista.setMatricula(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 6:
                                System.out.print("\n\tDigite el nuevo correo: ");
                                lista.setCorreo(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 7:
                                System.out.print("\n\tDigite el nuevo grado: ");
                                lista.setGrado(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 8:
                                System.out.print("\n\tDigite el nuevo grupo: ");
                                lista.setGrupo(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 9:
                                System.out.print("\n\tDigite el nuevo turno: ");
                                lista.setTurno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 10:
                                System.out.print("\n\tDigite el nuevo numero de materias reprobadas: ");
                                lista.setMateriasReprobadas(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 11:
                                try {
                                vaciarArchivo(nombreArchivo);
                                for (Irregular irregular : listaIrregular) {
                                    escribirAlumnoIrregular(irregular);
                                }
                                System.out.println("\n\tDatos modificados exitosamente");
                                System.out.println("\n\t Saliendo...\n");
                            } catch (IOException e) {
                                System.err.println("\n\tNo se pudo completar la operacion: " + e.getMessage());
                            }
                            break;
                            default:
                                System.out.println("\n\tOpcion no reconocida");
                                break;
                        }
                    } while (opcion != 11);
                    break;
                }
            }
        }
    }

    public List<Egresado> obtenerAlumnoEgresado(String nombreArchivo) {
        file = new File(nombreArchivo);
        List<Egresado> listaEgresado = new ArrayList<>();
        if (file.exists()) {
            String[] datosAlumno = new String[8];
            int pos = 0;

            Egresado egresado;

            String linea;
            String dato;
            int i;
            char[] cars;

            try {
                try (Scanner sc = new Scanner(file)) {
                    while (sc.hasNextLine()) {
                        linea = sc.nextLine();
                        cars = linea.toCharArray();
                        i = 0;
                        if (linea.length() > 0) {
                            for (char car : cars) {
                                if ((int) car == 58) {
                                    dato = linea.substring(i + 2);
                                    datosAlumno[pos] = dato;
                                    pos++;
                                    break;
                                }
                                i++;
                            }
                        } else {
                            egresado = new Egresado(datosAlumno[0], datosAlumno[1], datosAlumno[2], Integer.parseInt(datosAlumno[3]), Integer.parseInt(datosAlumno[4]), datosAlumno[5]);
                            listaEgresado.add(egresado);
                            pos = 0;
                        }
                    }
                    sc.close();
                }
            } catch (FileNotFoundException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("\n\tError: " + e.getMessage());
            }
        } else {
            System.out.println("\n\tEl archivo no ha sido creado\n");
        }
        return listaEgresado;
    }

    public void editarAlumnoEgresado(String nombreArchivo) {
        Scanner sc = new Scanner(System.in);
        List<Egresado> listaEgresado = obtenerAlumnoEgresado(nombreArchivo);

        if (listaEgresado.isEmpty()) {
            System.out.println("\n\tLa lista se encuentra vacia");
        } else {
            System.out.print("\n\tDigite la matricula del alumno a buscar: ");
            int matricula = sc.nextInt();

            for (Egresado lista : listaEgresado) {
                if (lista.getMatricula() == matricula) {
                    System.out.println("\n\tMatricula encontrada");
                    System.out.println(lista);
                    System.out.println();
                    int opcion;
                    do {
                        System.out.println("\n\t¿Que dato desea modificar del alumno?");
                        System.out.println("\t1.- Nombre");
                        System.out.println("\t2.- Apellido paterno");
                        System.out.println("\t3.- Apellido materno");
                        System.out.println("\t4.- Edad");
                        System.out.println("\t5.- Matricula");
                        System.out.println("\t6.- Correo");
                        System.out.println("\t7.- Salir");
                        System.out.print("\tOpcion: ");
                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                            case 1:
                                System.out.print("\n\tDigite el nuevo nombre: ");
                                lista.setNombre(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 2:
                                System.out.print("\n\tDigite el nuevo apellido paterno: ");
                                lista.setApellidoPaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 3:
                                System.out.print("\n\tDigite el nuevo apellido materno: ");
                                lista.setApellidoMaterno(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 4:
                                System.out.print("\n\tDigite la nueva edad: ");
                                lista.setEdad(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 5:
                                System.out.print("\n\tDigite la nueva matricula: ");
                                lista.setMatricula(sc.nextInt());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 6:
                                System.out.print("\n\tDigite el nuevo correo: ");
                                lista.setCorreo(sc.nextLine());
                                System.out.println("\n\tNuevo dato asignado");
                                break;
                            case 7:
                                try {
                                vaciarArchivo(nombreArchivo);
                                for (Egresado egresado : listaEgresado) {
                                    escribirAlumnoEgresado(egresado);
                                }
                                System.out.println("\n\tDatos modificados exitosamente");
                                System.out.println("\n\t Saliendo...\n");
                            } catch (IOException e) {
                                System.err.println("\n\tNo se pudo completar la operacion: " + e.getMessage());
                            }
                            break;
                            default:
                                System.out.println("\n\tOpcion no reconocida");
                                break;
                        }
                    } while (opcion != 7);
                    break;
                }
            }
        }
    }

    public void mostrarAlumno(String nombreArchivo) {
        String linea;
        try {
            fileReader = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(fileReader);
            try {
                linea = bufferedReader.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = bufferedReader.readLine();
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.err.println("\n\tError: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("\n\tError: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.err.println("\n\tError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\n\tError: " + e.getMessage());
        }
    }

    public boolean existeArchivo(String nombreArchivo) {
        file = new File(nombreArchivo);
        return file.exists();
    }

    public void vaciarArchivo(String nombreArchivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            bw.write("");
            bw.close();
        }
    }

    public void borrarArchivo(String nombreArchivo) {
        file = new File(nombreArchivo);
        try {
            if (!file.delete()) {
            } else {
                System.out.println("\n\tEl archivo se ha eliminado correctamente\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
