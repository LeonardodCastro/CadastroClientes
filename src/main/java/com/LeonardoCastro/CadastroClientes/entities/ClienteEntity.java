package com.LeonardoCastro.CadastroClientes.entities;

import com.LeonardoCastro.CadastroClientes.dtos.ClienteRequestDTO;
import com.LeonardoCastro.CadastroClientes.dtos.ClienteResponseDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_cliente")
public class ClienteEntity extends ClienteResponseDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    @Bean
    public static ClienteEntity viraEntitdade (ClienteRequestDTO requestDTO){
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setName(requestDTO.getName());
        clienteEntity.setAge(requestDTO.getAge());
        clienteEntity.setGender(requestDTO.getGender());
        return clienteEntity;
    }
}