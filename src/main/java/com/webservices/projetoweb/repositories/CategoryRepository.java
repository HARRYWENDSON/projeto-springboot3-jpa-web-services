package com.webservices.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projetoweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
