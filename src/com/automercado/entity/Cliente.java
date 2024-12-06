package com.automercado.entity;

import java.util.Date;

public class Cliente {
    
    private int id_Cliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correro_Electronico;
    private Date fecha_registro;

    public Cliente() {
        
    }

    public Cliente(int id_Cliente, String nombre, String direccion, String telefono, String correro_Electronico, Date fecha_registro) {
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correro_Electronico = correro_Electronico;
        this.fecha_registro = fecha_registro;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorrero_Electronico() {
        return correro_Electronico;
    }

    public void setCorrero_Electronico(String correro_Electronico) {
        this.correro_Electronico = correro_Electronico;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_Cliente=" + id_Cliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correro_Electronico=" + correro_Electronico + ", fecha_registro=" + fecha_registro + '}';
    }
    
}
