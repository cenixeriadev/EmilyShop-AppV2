package emilyshop.appv2.Modelo.Entidades;
import java.util.*;
/**
 *
 * @author 3z
 */
public class Cliente extends Entidad {
    private String nombreApellido;
    private String telefono;
    private List<Venta> historialCompras;
    
    
    
    public double getTotalGastado() {
        return historialCompras.stream()
            .mapToDouble(Venta::getTotalVenta)
            .sum();
    }
    
    // ... getters y setters

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

    public List<Venta> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<Venta> historialCompras) {
        this.historialCompras = historialCompras;
    }

}
