package Omnivoro;

/**
 *
 * @author Juan Manuel
 */
public class Chimpance extends Omnivoro {
    
    private static final boolean sonido = true;
    private static final String ruido ="Uh Uh Ha Ha";
    private static final String genero = "Macho";
    private static final String nombreCientifico = "Pan paniscus";
    private static final String habitat = "selva";
    private static final String reyno = "animalia";

    public Chimpance() {
    }

    public Chimpance(int edad) {
        super(Chimpance.genero, Chimpance.habitat, edad, Chimpance.nombreCientifico, Chimpance.reyno);
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Chimpance" + super.toString() 
                + "\nRuido: " + ruido ;
    }
}
