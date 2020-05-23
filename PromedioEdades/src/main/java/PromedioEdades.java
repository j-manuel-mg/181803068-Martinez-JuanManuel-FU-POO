/*Un programa que dado el número de alumnos y las edades de los mismos
determine el promedio de edad de los alumnos ingresados
*/

import java.util.Scanner;

public class PromedioEdades {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        int alumnos, edad, suma = 0, promedio;
        
        System.out.print("Digite la cantidad de alumnos: ");
        alumnos = dato.nextInt();
        
        System.out.println();
        
        for (int i = 1; i <= alumnos; i++) {
            
            System.out.println("Alumno: " + i);
            System.out.print("Digite su edad: ");
            edad = dato.nextInt();
            
            suma += edad;
            
            System.out.println();
            
        }
        
        promedio = (suma / alumnos);
        
        System.out.println("El promedio de edades es de: " + promedio + " años");
        
    }

}
