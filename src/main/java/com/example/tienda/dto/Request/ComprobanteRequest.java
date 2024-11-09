package com.example.tienda.dto.Request;

import java.util.List;

public class ComprobanteRequest {
    private ClienteRequest cliente;
    private List<ComprobanteLineaRequest> lineas;

    // Getters y Setters
    public ClienteRequest getCliente() {
        return cliente;
    }

    public void setCliente(ClienteRequest cliente) {
        this.cliente = cliente;
    }

    public List<ComprobanteLineaRequest> getLineas() {
        return lineas;
    }

    public void setLineas(List<ComprobanteLineaRequest> lineas) {
        this.lineas = lineas;
    }
}
