package Carnivoro;

import Animales.Animales;

/**
 *
 * @author Juan Manuel
 */
public class Carnivoro extends Animales {

    private static final String tipoAlimento = "Carnivoro";

    public Carnivoro() {
    }

    public Carnivoro(String genero, String habitat, int edad, String nombreCientifico, String reyno) {
        super(genero, habitat, edad, nombreCientifico, reyno, Carnivoro.tipoAlimento);
    }
    
}
