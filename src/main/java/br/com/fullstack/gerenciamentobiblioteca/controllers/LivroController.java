package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.EmprestimoModel;
import br.com.fullstack.gerenciamentobiblioteca.models.LivroModel;
import br.com.fullstack.gerenciamentobiblioteca.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {
    private final LivroService livroService;

    @PostMapping
    public LivroModel create(@RequestBody LivroModel livro) {
        return livroService.salvarLivro(livro);
    }

    @GetMapping
    public List<LivroModel> readAll() {
        return livroService.buscarLivros();
    }

    @GetMapping("{id}")
    public LivroModel readById(@PathVariable Long id) throws Exception {
        return livroService.buscarLivroPorId(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) throws Exception {
        livroService.deletarLivro(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody LivroModel livro) throws Exception {
        livroService.atualizarLivro(id, livro);
    }
}
