package com.LeonardoCastro.CadastroClientes.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ClienteRequestDTO {
    private String name;
    private Integer age;
    private String gender;
}
