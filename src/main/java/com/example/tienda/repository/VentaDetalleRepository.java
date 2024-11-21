package com.example.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tienda.entity.VentaDetalle;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface VentaDetalleRepository extends JpaRepository<VentaDetalle, Long> {
  List<VentaDetalle> findByVentaId(Long ventaId);

  List<VentaDetalle> findByProductoId(Long productoId);
}