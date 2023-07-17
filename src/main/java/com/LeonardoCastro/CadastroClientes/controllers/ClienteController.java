package com.LeonardoCastro.CadastroClientes.controllers;

import com.LeonardoCastro.CadastroClientes.dtos.ClienteRequestDTO;
import com.LeonardoCastro.CadastroClientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ClienteController {
    @Autowired
    ClienteService clienteService;
    @PostMapping("/cadastro")
    public ResponseEntity<?> registraCliente(@RequestBody ClienteRequestDTO requestDTO) {
        return  ResponseEntity.ok(clienteService.metodoQueSalvaNoBanco(requestDTO));
    }

}
