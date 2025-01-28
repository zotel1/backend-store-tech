package com.backend.fullstack.repositories;

import com.backend.fullstack.model.AdditionalFee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos las tarifas adicionales
public interface AdditionalFeeRepository extends JpaRepository<AdditionalFee, Long> {
    List<AdditionalFee> findByCode(String code); // Buscamos tarifas adicionales por código
}
