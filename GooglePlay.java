import java.util.*;
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // iniciamos la array de usuarios y productos
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    // creamos contadores de usuarios y productos
    private int contadorProductos;
    private int contadorUsuarios;
    /**
     * Constructor for objects of class Tienda
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<Usuario>();
        productos = new ArrayList<Producto>();
        contadorProductos = 0;
        contadorUsuarios = 0;
    }

    /**
     * añadimos usuarios
     */
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
        contadorUsuarios++;
    }

    /**
     * añadimos productos
     */
    public void addProducto(Producto producto)
    {
        productos.add(producto);
        contadorProductos++;
    }

    /**
     * obtenemos el numero de productos
     */
    public int getNumeroProductos()
    {
        return contadorProductos;
    }

    /**
     * obtenemos el numero de productos
     */
    public int getNumeroUsuarios()
    {
        return contadorUsuarios;
    }

    /**
     * 
     */
    public String comprar(Usuario usuario, Producto producto)
    {
        int infoCompra = 0;
        int j = 0;
        int m = 0;
        int p = 0;
        if((usuario = null )||(producto = null)){
            infoCompra = -1;
        }
        if(producto.getProducto().equals("Aplicacion"))
        {
            if(producto.getAplicacion().equals("Juego")){
                if(j == 3){
                    infoCompra = 5;
                }
                else{
                    infoCompra = 0.99;
                    j++;
                }
            }

            else if(producto.getAplicacion().equals("Productiva")){
                if(p == 3){
                    infoCompra = 10;
                }
                else{
                    infoCompra = 0.99;
                    p++;
                }
            }
            else{
                if(m == 3){
                    infoCompra = 2;
                }
                else{
                    infoCompra = 0.99;
                    m++;
                }
            }
        }
        else if(producto.getProducto().equals("Libro"))
        {
            infoCompra = (Libro.getNumeroPaginas()/100)*(Libro.getAnoPublicacion()-2010);
        }
        else
        {
            if (Pelicula.getCalidad().equals("FullHD")){
                infoCompra = 10;
            }
            else{
                 infoCompra = 5;
            }

        }

        return infoCompra;
    }
}
