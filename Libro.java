
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    //iniciamos las variable que nos dice el numero de paginas
    private int numeroPaginas;
    //iniciamos las variable que nos dice si es de ficcion o no
    private boolean ficcion;
    /**
     * Constructor for objects of class Libro
     */
    public Libro( String titulo,int ano, int numeroPaginas, boolean ficcion)
    {
        super( titulo, ano);
        this.numeroPaginas = numeroPaginas;
        this.ficcion = ficcion;
    }
    
    /**
     * obtenemos el numero de paginas
     */
    public int getNumeroPaginas()
    {
        return numeroPaginas;
    }
    
    /**
     * obtenemos si es de ficcion o no
     */
    public boolean getFiccion()
    {
        return ficcion;
    }
    
}
