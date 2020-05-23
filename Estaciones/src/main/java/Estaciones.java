/*Se pide un número del 1- 12 que muestre qué estación del año le pertenece 
(Primavera, Verano, Otoño e Invierno)*/

import java.util.Scanner;

public class Estaciones {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite un numero entre 1 - 12: ");
        numero = dato.nextInt();
        
        switch(numero){
            
            case 1: System.out.println(" Estacion de Invierno ");
                    break;
            case 2: System.out.println(" Estacion de Invierno ");
                    break;
            case 3: System.out.println(" Estacion de Primavera ");
                    break;
            case 4: System.out.println(" Estacion de Primavera ");
                    break;
            case 5: System.out.println(" Estacion de Primavera ");
                    break;
            case 6: System.out.println(" Estacion de Verano ");
                    break;
            case 7: System.out.println(" Estacion de Verano ");
                    break;
            case 8: System.out.println(" Estacion de Verano ");
                    break;
            case 9: System.out.println(" Estacion de Otoño ");
                    break;
            case 10: System.out.println(" Estacion de Otoño ");
                     break;
            case 11: System.out.println(" Estacion de Otoño ");
                     break;
            case 12: System.out.println(" Estacion de Invierno ");
                     break;
            default: System.out.println("Selecciona un numero entre 1 - 12");
            
        }
    }
    
}
