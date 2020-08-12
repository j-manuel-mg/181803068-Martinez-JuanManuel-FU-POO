
package Maestro;

/**
 *
 * @author Juan Manuel
 */
public class Maestro {
    
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;

    public Maestro() {
        
    }

    public Maestro(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre 
                + "\nApellido paterno: " + apellidoPaterno 
                + "\nApellido materno: " + apellidoMaterno;
    }
    
    
    
}
