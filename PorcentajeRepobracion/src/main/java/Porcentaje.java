/*
Desarrollar un programa que calcule el porcentaje de reprobación de un grupo, 
a partir de la cantidad total de alumnos que presentaron un examen y el número 
de alumnos que lo reprobaron.
*/

import java.util.Scanner;

public class Porcentaje {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        int nAlum;
        int nAlumRepro;
        
        double porcentaje;
        
        
        System.out.print("Digite el numero de alumnos que presentaron el examen: : ");
        nAlum = dato.nextInt();
        
        System.out.print("Digite el numero de alumnos que reprobaron el examen: ");
        nAlumRepro = dato.nextInt();
        
        porcentaje = (nAlumRepro * 100)/nAlum;
        
        System.out.println("El porcentaje de alumnos reprobados es: " + porcentaje + "%");
        
    }
}
