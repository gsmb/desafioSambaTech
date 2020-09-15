package br.com.sambatech.desafio.domain.service;

import br.com.sambatech.desafio.domain.controller.SambaMidiaController;
import br.com.sambatech.desafio.domain.entities.SambaMidiaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SambaMidiaService {

    private final SambaMidiaController sambaMidiaController;

    @Autowired
    public SambaMidiaService(SambaMidiaController sambaMidiaController) {
        this.sambaMidiaController = sambaMidiaController;
    }

    public SambaMidiaEntity obterMidia() {
        return null;
    }
}
