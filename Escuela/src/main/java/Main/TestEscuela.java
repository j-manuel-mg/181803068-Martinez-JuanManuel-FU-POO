
package Main;

/**
 *
 * @author Juan Manuel
 */

import Alumno.Alumno;
import Maestro.Maestro;

public class TestEscuela {
    
    public static void main(String[] args) {
        
        Alumno juanmanuel = new Alumno();
        
        juanmanuel.setNombre("Javier");
        juanmanuel.setApellidoPaterno("Maldonado");
        juanmanuel.setApellidoMaterno("Garcia");
        juanmanuel.setEdad(20);
        
        System.out.println(juanmanuel.toString());
        
        Maestro jordi = new Maestro();
        
        jordi.nombre = "Jordi";
        jordi.apellidoPaterno = "Cruz";
        jordi.apellidoMaterno = "Medrano";
        
        System.out.println(jordi.toString());
        
    }
    
}
