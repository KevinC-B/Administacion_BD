package com.automercado.entity;

public class Producto {
    
    private int id_Producto;
    private String nombre_Producto;
    private String descripcion;
    private double precio;
    private int stock_Actual;
    private String categoria;
    
    public Producto() {
        
    }

    public Producto(int id_Producto, String nombre_Producto, String descripcion, double precio, int stock_Actual, String categoria) {
        this.id_Producto = id_Producto;
        this.nombre_Producto = nombre_Producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock_Actual = stock_Actual;
        this.categoria = categoria;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNombre_Producto() {
        return nombre_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock_Actual() {
        return stock_Actual;
    }

    public void setStock_Actual(int stock_Actual) {
        this.stock_Actual = stock_Actual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_Producto=" + id_Producto + ", nombre_Producto=" + nombre_Producto + ", descripcion=" + descripcion + ", precio=" + precio + ", stock_Actual=" + stock_Actual + ", categoria=" + categoria + '}';
    }
    
}
