
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

    public Aviso() {
    }

    public Aviso(int id, String tipoAviso, String titulo, String textoAviso, String resumenAviso, String nombre, int diaPublicacion, int mesPublicacion, int añoPublicacion, int diaAlta, int mesAlta, int añoAlta, int diaBaja, int mesBaja, int añoBaja, String estatus) {
        this.id = id;
        this.tipoAviso = tipoAviso;
        this.titulo = titulo;
        this.textoAviso = textoAviso;
        this.resumenAviso = resumenAviso;
        this.nombre = nombre;
        this.diaPublicacion = diaPublicacion;
        this.mesPublicacion = mesPublicacion;
        this.añoPublicacion = añoPublicacion;
        this.diaAlta = diaAlta;
        this.mesAlta = mesAlta;
        this.añoAlta = añoAlta;
        this.diaBaja = diaBaja;
        this.mesBaja = mesBaja;
        this.añoBaja = añoBaja;
        this.estatus = estatus;
    }
    
    
    
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
