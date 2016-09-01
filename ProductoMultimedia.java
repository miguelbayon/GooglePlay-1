
/**
 * Abstract class ProductosMultimedia - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public  class ProductoMultimedia extends Producto
{
    // iniciamos las variables de año y titulo
    private int ano;
    public String titulo;

    
    public ProductoMultimedia(String titulo,int ano)
    {
        super();
        this.titulo = titulo;
        this.ano = ano;
    }
    
    /**
     * obtenemos el titulo
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    /**
     * obtenemos el año 
     */
    public int getAno()
    {
        return ano;
    }
}
