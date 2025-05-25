package emilyshop.appv2.Modelo.Entidades;
import java.util.*;
/**
 *
 * @author 3z
 */
public class Carrito extends Entidad {
    private Cliente cliente;
    private List<ItemCarrito> items;
    
    public Carrito(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }
    
    public void agregarItem(Inventario zapatilla, int cantidad) {
        ItemCarrito item = new ItemCarrito(zapatilla, cantidad);
        items.add(item);
    }
    
    // Método para calcular total
    public double getTotal() {
        return items.stream()
            .mapToDouble(ItemCarrito::getSubtotal)
            .sum();
    }
    
    // Método para convertir carrito a venta
    public Venta convertirAVenta(Venta.MetodoPago metodoPago) {
        Venta venta = new Venta();
        venta.setCliente(this.cliente);
        venta.setMetodoPago(metodoPago);
        
        for(ItemCarrito item : items) {
            DetalleVenta detalle = new DetalleVenta(
                item.getZapatilla(), 
                item.getCantidad()
            );
            venta.agregarDetalle(detalle);
        }
        
        return venta;
    }
}


