package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * Cliente
 */

@Data
@Entity // Anotação para indicar que esta classe é uma entidade
public class Cliente {

    @Id // Anotação para indicar que esta variável é a chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) // Anotação para indicar que esta variável é gerada
    private Long id;

    @Column(nullable = true) // Anotação para indicar que esta propriedade é uma coluna
    private String nome;

}