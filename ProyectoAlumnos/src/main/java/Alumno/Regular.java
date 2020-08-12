package Alumno;

import java.util.*;

public class Regular extends Alumno {

    Scanner dato = new Scanner(System.in);
    private String beca;

    public Regular() {

    }

    public Regular(String beca) {
        this.beca = beca;
    }

    public Regular(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int matricula, String correo, int grado, String grupo, String turno, String beca) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo, grado, grupo, turno);
        this.beca = beca;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public Regular agregarAlumnoRegular() {

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
        System.out.print("\tCorreo electronico: ");
        correo = dato.next();
        System.out.print("\tGrado: ");
        grado = dato.nextInt();
        System.out.print("\tGrupo: ");
        grupo = dato.next();
        System.out.print("\tTurno: ");
        turno = dato.next();
        dato.nextLine();
        System.out.print("\t¿Con cual beca cuenta? ");
        beca = dato.nextLine();

        System.out.println("\tAlumno agregado Exitosamente\n");

        return new Regular(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo, grado, grupo, turno, beca);
    }

    @Override
    public String toString() {
        return "\nNombre: " + getNombre()
                + "\nApellido paterno: " + getApellidoPaterno()
                + "\nApellido materno: " + getApellidoMaterno()
                + "\nEdad: " + getEdad()
                + "\nMatricula: " + getMatricula()
                + "\nCorreo: " + getCorreo()
                + "\nGrado: " + getGrado()
                + "\nGrupo: " + getGrupo()
                + "\nTurno: " + getTurno()
                + "\nBeca: " + beca;
    }

}
