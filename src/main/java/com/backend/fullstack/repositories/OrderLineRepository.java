package com.backend.fullstack.repositories;

import com.backend.fullstack.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos la lineas de pedidos relacionadas a una orden
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
    List<OrderLine> findByMouserPartNumber(String mouserPartNumber); // Buscamos lineas por MouserPartNumber
}
