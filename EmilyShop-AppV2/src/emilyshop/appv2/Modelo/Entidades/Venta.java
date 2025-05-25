
package emilyshop.appv2.Modelo.Entidades;
import java.util.*;
/**
 *
 * @author 3z
 */
public class Venta extends Entidad {
    private Cliente cliente;
    private Date fechaVenta;
    private double totalVenta;
    private MetodoPago metodoPago;
    private List<DetalleVenta> detalles ;
    
    public enum MetodoPago {
        EFECTIVO, TARJETA, TRANSFERENCIA
    }
    

    
    // Método para agregar detalle
    public void agregarDetalle(DetalleVenta detalle) {
        detalle.setVenta(this);
        this.detalles.add(detalle);
        this.totalVenta += detalle.getSubtotal();
    }
    public double getTotalVenta(){
        return totalVenta;
    }
    
    
    // ... getters y setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    
}