
package Alumno;
/**
 *
 * @author Juan Manuel
 */

public class Alumno {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String matricula;
    private String genero;
    private String carrera;
    private String correo;
    
    private int edad;
    private int cuatrimestre;

    public Alumno() {
        
    }

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String matricula, String genero, String carrera, String correo, int edad, int cuatrimestre) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.matricula = matricula;
        this.genero = genero;
        this.carrera = carrera;
        this.correo = correo;
        this.edad = edad;
        this.cuatrimestre = cuatrimestre;
    }
    
    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "\nNombre: " + nombre 
                + "\nApellido paterno: " + apellidoPaterno 
                + "\nApellido materno: " + apellidoMaterno 
                + "\nMatricula: " + matricula 
                + "\nGenero: " + genero 
                + "\nCarrera: " + carrera 
                + "\nCorreo: " + correo 
                + "\nEdad: " + edad 
                + "\nCuatrimestre: " + cuatrimestre;
    }
    
    
}
