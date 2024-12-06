package com.automercado.entity;

import java.util.Date;

public class Empleado {

    private int id_Empleado;
    private String nombre_Empleado;
    private String cargo;
    private Date fecha_Contratacion;
    private double salario;
    private Integer id_Gerente;

    public Empleado() {
    }

    public Empleado(int id_Empleado, String nombre_Empleado, String cargo, Date fecha_Contratacion, double salario, Integer id_Gerente) {
        this.id_Empleado = id_Empleado;
        this.nombre_Empleado = nombre_Empleado;
        this.cargo = cargo;
        this.fecha_Contratacion = fecha_Contratacion;
        this.salario = salario;
        this.id_Gerente = id_Gerente;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getNombre_Empleado() {
        return nombre_Empleado;
    }

    public void setNombre_Empleado(String nombre_Empleado) {
        this.nombre_Empleado = nombre_Empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFecha_Contratacion() {
        return fecha_Contratacion;
    }

    public void setFecha_Contratacion(Date fecha_Contratacion) {
        this.fecha_Contratacion = fecha_Contratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getId_Gerente() {
        return id_Gerente;
    }

    public void setId_Gerente(Integer id_Gerente) {
        this.id_Gerente = id_Gerente;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "id_Empleado=" + id_Empleado
                + ", nombre_Empleado='" + nombre_Empleado + '\''
                + ", cargo='" + cargo + '\''
                + ", fecha_Contratacion=" + fecha_Contratacion
                + ", salario=" + salario
                + ", id_Gerente=" + id_Gerente
                + '}';
    }
}
