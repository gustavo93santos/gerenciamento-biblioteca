package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoModel salvarEmprestimo(EmprestimoModel emprestimoModel) {
        emprestimoModel = emprestimoRepository.save(emprestimoModel);
        return emprestimoModel;
    }

    public List<EmprestimoModel> buscarEmprestimos() {
        return emprestimoRepository.findAll();
    }

    public EmprestimoModel buscarEmprestimoPorId(Long id) throws Exception {
        return emprestimoRepository.findById(id).orElseThrow(() -> new Exception("Livro não encontrado!"));
    }
}
