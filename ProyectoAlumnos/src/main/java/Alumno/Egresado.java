package Alumno;

import java.util.Scanner;

public class Egresado extends Alumno {

    Scanner dato = new Scanner(System.in);
    private final String cedula = "Recibida";
    private final String titulo = "Recibida";

    public Egresado() {

    }

    public Egresado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int matricula, String correo) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo);
    }

    public String getCedula() {
        return cedula;
    }

    public String getTitulo() {
        return titulo;
    }

    public Egresado agregarAlumnoEgresado() {

        System.out.print("\tNombre del Alumno: ");
        nombre = dato.nextLine();
        System.out.print("\tApellido paterno: ");
        apellidoPaterno = dato.nextLine();
        System.out.print("\tApellido materno: ");
        apellidoMaterno = dato.nextLine();
        System.out.print("\tEdad: ");
        edad = dato.nextInt();
        System.out.print("\tMatricula: ");
        matricula = dato.nextInt();
        dato.nextLine();
        System.out.print("\tCorreo electronico: ");
        correo = dato.nextLine();

        System.out.println("\tAlumno agregado Exitosamente\n");

        return new Egresado(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo);
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre()
                + "\nApellido paterno: " + getApellidoPaterno()
                + "\nApellido materno: " + getApellidoMaterno()
                + "\nEdad: " + getEdad()
                + "\nMatricula: " + getMatricula()
                + "\nCorreo: " + getCorreo()
                + "\nCedula: " + cedula
                + "\nTitulo: " + titulo;
    }

}
