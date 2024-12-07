package com.automercado.entity;

import java.util.Date;

public class Inventario {
    
    private int id_Inventario;
    private int id_Producto;
    private int stock_Inicial;
    private int stock_Actualizado;
    private Date fecha_Actualizacion;
    
    public Inventario() {
    }

    public Inventario(int id_Inventario, int id_Producto, int stock_Inicial, int stock_Actualizado, Date fecha_Actualizacion) {
        this.id_Inventario = id_Inventario;
        this.id_Producto = id_Producto;
        this.stock_Inicial = stock_Inicial;
        this.stock_Actualizado = stock_Actualizado;
        this.fecha_Actualizacion = fecha_Actualizacion;
    }

    public int getId_Inventario() {
        return id_Inventario;
    }

    public void setId_Inventario(int id_Inventario) {
        this.id_Inventario = id_Inventario;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getStock_Inicial() {
        return stock_Inicial;
    }

    public void setStock_Inicial(int stock_Inicial) {
        this.stock_Inicial = stock_Inicial;
    }

    public int getStock_Actualizado() {
        return stock_Actualizado;
    }

    public void setStock_Actualizado(int stock_Actualizado) {
        this.stock_Actualizado = stock_Actualizado;
    }

    public Date getFecha_Actualizacion() {
        return fecha_Actualizacion;
    }

    public void setFecha_Actualizacion(Date fecha_Actualizacion) {
        this.fecha_Actualizacion = fecha_Actualizacion;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id_Inventario=" + id_Inventario + ", id_Producto=" + id_Producto + ", stock_Inicial=" + stock_Inicial + ", stock_Actualizado=" + stock_Actualizado + ", fecha_Actualizacion=" + fecha_Actualizacion + '}';
    }
    
}
