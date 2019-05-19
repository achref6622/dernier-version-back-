package com.tnt.bourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnt.bourse.entities.OrderVente;

public interface OrderVenteRepository extends JpaRepository<OrderVente, Integer> {

}
