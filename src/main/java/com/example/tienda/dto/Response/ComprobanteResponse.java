package com.example.tienda.dto.Response;

import java.util.Date; // Importación de la clase Date

public class ComprobanteResponse {
    private Long comprobanteId;
    private Date fecha;
    private double total;

    // Getters y setters
    public Long getComprobanteId() {
        return comprobanteId;
    }

    public void setComprobanteId(Long comprobanteId) {
        this.comprobanteId = comprobanteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
