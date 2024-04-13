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

    private String nome;

    private String email;

    private String senha;
}
