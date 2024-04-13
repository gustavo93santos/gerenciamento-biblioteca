package br.com.fullstack.gerenciamentobiblioteca.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "membro")
public class MembroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String endereco;

    private String telefone;
}
