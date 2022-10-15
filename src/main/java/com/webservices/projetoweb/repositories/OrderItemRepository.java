package com.webservices.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projetoweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
