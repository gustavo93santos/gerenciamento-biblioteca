package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import br.com.fullstack.gerenciamentobiblioteca.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {
    private final VisitanteService visitanteService;

    @PostMapping
    public VisitanteModel create(@RequestBody VisitanteModel visitante) {
        return visitanteService.salvarVisitante(visitante);
    }

    @GetMapping
    public List<VisitanteModel> readAll() {
        return visitanteService.buscarVisitantes();
    }

    @GetMapping("{id}")
    public VisitanteModel readById(@PathVariable Long id) throws Exception {
        return visitanteService.buscarVisitantePorId(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) throws Exception {
        visitanteService.deletarVisitante(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable Long id, @RequestBody VisitanteModel visitante) throws Exception {
        visitanteService.atualizarVisitante(id, visitante);
    }
}
