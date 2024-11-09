package com.example.tienda.dto.Request;

public class ComprobanteLineaRequest {

    private Long productoId;  // ID del producto
    private int cantidad;     // Cantidad del producto

    // Getter para productoId
    public Long getProductoId() {
        return productoId;
    }

    // Setter para productoId
    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    // Getter para cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Setter para cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
