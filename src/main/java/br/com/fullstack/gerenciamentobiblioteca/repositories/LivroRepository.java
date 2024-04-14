package br.com.fullstack.gerenciamentobiblioteca.repositories;

import br.com.fullstack.gerenciamentobiblioteca.models.LivroModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long> {

    @Modifying
    @Transactional
    @Query("update LivroModel t set " +
            "t.titulo = :titulo, " +
            "t.autor = :autor, " +
            "t.anoPublicacao = :ano_publicacao " +
            "where t.id = :id")
    void update(@Param("id") Long id,
                @Param("titulo") String titulo,
                @Param("autor") String autor,
                @Param("ano_publicacao") Integer ano_publicacao);

}
