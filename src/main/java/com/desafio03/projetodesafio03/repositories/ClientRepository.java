package com.desafio03.projetodesafio03.repositories;

import com.desafio03.projetodesafio03.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
