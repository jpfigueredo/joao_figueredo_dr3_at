package br.com.infnet.veiculo_service.model.client;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StartArray {
    @JsonProperty("nome")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<String> nome;
    @JsonProperty("valor")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<String> valor;
}