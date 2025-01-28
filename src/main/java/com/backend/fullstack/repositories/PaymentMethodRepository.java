package com.backend.fullstack.repositories;

import com.backend.fullstack.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos los metodos de pago
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {
    List<PaymentMethod> findByName(String name); // Buscamos por nombre
}
