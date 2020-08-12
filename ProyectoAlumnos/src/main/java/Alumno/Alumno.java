package Alumno;

public abstract class Alumno {

    //Atributos
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int edad;
    protected int matricula;
    protected String correo;
    protected int grado;
    protected String grupo;
    protected String turno;

    //Constructor vacio
    public Alumno() {

    }

    //constructor Alumnos Regulares e irregulares
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int matricula, String correo, int grado, String grupo, String turno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.matricula = matricula;
        this.correo = correo;
        this.grado = grado;
        this.grupo = grupo;
        this.turno = turno;
    }

    //Constructor alumnos egresados
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, int matricula, String correo) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.matricula = matricula;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nApellido paterno: " + apellidoPaterno
                + "\nApellido materno: " + apellidoMaterno
                + "\nEdad: " + edad
                + "\nMatricula: " + matricula
                + "\nCorreo: " + correo
                + "\nGrado: " + grado
                + "\nGrupo: " + grupo
                + "\nTurno: " + turno;
    }

}
