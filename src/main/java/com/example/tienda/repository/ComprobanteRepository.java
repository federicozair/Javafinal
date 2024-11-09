package com.example.tienda.repository;

import com.example.tienda.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante, Long> {
    // Puedes añadir métodos personalizados aquí si necesitas consultas adicionales
}
