package com.example.tienda.model;

import java.util.List;
import java.util.Date;  // Importa la clase Date
import com.example.tienda.entity.Cliente;  // Importa Cliente

public class Comprobante {
    private Long id;
    private Cliente cliente;
    private Date fecha;
    private List<ComprobanteLinea> lineas;  // Corrige 'privae' a 'private'
    private double total;  // Corrige 'privatte' a 'private'

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<ComprobanteLinea> getLineas() {
        return lineas;
    }

    public void setLineas(List<ComprobanteLinea> lineas) {
        this.lineas = lineas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
