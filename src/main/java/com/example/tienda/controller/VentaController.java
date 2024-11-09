package com.example.tienda.controller;

import com.example.tienda.entity.Venta;
import com.example.tienda.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    
    @Autowired
    private VentaService ventaService;

    // Obtener todas las ventas
    @GetMapping
    public List<Venta> getAllVentas() {
        return ventaService.getAllVentas();
    }

    // Obtener una venta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Venta> getVentaById(@PathVariable Long id) {
        Optional<Venta> optionalVenta = ventaService.getVentaById(id);
        if (optionalVenta.isPresent()) {
            return ResponseEntity.ok(optionalVenta.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
