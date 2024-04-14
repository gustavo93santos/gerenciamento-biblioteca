package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.BibliotecarioModel;
import br.com.fullstack.gerenciamentobiblioteca.services.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor
public class BibliotecarioController {
    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public BibliotecarioModel create(@RequestBody BibliotecarioModel bibliotecario) {
        return bibliotecarioService.salvarBibliotecario(bibliotecario);
    }

    @GetMapping
    public List<BibliotecarioModel> readAll() {
        return bibliotecarioService.buscarBibliotecarios();
    }

    @GetMapping("{id}")
    public BibliotecarioModel readById(@PathVariable Long id) throws Exception {
        return bibliotecarioService.buscarBibliotecarioPorId(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) throws Exception {
        bibliotecarioService.deletarBibliotecario(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody BibliotecarioModel bibliotecario) throws Exception {
        bibliotecarioService.atualizarBibliotecario(id, bibliotecario);
    }

}
