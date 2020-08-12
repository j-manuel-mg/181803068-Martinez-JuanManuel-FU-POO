package Animales;

/**
 *
 * @author Juan Manuel
 */
public abstract class  Animales {
    
    protected String genero;
    protected String habitat;
    protected int edad;
    protected String nombreCientifico;
    protected String reyno;
    protected String tipoAlimento;

    public Animales() {

    }

    public Animales(String genero, String habitat, int edad, String nombreCientifico, String reyno, String tipoAlimento) {
        this.genero = genero;
        this.habitat = habitat;
        this.edad = edad;
        this.nombreCientifico = nombreCientifico;
        this.reyno = reyno;
        this.tipoAlimento = tipoAlimento;
    }
    
    public String sonidoAnimal(){
        return "Sin sonido";
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getReyno() {
        return reyno;
    }

    public void setReyno(String reyno) {
        this.reyno = reyno;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    @Override
    public String toString() {
        return "\nGenero: " + genero 
                + "\nHabitat: " + habitat 
                + "\nEdad: " + edad 
                + "\nNombre cientifico: " + nombreCientifico 
                + "\nReyno: " + reyno 
                + "\nTipo de alimento: " + tipoAlimento;
    }
    
}
