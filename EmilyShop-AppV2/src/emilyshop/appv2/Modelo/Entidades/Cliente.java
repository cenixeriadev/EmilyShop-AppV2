package emilyshop.appv2.Modelo.Entidades;
/**
 *
 * @author 3z
 */
public class Cliente extends Entidad {
    private String nombreApellido;
    private String telefono;
    
    
    

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
