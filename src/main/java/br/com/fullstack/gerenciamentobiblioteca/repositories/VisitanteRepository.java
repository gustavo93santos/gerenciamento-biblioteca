package br.com.fullstack.gerenciamentobiblioteca.repositories;

import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteModel, Long> {

    @Modifying
    @Transactional
    @Query("update VisitanteModel t set " +
            "t.nome = :nome, " +
            "t.telefone = :telefone " +
            "where t.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("telefone") String telefone);

}
