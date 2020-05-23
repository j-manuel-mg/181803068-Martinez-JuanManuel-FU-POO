/*
Un maestro necesita un programa para calcular el promedio final de alumnos. 
Para ello evalúa tres rubros: cuestionario con una ponderación del 40% de la calificación, 
prácticas y tareas con una ponderación de 40%, así como asistencia 
y participación con un 20% de la ponderación. Leer la puntuación alcanzada en cada 
rubro y en base a ello calcular y mostrar la calificación del alumno.
 */
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.print("Introduce la calificacion del cuestionario: ");
        nota1 = dato.nextDouble();

        System.out.print("Introduce la calificacion de las practicas y tarea: ");
        nota2 = dato.nextDouble();

        System.out.print("Introduce la calificacion de la asistencia y participacion: ");
        nota3 = dato.nextDouble();

        promedio = ((nota1 * .40) + (nota2 * .40) + (nota3 * .20));
        
        System.out.println("El promdeio final del alumno es: " + promedio);
        
    }
    
}