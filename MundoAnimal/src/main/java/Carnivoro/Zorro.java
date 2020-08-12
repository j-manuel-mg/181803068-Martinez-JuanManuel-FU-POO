package Carnivoro;

/**
 *
 * @author Juan Manuel
 */
public class Zorro extends Carnivoro {
    
    private static final boolean sonido = true;
    private static final String ruido = "uuuaa uuuua";
    private static final String genero = "macho";
    private static final String nombreCientifico= "vulpes vulpes";
    private static final String habitat = "llanuras";
    private static final String reyno = "animalia";

    public Zorro() {
    }

    public Zorro(int edad) {
        super(Zorro.genero, Zorro.habitat, edad, Zorro.nombreCientifico, Zorro.reyno);
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
        return "Zorro" + super.toString() 
                + "\nRuido: " + ruido ;
    }
    
}
