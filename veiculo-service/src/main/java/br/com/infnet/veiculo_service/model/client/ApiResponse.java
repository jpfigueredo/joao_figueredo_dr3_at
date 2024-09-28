package br.com.infnet.veiculo_service.model.client;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApiResponse {
    @JsonProperty("START_ARRAY")
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    private StartArray startArray;
}
