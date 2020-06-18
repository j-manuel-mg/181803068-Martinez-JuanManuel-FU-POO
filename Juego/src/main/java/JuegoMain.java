
import java.util.Scanner;

public class JuegoMain {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        
        Persona tristana = new Persona("Tristana");
        
        System.out.print(tristana.arma.menuAk());
         
        int valor = dato.nextInt();
        
        tristana.equiparArma(valor);
        
        System.out.println(tristana.toString());
        
        Persona kalista = new Persona("Kalista");
        
        System.out.print(kalista.arma.menuAk());
         
        valor = dato.nextInt();
        
        kalista.equiparArma(valor);
        
        System.out.println(kalista);
        
        System.out.println("El daño que haria es de: " + kalista.arma.disparar());
        
        tristana.recibirDanio(kalista.arma.disparar());
        
        System.out.println(tristana);
    }
}
