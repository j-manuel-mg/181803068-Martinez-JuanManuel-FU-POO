
import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        
        Persona p1;
        Persona p2;
        
        String personaje;
        int opcion;
        
        //Objeto persona1 instanciado
        System.out.print("\nDigite el nombre del personaje 1: ");
        personaje = dato.nextLine();
        
        p1 = new Persona(personaje);
        
        System.out.println("Que tipo de arma desea usar: ");
        System.out.println("1.- Bronce");
        System.out.println("2.- Plata");
        System.out.println("3.- Oro");
        System.out.println("4.- Diamante");
        System.out.println("5.- Adamantium");
        System.out.print("Opcion: ");
        opcion = dato.nextInt();
        p1.equiparArma(opcion);
        
        dato.nextLine();
        
        //Objeto persona2 instanciado
        System.out.print("\nDigite el nombre del personaje 2: ");
        personaje = dato.nextLine();
        
        p2 = new Persona(personaje);
        
        System.out.println("Que tipo de arma desea usar: ");
        System.out.println("1.- Bronce");
        System.out.println("2.- Plata");
        System.out.println("3.- Oro");
        System.out.println("4.- Diamante");
        System.out.println("5.- Adamantium");
        System.out.print("Opcion: ");
        opcion = dato.nextInt();
        p2.equiparArma(opcion);
        
        System.out.println(p1.toString());
        System.out.println(p1.disparar());
        
        System.out.println(p2.toString());
        System.out.println(p2.disparar());
        
    }
}
