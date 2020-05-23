
import java.util.Scanner;

public class Horoscopo {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        int dia, mes;

        System.out.print("Introduce el dia de tu nacimiento: ");
        dia = dato.nextInt();

        System.out.print("Introduce el mes de tu nacimiento: ");
        mes = dato.nextByte();

        if ((mes == 1 && (dia >= 21 && dia <= 31)) || (mes == 2 && (dia >= 1 && dia <= 19))) {
            
            System.out.println(" Acaurio ");
            
        }else if ((mes == 2 && (dia >= 20 && dia <= 29)) || (mes == 3 && (dia >= 1 && dia <= 20))) {
            
            System.out.println(" Piscis ");
            
        }else if ((mes == 3 && (dia >= 21 && dia <= 31)) || (mes == 4 && (dia >= 1 && dia <= 20))) {
            
            System.out.println(" Aries ");
            
        }else if ((mes == 4 && (dia >= 21 && dia <= 30)) || (mes == 5 && (dia >= 1 && dia <= 21))) {
            
            System.out.println(" Tauro ");
            
        }else if ((mes == 5 && (dia >= 22 && dia <= 31)) || (mes == 6 && (dia >= 1 && dia <= 21))) {
            
            System.out.println(" Geminis ");
            
        }else if ((mes == 6 && (dia >= 22 && dia <= 30)) || (mes == 7 && (dia >= 1 && dia <= 23))) {
            
            System.out.println(" Cancer ");
            
        }else if ((mes == 7 && (dia >= 24 && dia <= 31)) || (mes == 8 && (dia >= 1 && dia <= 23))) {
            
            System.out.println(" Leo ");
            
        }else if ((mes == 8 && (dia >= 24 && dia <= 31)) || (mes == 9 && (dia >= 1 && dia <= 23))) {
            
            System.out.println(" Virgo ");
            
        }else if ((mes == 9 && (dia >= 24 && dia <= 30)) || (mes == 10 && (dia >= 1 && dia <= 23))) {
            
            System.out.println(" Libra ");
            
        }else if ((mes == 10 && (dia >= 24 && dia <= 31)) || (mes == 11 && (dia >= 1 && dia <= 22))) {
            
            System.out.println(" Escorpion ");
            
        }else if ((mes == 11 && (dia >= 23 && dia <= 30)) || (mes == 12 && (dia >= 1 && dia <= 21))) {
            
            System.out.println(" Sagitario ");
            
        }else if ((mes == 12 && (dia >= 22 && dia <= 31)) || (mes == 1 && (dia >= 1 && dia <= 20))) {
            
            System.out.println(" Capricornio ");
            
        }else{
            System.out.println("No existe esa fecha");
        }
    }
}
