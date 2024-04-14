package br.com.fullstack.gerenciamentobiblioteca.repositories;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroModel, Long> {

    @Transactional
    @Modifying
    @Query("update MembroModel t set " +
            "t.nome = :nome, " +
            "t.endereco = :endereco, " +
            "t.telefone = :telefone " +
            "where t.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("endereco") String endereco,
                @Param("telefone") String telefone);

}
