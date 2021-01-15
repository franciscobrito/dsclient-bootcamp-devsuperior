package com.facbrito.dscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facbrito.dscliente.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
