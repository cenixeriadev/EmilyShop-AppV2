package emilyshop.appv2.Modelo.Entidades;
import java.util.Date;
/**
 *
 * @author 3z
 */
public class Inventario extends Entidad {
    private String marca;
    private int talla;
    private String codigo;
    private String descripcion;
    private String color;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private Estado estado;
    private Date fechaEntrada;
    
    public enum Estado {
        ACTIVO, INACTIVO
    }

    
    
    public void reducirStock(int cantidad) {
        if(cantidad > stock) {
            throw new IllegalStateException("Stock insuficiente");
        }
        this.stock -= cantidad;
    }
    public double getPrecioVenta(){
        return precioVenta;
    }
    
    
}
