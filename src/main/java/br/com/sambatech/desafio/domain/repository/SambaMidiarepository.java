package br.com.sambatech.desafio.domain.repository;


import br.com.sambatech.desafio.domain.entities.SambaMidiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SambaMidiarepository extends JpaRepository<SambaMidiaEntity, UUID> {
}
