package com.LeonardoCastro.CadastroClientes.dtos;

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
