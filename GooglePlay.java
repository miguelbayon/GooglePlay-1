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
        String infoCompra = null;
        if((usuario != usuario)||(producto != productos))
        
        
        
        
        
        
        
        
        return infoCompra;
        
    }
    }
