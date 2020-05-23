//Un programa que imprima el factorial de cualquier número

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        long numero;
        long factorial = 1;
        
        System.out.print("Digite un numero a calcular su factorial: ");
        numero = dato.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            
            factorial *= i;
            
        }
        
        System.out.println("El factorial del numero es: " + factorial);
    }
    
}
