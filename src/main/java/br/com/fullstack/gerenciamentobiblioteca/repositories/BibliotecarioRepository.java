package br.com.fullstack.gerenciamentobiblioteca.repositories;

import br.com.fullstack.gerenciamentobiblioteca.models.BibliotecarioModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioModel, Long> {

    @Modifying
    @Transactional
    @Query("update BibliotecarioModel t set " +
            "t.nome = :nome, " +
            "t.email = :email, " +
            "t.senha = :senha " +
            "where t.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("email") String email,
                @Param("senha") String senha);


}
