import java.util.*;

public class Esfera {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        final double PI = 3.14;
        double radio, volumen;
        
        
        System.out.print("Digite el radio de la esfera: ");
        radio = dato.nextDouble();
        
        volumen = (4 * PI * Math.pow(radio, 3))/3;
        
        System.out.println("El volumen de la esfera es: " + volumen);
        
    }
    
}
