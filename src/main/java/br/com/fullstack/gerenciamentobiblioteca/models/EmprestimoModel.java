package br.com.fullstack.gerenciamentobiblioteca.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "emprestimo")
public class EmprestimoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataEmprestimo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataDevolucao;

    @ManyToOne(optional = false)
    @JoinColumn(name = "livro_id")
    private LivroModel livro;

    @ManyToOne(optional = false)
    @JoinColumn(name = "membro_id")
    private MembroModel membro;
}
