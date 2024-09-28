package br.com.infnet.veiculo_service.controller;

import br.com.infnet.veiculo_service.model.Veiculo;
import br.com.infnet.veiculo_service.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public Flux<Veiculo> listar() {
        return veiculoService.findAll();
    }

    @PostMapping
    public Mono<Veiculo> adicionar(@RequestBody Veiculo veiculo) {
        return veiculoService.save(veiculo);
    }

    @DeleteMapping
    public Mono<Void> remover(@RequestBody Veiculo veiculo) {
        return veiculoService.remover(veiculo);
    }

    @PutMapping("/{id}")
    public Mono<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Long id) throws Exception {
        return veiculoService.atualizar(veiculo, id);
    }

}
