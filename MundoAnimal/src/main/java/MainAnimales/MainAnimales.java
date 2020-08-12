package MainAnimales;

import Animales.Animales;
import Carnivoro.*;
import Herbivoros.*;
import Omnivoro.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Manuel
 */
public class MainAnimales {

    public static void main(String[] args) {

        Vaca pily = new Vaca(35);
        Toro pepe = new Toro(22);
        Leon mufasa = new Leon(33);
        Zorro kurama = new Zorro(100);
        Chimpance botas = new Chimpance();
        
        List<Animales> animales = new ArrayList<>();
        animales.add(pily);
        animales.add(pepe);
        animales.add(mufasa);
        animales.add(kurama);
        animales.add(botas);
        
        try {

            FileWriter fileWriter = new FileWriter("archivo2.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for(Animales animal: animales){
                printWriter.println(animal);
            }

            printWriter.close();
            System.out.println("Se escribio correctamente el archivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
