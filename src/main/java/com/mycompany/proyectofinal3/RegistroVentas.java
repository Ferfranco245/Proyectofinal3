/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal3;

import java.util.Date;

/**
 *
 * @author fernada
 */
public class RegistroVentas {
  private final String nombreCliente;
    private final String nit;
    private final String direccion;
    private final double total;
    private final String vendedor;
    private final Date fecha;

    public RegistroVentas(String nombreCliente, String nit, String direccion, double total, String vendedor, Date fecha) {
        this.nombreCliente = nombreCliente;
        this.nit = nit;
        this.direccion = direccion;
        this.total = total;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNit() {
        return nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getTotal() {
        return total;
    }

    public String getVendedor() {
        return vendedor;
    }

    public Date getFecha() {
        return fecha;
    }
}
