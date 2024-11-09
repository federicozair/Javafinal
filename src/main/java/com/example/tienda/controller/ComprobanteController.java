package com.example.tienda.controller;

import com.example.tienda.dto.Request.ComprobanteRequest;
import com.example.tienda.dto.Response.ComprobanteResponse;
import com.example.tienda.service.ComprobanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comprobantes")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

    @PostMapping
    public ResponseEntity<?> createComprobante(@RequestBody ComprobanteRequest request) {
        try {
            ComprobanteResponse response = comprobanteService.createComprobante(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
