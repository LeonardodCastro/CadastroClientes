package com.LeonardoCastro.CadastroClientes.controllers;

import com.LeonardoCastro.CadastroClientes.dtos.ClienteRequestDTO;
import com.LeonardoCastro.CadastroClientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastro")
    public ResponseEntity<?> registraCliente(@RequestBody ClienteRequestDTO requestDTO) {
        return ResponseEntity.ok(clienteService.metodoQueSalvaNoBanco(requestDTO));
    }

    @GetMapping("/")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(clienteService.buscaGeral());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable @RequestBody String id) {
        Long longId = Long.parseLong(id);
        return ResponseEntity.ok(clienteService.buscaPorId(longId));
    }

}