package com.webservices.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projetoweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
