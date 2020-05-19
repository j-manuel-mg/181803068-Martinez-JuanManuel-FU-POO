import java.util.Scanner;

public class leerJava {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        //Tipo de dato entero
        int numero;
        
        System.out.print("Proporciona un numero: ");
        numero = leer.nextInt();
        System.out.println("numero = " + numero);
        
        //Tipo de dato float
        double doble;
        
        System.out.print("Proporcione un numero double: ");
        doble = leer.nextDouble();
        System.out.println("doble = " + doble);
        
        leer.nextLine();
        
        //Tipo de dato String
        String cadena;
        
        System.out.print("Proporciona un String: ");
        cadena = leer.nextLine();
        System.out.println("cadena = " + cadena);
        
        //Tipo de dato char
        char letra;
        
        System.out.print("Proporcione una letra: ");
        letra = leer.next().charAt(0);
        System.out.println("letra = " + letra);
        
        
    }
    
}
