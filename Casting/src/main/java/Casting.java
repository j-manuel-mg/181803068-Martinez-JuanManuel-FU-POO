
public class Casting {
    
    public static void main(String[] args) {
        
        //Casting Explicito
        short a = 1;
        int b = 15;
        
        a = (short) b;
        
        //Casting Implicito
        float c = 4.5f;
        double d = 5.6;
        d = c;
        
        /*¿Que pasa con los decimales cuando casteo de fotante a double a entero?
        R = El valor queda truncado.
        */
        
        double pi = 3.1416;
        
        int duda = (int) pi;
        
        System.out.println("duda = " + duda);
        
        //Casting String
        
        //Integer.parseInt
        String valor = "15";
        int n = Integer.parseInt(valor);
        n += duda;
        
        System.out.println(n);
        
        //Ineteger.valurOf
        String valor2 = "40";
        int m = Integer.valueOf(valor);
        
        System.out.println(m);
        
        //Ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " - ");
        }
        
        System.out.println();
        
        //Ciclo While
        int j = 1; 
        while(j<10){
            System.out.print(j + " - ");
            
            j++;
        }
        
        //Ciclo  do while
        
        System.out.println("");
        
        int k = 1;
        
        do{
            
            System.out.print(k + " - ");
            
            k++;
            
        }while(k < 10);
    }
    
}
