package Alumno;

import java.util.*;

public class Irregular extends Alumno {

    Scanner dato = new Scanner(System.in);
    private int materiasReprobadas;

    public Irregular() {
    }

    public Irregular(int materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public Irregular(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int matricula, String correo, int grado, String grupo, String turno, int materiasReprobadas) {
        super(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo, grado, grupo, turno);
        this.materiasReprobadas = materiasReprobadas;
    }

    public int getMateriasReprobadas() {
        return materiasReprobadas;
    }

    public void setMateriasReprobadas(int materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public Irregular agregarAlumnoIrregular() {

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
        System.out.print("\tMaterias Reprobadas:  ");
        materiasReprobadas = dato.nextInt();

        System.out.println("\tAlumno agregado Exitosamente\n");

        return new Irregular(nombre, apellidoPaterno, apellidoMaterno, edad, matricula, correo, grado, grupo, turno, materiasReprobadas);
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
                + "\nMaterias reprobadas: " + materiasReprobadas;
    }

}
