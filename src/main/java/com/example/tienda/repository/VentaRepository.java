package com.example.tienda.repository;

import com.example.tienda.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Métodos personalizados si son necesarios
}
