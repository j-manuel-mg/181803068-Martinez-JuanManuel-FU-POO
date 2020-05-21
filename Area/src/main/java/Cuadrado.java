import java.util.Scanner;

public class Cuadrado {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        double lado, area;
        
        System.out.print("Digite el lado del cuadrado para calcular el area: ");
        lado = dato.nextDouble();
        
        area = lado * lado;
        
        System.out.println("El area del cuadrado es: " + area);
        
    }
    
}
