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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
    
    
}
