package br.com.infnet.veiculo_service.controller;

import br.com.infnet.veiculo_service.model.client.VeiculoResponse;
import br.com.infnet.veiculo_service.service.VeiculoWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/client/veiculos")
public class VeiculoControllerClient {

    @Autowired
    private VeiculoWebClient veiculoWebClient;

    @GetMapping
    public Mono<List<VeiculoResponse>> getVeiculoPorTipoVeiculo(@RequestParam String tipoVeiculo) {
        return veiculoWebClient.getVeiculoPorTipoVeiculo(tipoVeiculo);
    }
}
