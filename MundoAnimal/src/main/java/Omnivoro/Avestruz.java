package Omnivoro;

/**
 *
 * @author Juan Manuel
 */
public class Avestruz extends Omnivoro {

    private static final boolean sonido = true;
    private static final String ruido = "Ulalar";
    private static final String genero = "hemmbra";
    private static final String nombreCientifico = "Struthio camelus";
    private static final String habitat = "clima seco";
    private static final String reyno = "animalia";

    public Avestruz() {
    }

    public Avestruz(int edad) {
        super(Avestruz.genero, Avestruz.habitat, edad, Avestruz.nombreCientifico, Avestruz.reyno);
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
        return "Avestruz" + super.toString() 
                + "\nRuido: " + ruido ;
    }
    
}
