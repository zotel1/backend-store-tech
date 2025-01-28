package com.backend.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos los errores registrados
public interface ErrorRepository extends JpaRepository<Error, Long> {
    List<Error> findByContextType(String contextType); // Buscamos errores por tipo de contexto
}
