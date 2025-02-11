package com.backend.fullstack.repositories;

import com.backend.fullstack.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos las operaciones por la entidad Order

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByOrderTypes(String orderType); // Encontramos todas las ordenes por tipo
}
