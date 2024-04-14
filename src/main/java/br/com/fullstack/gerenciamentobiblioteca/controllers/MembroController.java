package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.services.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
@RequiredArgsConstructor
public class MembroController {
    private final MembroService membroService;

    @PostMapping
    public MembroModel create(@RequestBody MembroModel membro) {
        return membroService.salvarMembro(membro);
    }

    @GetMapping
    public List<MembroModel> readAll() {
        return membroService.buscarMembros();
    }

    @GetMapping("{id}")
    public MembroModel readById(@PathVariable Long id) throws Exception {
        return membroService.buscarMembroPorId(id);
    }

}
