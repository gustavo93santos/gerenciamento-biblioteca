package br.com.fullstack.gerenciamentobiblioteca.controllers;

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
}
