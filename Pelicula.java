
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    //iniciamos las variable que nos dice la duracion
    private int duracion;
    //iniciamos las variable que nos dice la calidad
    private int calidad;

    /**
     * Constructor for objects of class Pelicula
     */
    public Pelicula(String titulo,int ano, int duracion, int calidad)
    {
        super(titulo, ano );
        this.duracion = duracion;
        this.calidad = calidad;
    }
    /**
     * obtenemos la duracion de la peli
     */
    public int getDuracion(){
        return duracion;
    }
    
    /**
     * obtenemos la calidad de la peli como String
     */
    public String getCalidad(){
        String calidades =  null; 
        if (calidades.equals("1080")){
            calidades = "FullHD";
        }
        else{
            calidades = "HD";
        }
        return calidades;
    }
}
