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
    private double espacio;
    //iniciamos las variable que nos dice el nombre
    private String nombre;
    //iniciamos las variable que nos dice la categoria
    private Categoria categoria;
    /**
     * Constructor for objects of class Aplicacion
     */
    public Aplicacion(String nombre, double espacio, Categoria categoria )
    {
        super();
        this.nombre = nombre;
        this.categoria = categoria;
        this.espacio = espacio;
    }
    
    /**
     * obtenemos el Nombre como String
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * obtenemos el espacio en MB
     */
    public double getTamanoEnMB(){
        return espacio;
    }
    
    /**
     * obtenemos la categoria como String
     */
    public String getCategoria(){
        String categorias = categoria.toString();
        if (categorias.equals("MULTIMEDIA")){
            categorias = "Multimedia";
        }
        else if (categorias.equals("COMUNICACIONES")){
            categorias = "Comunicaciones";
        }
         else if (categorias.equals("PRODUCTIVIDAD")){
            categorias = "Productividad";
        }
        else {
            categorias = "Juegos";
        }
        return categorias;
        
    }
    
}
