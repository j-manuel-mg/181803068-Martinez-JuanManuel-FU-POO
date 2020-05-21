import java.util.*;

public class Distancia {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner (System.in);
        
        double x1;
        double y1;
        
        double x2;
        double y2;
        
        double distancia;
        
        System.out.print("Digite la cordenada [x1]: ");
        x1 = dato.nextDouble();
        
        System.out.print("Digite la cordenada [y1]: ");
        y1 = dato.nextDouble();
        
        System.out.print("Digite la cordenada [x2]: ");
        x2 = dato.nextDouble();
        
        System.out.print("Digite la cordenada [y2]: ");
        y2 = dato.nextDouble();
        
        distancia = (Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
        
        System.out.println("La cordenada [x1][y1] esta a una distancia de " + distancia  +" de la cordenada [x2][y2]");
    }
    
}
