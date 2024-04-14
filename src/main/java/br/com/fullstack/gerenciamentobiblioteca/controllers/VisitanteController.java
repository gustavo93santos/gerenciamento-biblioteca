package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import br.com.fullstack.gerenciamentobiblioteca.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {
    private final VisitanteService visitanteService;
    @PostMapping
    public VisitanteModel create (@RequestBody VisitanteModel visitante){
        visitanteService.salvarVisitante(visitante);
        return ResponseEntity.status(HttpStatus.CREATED).body(visitante).getBody();
    }
}
