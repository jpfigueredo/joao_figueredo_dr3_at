package br.com.infnet.veiculo_service.service;

import br.com.infnet.veiculo_service.model.client.VeiculoResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class VeiculoWebClient {

    private final WebClient webClient;

    public VeiculoWebClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://brasilapi.com.br").build();
    }

    public Mono<List<VeiculoResponse>> getVeiculoPorTipoVeiculo(String tipoVeiculo) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/fipe/marcas/v1")
                        .queryParam("tipoVeiculo", tipoVeiculo)
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<VeiculoResponse>>() {});
    }
}
