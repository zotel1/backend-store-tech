package com.backend.fullstack.repositories;

import com.backend.fullstack.model.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
    List<OrderLine> findByMouserPartNumber(String mouserPartNumber);
}
