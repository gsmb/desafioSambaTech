package br.com.sambatech.desafio.domain.controller;

import br.com.sambatech.desafio.domain.entities.SambaMidiaEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController(value = "medias")
public class SambaMidiaController {

    @PostMapping
    public ResponseEntity<SambaMidiaEntity> createMidia(String nome, String arquivo, Integer Duracao, Date dataDeUpload) {
        return ResponseEntity.ok().body(new SambaMidiaEntity());
    }

    @GetMapping
    public ResponseEntity<SambaMidiaEntity> listMidias(List<SambaMidiaEntity> listaArquivos, String URL, Integer Duracao, Date dataDeUpload, boolean retornartodas) {
        return ResponseEntity.ok().body(new SambaMidiaEntity());
    }

    @GetMapping(value = "/medias/{id}")
    public ResponseEntity<SambaMidiaEntity> getMidia(@PathVariable String id, String nome, String URL, Integer Duracao, Date dataDeUpload, boolean Deleted) {
        return ResponseEntity.ok().body(new SambaMidiaEntity());
    }

    @PutMapping(value = "/medias/{id}")
    public ResponseEntity<SambaMidiaEntity> updateMidia(@PathVariable String id, String nome, String URL, Integer Duracao, Date dataDeUpload, boolean Deleted) {
        return ResponseEntity.ok().body(new SambaMidiaEntity());
    }

    @DeleteMapping(value = "/medias/{id}")
    public ResponseEntity<SambaMidiaEntity> deleteMidia(@PathVariable String id, String nome, String URL, Integer Duracao, Date dataDeUpload, boolean Deleted) {
        return ResponseEntity.ok().body(new SambaMidiaEntity());
    }
}
