package com.LeonardoCastro.CadastroClientes.services;

import com.LeonardoCastro.CadastroClientes.dtos.ClienteRequestDTO;
import com.LeonardoCastro.CadastroClientes.dtos.ClienteResponseDTO;
import com.LeonardoCastro.CadastroClientes.entities.ClienteEntity;
import com.LeonardoCastro.CadastroClientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;
    public ClienteResponseDTO metodoQueSalvaNoBanco(ClienteRequestDTO requestDTO){
        ClienteResponseDTO responseDTO = clienteRepository.save(ClienteEntity.settaRequestNoEnitity(requestDTO));
        return responseDTO;
    }
    public List<ClienteEntity> buscaGeral(){
        List<ClienteEntity> list = clienteRepository.findAll();
        return list;
    }
}
