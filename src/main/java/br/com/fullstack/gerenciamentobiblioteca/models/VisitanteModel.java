package br.com.fullstack.gerenciamentobiblioteca.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "visitante")
public class VisitanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

}
