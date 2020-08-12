
package Paquete1;

public class Main {
    
    public static void main(String[] args) {
        
        Defecto defecto = new Defecto();
        
        defecto.defecto = "Este es un atrbituo por defecto (default)";
        System.out.println(defecto);
        
        defecto.metodoDefecto();
        
        //----------------------------------------------------------------------
        
        Publico publico = new Publico();
        
        publico.publico = "Este es un atributo publico (public)";
        System.out.println(publico);
        
        publico.metodoPublico();
        
        //----------------------------------------------------------------------
        
        Protegido protegido = new Protegido();
        
        protegido.protegido = "Este es un atrbituo protegido (protected)";
        System.out.println(protegido);
        
        protegido.metodoProtegido();
        
        //----------------------------------------------------------------------
        
        Privado privado = new Privado();
        
        privado.privado = "Este es un atrbituo privado (private)";
        System.out.println(privado);
        
        privado.setPrivado("Atributo Privado");
        privado.getPrivado();
        
        privado.metodoPrivado();
        
    }
    
}
