package emilyshop.appv2.Modelo.Entidades;
/**
 *
 * @author 3z
 */
public class Usuario extends Entidad {
    private String nombre;
    private String nombreUsuario;
    private String password;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getPassword(){
        return password;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
}
