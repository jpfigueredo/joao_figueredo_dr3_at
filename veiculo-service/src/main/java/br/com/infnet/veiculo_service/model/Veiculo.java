package br.com.infnet.veiculo_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Veiculo {
    @Id
    private Long id;
    private String modelo;
    private String marca;
    private Integer ano;

    public Veiculo(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }
}