
public class AvisosMain {
    
    public static void main(String[] args) {
        
        //Primer objeto
        Aviso aviso1 = new Aviso();
        
        aviso1.id = 1;
        aviso1.titulo = "Insumos y bienes muebles de laboratorio disponibles";
        aviso1.nombre = "Eduardo Flores Díaz";
        aviso1.textoAviso = "La Coordinación de Control Técnico de Insumos (COCTI) de la"
                + " Dirección de Prestaciones Médicas, pone a disposición del personal que realiza"
                + " investigación el inventario adjunto.";
        aviso1.resumenAviso = "Insumos y bienes muebles de laboratorio disponibles por la "
                + "Coordinación de Control Técnico de Insumos (COCTI)";
        
        aviso1.diaPublicacion = 02;
        aviso1.mesPublicacion = 02;
        aviso1.añoPublicacion = 2020;
        
        aviso1.diaAlta = 02;
        aviso1.mesAlta = 02;
        aviso1.añoAlta = 2020;
        
        aviso1.diaBaja = 02;
        aviso1.mesBaja = 02;
        aviso1.añoBaja = 2021;
        
        aviso1.estatus = "Vigente";
        
        aviso1.tipoAviso = "General";
        
        System.out.println(aviso1.toString());
        
        
        //Segundo Objeto
        Aviso aviso2 = new Aviso();
        
        aviso2.id = 2;
        aviso2.titulo = "CONFERENCIA DR. COSSARIZZA";
        aviso2.nombre = "Kevin Meza Gonzalez";
        aviso2.textoAviso = "El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced"
                + " Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de "
                + "investigación, aún no publicados, sobre VIH y el uso de citometría de flujo.";
        aviso2.resumenAviso = "Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry";
        
        aviso2.diaPublicacion = 02;
        aviso2.mesPublicacion = 03;
        aviso2.añoPublicacion = 2020;
       
        aviso2.diaAlta = 15;
        aviso2.mesAlta = 02;
        aviso2.añoAlta = 2020;
        
        aviso2.diaBaja = 31;
        aviso2.mesBaja = 03;
        aviso2.añoBaja = 2020;
        
        aviso2.estatus = "No Vigente";
        
        aviso2.tipoAviso = "Conferencia";
        
        System.out.println(aviso2.toString());
    }
    
}
