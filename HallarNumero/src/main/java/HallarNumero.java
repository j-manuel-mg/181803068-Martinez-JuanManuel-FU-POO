
import java.util.Scanner;

public class HallarNumero {

    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);

        int numero = (int) (Math.random() * 101);
        int n;

        do{
            
            System.out.print("Digite un numero: ");
            n = dato.nextInt();
            
            if(n > numero){
                
                System.out.println("Mas bajo");
                
            }else{
                
                System.out.println("Mas arriba");
                
            }
            
        }while(n != numero);
        
        System.out.println("!!!Felicidades¡¡¡ el numero era: " + numero);

    }

}
