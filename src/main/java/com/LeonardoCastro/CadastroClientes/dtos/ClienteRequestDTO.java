package com.LeonardoCastro.CadastroClientes.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ClienteRequestDTO {
    private String name;
    private Integer age;
    private String gender;
}
