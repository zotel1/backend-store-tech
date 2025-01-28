package com.backend.fullstack.repositories;

import com.backend.fullstack.model.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos los metodos de envio
public interface ShippingMethodRepository extends JpaRepository<ShippingMethod, Long> {
    List<ShippingMethod> findByPrimaryMethod(String primaryMethod); // Buscamos por nombre de metodo primario
}
