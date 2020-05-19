
public class tipoVariables {
    
    public static void main(String[] args) {
        
        //Tipo de variable int
        int a = 10, b = 2;
        
        System.out.println("Suma: " + (a+b)); //Suma
        System.out.println("Suma: " + (a-b)); //Resta
        System.out.println("Suma: " + (a*b)); //Multiplicacion
        System.out.println("Suma: " + (a/b)); //Division
        System.out.println("Suma: " + (a%b)); //Modulo
        
        //Tipo de variable float
        float pi = 3.14f;
        
        //Tip de bariable double
        double pi2 = 3.14;
        
        //Cambios de variables
        boolean bandera = true;
        boolean bandera2 = false;
        
        //Tipo de dato char
        char letra = 'a';
        
        //Tipo de dato String
        String palabra = "Puede poner un mensaje largo";
        System.out.println(palabra);
        
        //Concatenacion
        System.out.println(palabra + " y este es una prueba de ella");
        
        System.out.println("Este es el valor de pi: " + pi);
        
        //Concatenacion usando primero un string
        System.out.println("Este es el valor de pi: " + pi*a);
        
        System.out.println("Este es el valor del circulo: " + pi+a); //Veremos que concatena pi y a en lugar de sumarlo
        
        System.out.println("Este es el valor del circulo: " + (pi+a)); //Ponemos parentesis para que priorice la (suma) 
        
    }

}
