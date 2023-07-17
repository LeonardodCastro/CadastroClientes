package com.LeonardoCastro.CadastroClientes.controllers;

import com.LeonardoCastro.CadastroClientes.dtos.ClienteRequestDTO;
import com.LeonardoCastro.CadastroClientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastro")
    public ResponseEntity<?> registraCliente(@RequestBody ClienteRequestDTO requestDTO) {
        return ResponseEntity.ok(clienteService.metodoQueSalvaNoBanco(requestDTO));
    }

    @GetMapping("/clientes")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(clienteService.buscaGeral());
    }

}
