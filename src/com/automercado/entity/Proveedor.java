package com.automercado.entity;

public class Proveedor {

    private int id_Proveedor;
    private String nombre_Proveedor;
    private String direccion;
    private String telefono;
    private String correo_Electronico;
    private int id_Producto;

    public Proveedor() {
    }

    public Proveedor(int id_Proveedor, String nombre_Proveedor, String direccion, String telefono, String correo_Electronico, int id_Producto) {
        this.id_Proveedor = id_Proveedor;
        this.nombre_Proveedor = nombre_Proveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_Electronico = correo_Electronico;
        this.id_Producto = id_Producto;
    }

    public int getId_Proveedor() {
        return id_Proveedor;
    }

    public void setId_Proveedor(int id_Proveedor) {
        this.id_Proveedor = id_Proveedor;
    }

    public String getNombre_Proveedor() {
        return nombre_Proveedor;
    }

    public void setNombre_Proveedor(String nombre_Proveedor) {
        this.nombre_Proveedor = nombre_Proveedor;
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

    public String getCorreo_Electronico() {
        return correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        this.correo_Electronico = correo_Electronico;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id_Proveedor=" + id_Proveedor + ", nombre_Proveedor=" + nombre_Proveedor
                + ", direccion=" + direccion + ", telefono=" + telefono + ", correo_Electronico=" + correo_Electronico
                + ", id_Producto=" + id_Producto + '}';
    }
}
