package br.com.fullstack.gerenciamentobiblioteca.controllers;

import br.com.fullstack.gerenciamentobiblioteca.models.BibliotecarioModel;
import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import br.com.fullstack.gerenciamentobiblioteca.services.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor
public class BibliotecarioController {
    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public BibliotecarioModel create (@RequestBody BibliotecarioModel bibliotecario){
        bibliotecarioService.salvarBibliotecario(bibliotecario);
        return ResponseEntity.status(HttpStatus.CREATED).body(bibliotecario).getBody();
    }
}
