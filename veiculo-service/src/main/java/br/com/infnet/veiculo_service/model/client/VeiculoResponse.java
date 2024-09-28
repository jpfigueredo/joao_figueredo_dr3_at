package br.com.infnet.veiculo_service.model.client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VeiculoResponse {
    private String nome;
    private String valor;
}
