package br.com.fullstack.gerenciamentobiblioteca.services;

import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VisitanteService {
    private final VisitanteRepository visitanteRepository;

    public VisitanteModel salvarVisitante(VisitanteModel visitanteModel){
        visitanteModel = visitanteRepository.save(visitanteModel);
        return visitanteModel;
    }
}
