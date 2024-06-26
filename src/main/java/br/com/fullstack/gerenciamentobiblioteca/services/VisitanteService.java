package br.com.fullstack.gerenciamentobiblioteca.services;


import br.com.fullstack.gerenciamentobiblioteca.models.MembroModel;
import br.com.fullstack.gerenciamentobiblioteca.models.VisitanteModel;
import br.com.fullstack.gerenciamentobiblioteca.repositories.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {
    private final VisitanteRepository visitanteRepository;

    public VisitanteModel salvarVisitante(VisitanteModel visitanteModel) {
        visitanteModel = visitanteRepository.save(visitanteModel);
        return visitanteModel;
    }

    public List<VisitanteModel> buscarVisitantes() {
        return visitanteRepository.findAll();
    }

    public VisitanteModel buscarVisitantePorId(Long id) throws Exception {
        return visitanteRepository.findById(id).orElseThrow(() -> new Exception("Visitante não encontrado!"));
    }

    public void deletarVisitante(Long id) throws Exception{
        visitanteRepository.delete(buscarVisitantePorId(id));
    }

    public void atualizarVisitante(Long id, VisitanteModel visitante) throws Exception {
        visitanteRepository.update(id, visitante.getNome(), visitante.getTelefone());
    }
}
