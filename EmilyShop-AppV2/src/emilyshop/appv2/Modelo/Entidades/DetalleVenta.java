package emilyshop.appv2.Modelo.Entidades;

/**
 *
 * @author 3z
 */
public class DetalleVenta extends Entidad {
    private Venta venta;
    private Inventario zapatilla;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    
    public DetalleVenta(Inventario zapatilla, int cantidad) {
        this.zapatilla = zapatilla;
        this.cantidad = cantidad;
        this.precioUnitario = zapatilla.getPrecioVenta();
        this.subtotal = cantidad * precioUnitario;
        zapatilla.reducirStock(cantidad);
    }
    public void setVenta(Venta venta){
        this.venta = venta;
    }
    public double getSubtotal(){
        return subtotal;
    }

    public Inventario getZapatilla() {
        return zapatilla;
    }


    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

}
