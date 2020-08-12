package Herbivoros;

import Animales.Animales;

/**
 *
 * @author Juan Manuel
 */
public class Herbivoros extends Animales {

    protected static final String tipoAlimento = "Herbivoro";

    public Herbivoros() {
    }

    public Herbivoros(String genero, String habitat, int edad, String nombreCientifico, String reyno) {
        super(genero, habitat, edad, nombreCientifico, reyno, Herbivoros.tipoAlimento);
    }
    
    
}
