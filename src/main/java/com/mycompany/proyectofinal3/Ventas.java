/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal3;

/**
 *
 * @author fernada
 */
public class Ventas {
    private final String libro;
    private int cantidad;
    private double total;
    private String nitCliente;
    private String nombreCliente;
    private String direccionCliente;
    private Usuario usuarioVendedor;

    // Constructor
    public Ventas(String libro, int cantidad, double total, String nitCliente, String nombreCliente, String direccionCliente, Usuario usuarioVendedor) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.total = total;
        this.nitCliente = nitCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.usuarioVendedor = usuarioVendedor;
    }

    // Getters y Setters
    public String getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Usuario getUsuarioVendedor() {
        return usuarioVendedor;
    }

    public void setUsuarioVendedor(Usuario usuarioVendedor) {
        this.usuarioVendedor = usuarioVendedor;
    }
}


