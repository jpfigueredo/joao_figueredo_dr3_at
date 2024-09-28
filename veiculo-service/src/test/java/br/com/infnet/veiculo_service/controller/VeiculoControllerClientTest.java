package br.com.infnet.veiculo_service.controller;

import br.com.infnet.veiculo_service.model.client.VeiculoResponse;
import br.com.infnet.veiculo_service.service.VeiculoWebClient;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;


@WebFluxTest(VeiculoControllerClient.class)
public class VeiculoControllerClientTest {
    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private VeiculoWebClient veiculoWebClient;

    @Test
    public void testGetVeiculoResponse() {
        List<VeiculoResponse> veiculoResponses = Arrays.asList(
                new VeiculoResponse("Honda", "20000.00"),
                new VeiculoResponse("Toyota", "25000.00"),
                new VeiculoResponse("Ford", "18000.00")
        );
        Mono<List<VeiculoResponse>> listaVeiculos = Mono.just(veiculoResponses);
        Mockito.when(veiculoWebClient.getVeiculoPorTipoVeiculo(anyString())).thenReturn(listaVeiculos);
        webTestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/veiculos")
                        .queryParam("tipoVeiculo", "271")
                        .build())
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(VeiculoResponse.class)
                .value(responseList -> {
                    assert responseList.size() == 3;
                    assert responseList.get(0).getNome().equals("Honda");
                    assert responseList.get(0).getValor().equals("20000.00");
                });
    }

}