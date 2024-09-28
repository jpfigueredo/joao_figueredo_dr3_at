package br.com.infnet.veiculo_service.service;

import br.com.infnet.veiculo_service.model.Veiculo;
import br.com.infnet.veiculo_service.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Flux<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Mono<Veiculo> save(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Mono<Void> remover(Veiculo veiculo) {
        return veiculoRepository.delete(veiculo);
    }

    public Mono<Veiculo> atualizar(Veiculo veiculo, Long id) throws Exception {
        Mono<Veiculo> veiculoEncontrado = veiculoRepository.findById(id);
        if(veiculoEncontrado != null) {
            veiculo.setId(id);
        }else{
            throw new Exception("Veiculo não encontrado.");
        }
        return veiculoRepository.save(veiculo);
    }
}