package com.backend.fullstack.repositories;

import com.backend.fullstack.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Gestionamos las direcciones BillingAddress y ShippingAddress
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByAddressType(String addressType); //Busvamos todas las direcciones por tipo Billing y Shipping
}
