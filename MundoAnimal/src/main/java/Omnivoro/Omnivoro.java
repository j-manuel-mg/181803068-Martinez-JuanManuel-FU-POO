package Omnivoro;

import Animales.Animales;

/**
 *
 * @author Juan Manuel
 */
public class Omnivoro extends Animales {
    
    private static final String tipoAlimento = "Omnivoro";

    public Omnivoro() {
    }

    public Omnivoro(String genero, String habitat, int edad, String nombreCientifico ,String reyno) {
        super(genero, habitat, edad, nombreCientifico, reyno, Omnivoro.tipoAlimento);
    }
    
}
