package com.example.demo.repository;

import com.example.demo.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ClientRepository
 */
@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {

}