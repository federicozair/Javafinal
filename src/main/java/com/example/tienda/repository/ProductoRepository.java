package com.example.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tienda.entity.Producto;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

  List<Producto> findByNombre(String nombre);

  List<Producto> findByPrecioBetween(Double minPrice, Double maxPrice);

  List<Producto> findByNombreContaining(String term);
}