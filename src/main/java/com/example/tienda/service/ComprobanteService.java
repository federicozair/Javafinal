package com.example.tienda.service;

import com.example.tienda.repository.ClienteRepository;
import com.example.tienda.repository.ProductoRepository;
import com.example.tienda.repository.ComprobanteRepository;
import com.example.tienda.dto.Response.ComprobanteResponse;
import com.example.tienda.dto.Request.ComprobanteLineaRequest;
import com.example.tienda.dto.Request.ComprobanteRequest;
import com.example.tienda.entity.Cliente;
import com.example.tienda.entity.Producto;
import com.example.tienda.model.Comprobante;
import com.example.tienda.model.ComprobanteLinea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

@Service
public class ComprobanteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    public ComprobanteResponse createComprobante(ComprobanteRequest request) throws Exception {
        // Validación de cliente
        Cliente cliente = clienteRepository.findById((long) request.getCliente().getClienteId()) // Convierte a Long
                .orElseThrow(() -> new Exception("Cliente no encontrado"));

        List<ComprobanteLinea> lineas = new ArrayList<>();
        double total = 0;

        // Procesamiento de cada línea del comprobante
        for (ComprobanteLineaRequest lineaRequest : request.getLineas()) {
            // Asegúrate de que el ID del producto es Long
            Producto producto = productoRepository.findById(lineaRequest.getProductoId())
                    .orElseThrow(() -> new Exception("Producto no encontrado"));

            ComprobanteLinea linea = new ComprobanteLinea();
            linea.setProducto(producto);
            linea.setCantidad(lineaRequest.getCantidad());
            linea.setPrecio(producto.getPrecio());
            total += producto.getPrecio() * lineaRequest.getCantidad();
            lineas.add(linea);
        }

        // Creación del comprobante
        Comprobante comprobante = new Comprobante();
        comprobante.setCliente(cliente);
        comprobante.setFecha(new Date());
        comprobante.setLineas(lineas);
        comprobante.setTotal(total);
        
        comprobanteRepository.save(comprobante);

        // Generación de respuesta
        ComprobanteResponse response = new ComprobanteResponse();
        response.setComprobanteId(comprobante.getId());
        response.setFecha(comprobante.getFecha());
        response.setTotal(total);

        return response;
    }
}
