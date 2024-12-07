package com.automercado.entity;

public class DetalleVenta {
    
    private int id_Detalle;
    private Long id_Venta;
    private int id_Producto;
    private int cantidad;
    private int precio_Unitario;
    
    public DetalleVenta() {
    }

    public DetalleVenta(int id_Detalle, Long id_Venta, int id_Producto, int cantidad, int precio_Unitario) {
        this.id_Detalle = id_Detalle;
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.precio_Unitario = precio_Unitario;
    }

    public int getId_Detalle() {
        return id_Detalle;
    }

    public void setId_Detalle(int id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    public Long getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(Long id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_Unitario() {
        return precio_Unitario;
    }

    public void setPrecio_Unitario(int precio_Unitario) {
        this.precio_Unitario = precio_Unitario;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "id_Detalle=" + id_Detalle + ", id_Venta=" + id_Venta + ", id_Producto=" + id_Producto + ", cantidad=" + cantidad + ", precio_Unitario=" + precio_Unitario + '}';
    }
    
}
