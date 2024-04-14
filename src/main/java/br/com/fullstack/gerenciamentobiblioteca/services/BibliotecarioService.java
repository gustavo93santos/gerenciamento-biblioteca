package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.BibliotecarioModel;
import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.models.LivroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {
    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioModel salvarBibliotecario(BibliotecarioModel bibliotecarioModel) {
        bibliotecarioModel = bibliotecarioRepository.save(bibliotecarioModel);
        return bibliotecarioModel;
    }

    public List<BibliotecarioModel> buscarBibliotecarios() {
        return bibliotecarioRepository.findAll();
    }

    public BibliotecarioModel buscarBibliotecarioPorId(Long id) throws Exception {
        return bibliotecarioRepository.findById(id).orElseThrow(() -> new Exception("Bibliotecario não encontrado!"));
    }

    public void deletarBibliotecario(Long id) throws Exception{
        bibliotecarioRepository.delete(buscarBibliotecarioPorId(id));
    }

    public void atualizarBibliotecario(Long id, BibliotecarioModel bibliotecario) throws Exception {
        bibliotecarioRepository.update(id, bibliotecario.getNome(), bibliotecario.getEmail(), bibliotecario.getSenha());
    }
}
