package emilyshop.appv2.Modelo.Entidades;

/**
 *
 * @author 3z
 */
public class ItemCarrito {
    private Inventario zapatilla;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    
    public ItemCarrito(Inventario zapatilla, int cantidad) {
        this.zapatilla = zapatilla;
        this.cantidad = cantidad;
        this.precioUnitario = zapatilla.getPrecioVenta();
        this.subtotal = cantidad * precioUnitario;
    }
    
    
    // ... getters

    public Inventario getZapatilla() {
        return zapatilla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
