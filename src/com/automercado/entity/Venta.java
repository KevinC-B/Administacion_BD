package com.automercado.entity;

import java.util.Date;

public class Venta {

    private Long id_Venta;
    private int id_Cliente;
    private Date fecha_Venta;
    private Double monto_Total;
    private String medio_Pago;

    public Venta() {
    }

    public Venta(Long id_Venta, int id_Cliente, Date fecha_Venta, Double monto_Total, String medio_Pago) {
        this.id_Venta = id_Venta;
        this.id_Cliente = id_Cliente;
        this.fecha_Venta = fecha_Venta;
        this.monto_Total = monto_Total;
        this.medio_Pago = medio_Pago;
    }

    public Long getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(Long id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Date getFecha_Venta() {
        return fecha_Venta;
    }

    public void setFecha_Venta(Date fecha_Venta) {
        this.fecha_Venta = fecha_Venta;
    }

    public Double getMonto_Total() {
        return monto_Total;
    }

    public void setMonto_Total(Double monto_Total) {
        this.monto_Total = monto_Total;
    }

    public String getMedio_Pago() {
        return medio_Pago;
    }

    public void setMedio_Pago(String medio_Pago) {
        this.medio_Pago = medio_Pago;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_Venta=" + id_Venta + ", id_Cliente=" + id_Cliente + ", fecha_Venta=" + fecha_Venta + ", monto_Total=" + monto_Total + ", medio_Pago=" + medio_Pago + '}';
    }
    
}
