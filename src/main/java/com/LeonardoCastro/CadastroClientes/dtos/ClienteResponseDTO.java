package com.LeonardoCastro.CadastroClientes.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponseDTO {
    private Long id;
    private String name;
    private Integer age;
    private String gender;
}
