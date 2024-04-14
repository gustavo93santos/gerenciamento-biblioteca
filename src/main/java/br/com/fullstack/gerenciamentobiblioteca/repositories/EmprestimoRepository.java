package br.com.fullstack.gerenciamentobiblioteca.repositories;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Long> {

    @Modifying
    @Transactional
    @Query("update EmprestimoModel t set " +
            "t.dataDevolucao = :dataDevolucao " +
            "where t.id = :id")
    void update(@Param("id") Long id,
                @Param("dataDevolucao") String dataDevolucao);

}
