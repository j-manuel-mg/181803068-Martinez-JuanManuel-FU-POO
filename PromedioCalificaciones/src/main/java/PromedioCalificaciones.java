//Programa que saque el promedio de 3 calificaciones y determine si el alumno pasó o no paso

import java.util.Scanner;

public class PromedioCalificaciones {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        float nota1, nota2, nota3, promedio;

        System.out.print("Digite la calificacion 1: ");
        nota1 = dato.nextInt();

        System.out.print("Digite la calificacion 2: ");
        nota2 = dato.nextInt();

        System.out.print("Digite la calificacion 3: ");
        nota3 = dato.nextInt();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {

            System.out.println("!!!Felicidades¡¡¡ paso con promedio de: " + promedio);

        } else {
            
            System.out.println("Lo siento no paso, su promedio es de: " + promedio);
        }

    }

}
