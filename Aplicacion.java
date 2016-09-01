import java.util.*;
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    //iniciamos las variable que nos dice el espacio que ocupa
    private int espacio;
    //inicializamos las variables que nos crean las array list para los tipos de aplicaciones
    private ArrayList<String> juegos ;
    private ArrayList<String> comunicacion ;
    private ArrayList<String> productividad ;
    private ArrayList<String> multimedia ;
    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre, String tipo, int espacio )
    {
        super();
        juegos = new ArrayList<String>();
        comunicacion = new ArrayList<String>();
        productividad = new ArrayList<String>();
        multimedia = new ArrayList<String>();
        if (tipo.equals("juegos")){
             juegos.add(new String(tipo));
        }
        else if(tipo.equals("comunicacion")){
             comunicacion.add(new String(tipo));
        }
        else if(tipo.equals("productividad")){
             productividad.add(new String(tipo));            
        }
        else{
             multimedia.add(new String(tipo));
        }
        
    }

    
    
}
