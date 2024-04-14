package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {
    private final MembroRepository membroRepository;

    public MembroModel salvarMembro(MembroModel membroModel) {
        membroModel = membroRepository.save(membroModel);
        return membroModel;
    }

    public List<MembroModel> buscarMembros() {
        return membroRepository.findAll();
    }

    public MembroModel buscarMembroPorId(Long id) throws Exception {
        return membroRepository.findById(id).orElseThrow(() -> new Exception("Livro não encontrado!"));
    }
}
