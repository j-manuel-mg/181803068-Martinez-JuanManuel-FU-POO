
public class JuegoMain {
    
    public static void main(String[] args) {
        
        Ak bronce = new Ak();
        
        System.out.println("Arma de Bronce");
        
        bronce.tipo = "bronce";
        bronce.cargador = 5;
        bronce.precision = 75;
        bronce.velocidadCarga = 5;
        bronce.precio = 1000;
        bronce.danio = 10;
        
        System.out.println(bronce.toString());
        
        Ak plata = new Ak();
        
        System.out.println("\nArma de Plata");
        
        plata.tipo = "plata";
        plata.cargador = 8;
        plata.precision = 70;
        plata.velocidadCarga = 4.5;
        plata.precio = 2300;
        plata.danio = 11;
        
        System.out.println(plata.toString());
        
        Ak oro = new Ak();
        
        System.out.println("\nArma de Oro");
        
        oro.tipo = "Oro";
        oro.cargador = 10;
        oro.precision = 85;
        oro.velocidadCarga = 4.3;
        oro.precio = 2500;
        oro.danio = 13;
        
        System.out.println(oro.toString());
        
        Ak diamante = new Ak();
        
        System.out.println("\nArma de Diamante");
        
        diamante.tipo = "Diamante";
        diamante.cargador = 20;
        diamante.precision = 95;
        diamante.velocidadCarga = 3;
        diamante.precio = 4000;
        diamante.danio = 20;
        
        System.out.println(diamante.toString());
        
    }
    
}
