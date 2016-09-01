import java.util.*;
/**
 * Write a description of class Tienda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    /**
     * Constructor for objects of class Tienda
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<Usuario>();
        productos = new ArrayList<Producto>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void registrarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
    public void registrarProducto(Producto producto)
    {
        productos.add(producto);
    }
}
