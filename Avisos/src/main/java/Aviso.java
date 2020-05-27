
public class Aviso {

    int id;
    String tipoAviso;
    String titulo;
    String textoAviso;
    String resumenAviso;
    String nombre;
    int diaPublicacion, mesPublicacion, añoPublicacion;
    int diaAlta, mesAlta, añoAlta;
    int diaBaja, mesBaja, añoBaja;
    String estatus;
    
    public void verificarVigencia(){
        
    }
    
    @Override
    public String toString(){
        
        return "\nAviso: " + id
             + "\nTitulo: " + titulo
             + "\nPublico: " + nombre
             + "\nTexto aviso: " + textoAviso
             + "\nResumen: " + resumenAviso
             + "\nFecha publicacion: " + diaPublicacion + " / " + mesPublicacion + " / " + añoPublicacion
             + "\nFecha alta: " + diaAlta + " / " + mesAlta + " / " + añoAlta
             + "\nFecha baja: " + diaBaja + " / " + mesBaja + " / " + añoBaja
             + "\nEstatus: " + estatus
             + "\nTipo de aviso: " + tipoAviso;
        
    }
    
}
