package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.LivroModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroModel salvarLivro(LivroModel livroModel) {
        livroModel = livroRepository.save(livroModel);
        return livroModel;
    }

    public List<LivroModel> buscarLivros() {
        return livroRepository.findAll();
    }

    public LivroModel buscarLivroPorId(Long id) throws Exception {
        return livroRepository.findById(id).orElseThrow(() -> new Exception("Livro não encontrado!"));
    }

    public void deletarLivro(Long id) throws Exception{
        livroRepository.delete(buscarLivroPorId(id));
    }
}
