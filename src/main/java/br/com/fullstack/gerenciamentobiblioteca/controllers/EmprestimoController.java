package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.services.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
@RequiredArgsConstructor
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    @PostMapping
    public EmprestimoModel create(@RequestBody EmprestimoModel emprestimo) {
        return emprestimoService.salvarEmprestimo(emprestimo);
    }

    @GetMapping
    public List<EmprestimoModel> readAll() {
        return emprestimoService.buscarEmprestimos();
    }

    @GetMapping("{id}")
    public EmprestimoModel readById(@PathVariable Long id) throws Exception {
        return emprestimoService.buscarEmprestimoPorId(id);
    }

}
