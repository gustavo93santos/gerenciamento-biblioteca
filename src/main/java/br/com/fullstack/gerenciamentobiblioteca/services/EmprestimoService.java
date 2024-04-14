package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.models.LivroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.EmprestimoRepository;
import br.com.fullstack.gerenciamentobiblioteca.repositories.LivroRepository;
import br.com.fullstack.gerenciamentobiblioteca.repositories.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;
    private final LivroService livroService;
    private final MembroService membroService;

    public EmprestimoModel salvarEmprestimo(EmprestimoModel emprestimoModel) {
        emprestimoModel = emprestimoRepository.save(emprestimoModel);
        return emprestimoModel;
    }

    public List<EmprestimoModel> buscarEmprestimos() {
        return emprestimoRepository.findAll();
    }

    public EmprestimoModel buscarEmprestimoPorId(Long id) throws Exception {
        return emprestimoRepository.findById(id).orElseThrow(() -> new Exception("Emprestimo não encontrado!"));
    }

    public void deletarEmprestimo(Long id) throws Exception{
        emprestimoRepository.delete(buscarEmprestimoPorId(id));
    }
}
