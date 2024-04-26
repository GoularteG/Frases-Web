package br.com.alura.projetofrases.service;

import br.com.alura.projetofrases.model.Frases;
import br.com.alura.projetofrases.dto.FraseDTO;
import br.com.alura.projetofrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFrase() {
        Frases frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
