package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.EmprestimoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoModel salvarEmprestimo(EmprestimoModel emprestimoModel){
        emprestimoModel = emprestimoRepository.save(emprestimoModel);
        return emprestimoModel;
    }
}
