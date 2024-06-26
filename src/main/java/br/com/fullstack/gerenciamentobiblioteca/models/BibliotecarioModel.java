package br.com.fullstack.gerenciamentobiblioteca.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bibliotecario")
public class BibliotecarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;
}
