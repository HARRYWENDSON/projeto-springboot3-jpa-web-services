package com.webservices.projetoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservices.projetoweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
