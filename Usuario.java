
/**
 * Write a description of class Usuarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // variable usuario creado
    private String usuario;
    
    /**
     * Constructor for objects of class Usuarios
     */
    public Usuario(String usuario)
    {
        this.usuario = usuario;
    }
    
    /**
     * obtenemos el Nombre del usuario
     */
    public String getNombreCuenta(){
        return usuario;
    }
    
}
