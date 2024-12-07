package com.automercado.entity;

public class Sucursal {
    
    private int id_Sucursal;
    private String nombre_Sucursal;
    private String direccion_Sucursal;
    private String telefono_Sucursal;
    private int id_Gerente;
    
    public Sucursal() {
    }

    public Sucursal(int id_Sucursal, String nombre_Sucursal, String direccion_Sucursal, String telefono_Sucursal, int id_Gerente) {
        this.id_Sucursal = id_Sucursal;
        this.nombre_Sucursal = nombre_Sucursal;
        this.direccion_Sucursal = direccion_Sucursal;
        this.telefono_Sucursal = telefono_Sucursal;
        this.id_Gerente = id_Gerente;
    }

    public int getId_Sucursal() {
        return id_Sucursal;
    }

    public void setId_Sucursal(int id_Sucursal) {
        this.id_Sucursal = id_Sucursal;
    }

    public String getNombre_Sucursal() {
        return nombre_Sucursal;
    }

    public void setNombre_Sucursal(String nombre_Sucursal) {
        this.nombre_Sucursal = nombre_Sucursal;
    }

    public String getDireccion_Sucursal() {
        return direccion_Sucursal;
    }

    public void setDireccion_Sucursal(String direccion_Sucursal) {
        this.direccion_Sucursal = direccion_Sucursal;
    }

    public String getTelefono_Sucursal() {
        return telefono_Sucursal;
    }

    public void setTelefono_Sucursal(String telefono_Sucursal) {
        this.telefono_Sucursal = telefono_Sucursal;
    }

    public int getId_Gerente() {
        return id_Gerente;
    }

    public void setId_Gerente(int id_Gerente) {
        this.id_Gerente = id_Gerente;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "id_Sucursal=" + id_Sucursal + ", nombre_Sucursal=" + nombre_Sucursal + ", direccion_Sucursal=" + direccion_Sucursal + ", telefono_Sucursal=" + telefono_Sucursal + ", id_Gerente=" + id_Gerente + '}';
    }
    
    
}
