package com.LeonardoCastro.CadastroClientes.repositories;

import com.LeonardoCastro.CadastroClientes.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
