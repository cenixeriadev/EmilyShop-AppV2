package emilyshop.appv2.Modelo.Entidades;

/**
 *
 * @author Lenovo
 */
public class Usuario extends Entidad {
    private String nombre;
    private String nombreUsuario;
    private String password;
    private String telefono;
    
    // Constructor

    public Usuario(String nombre, String nombreUsuario, String password, String telefono) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.telefono = telefono;
    }
    
   
    public void setPassword(String password) {
        if(password.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres");
        }
        this.password = password;
    }
    
    
}
