package br.com.infnet.imovel_service.service;

import br.com.infnet.imovel_service.model.Imovel;
import br.com.infnet.imovel_service.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping()
    public Flux<Imovel> findAll() {
        return imovelRepository.findAll();
    }

    @PostMapping()
    public Mono<Imovel> save(@RequestBody Imovel imovel) {
        return imovelRepository.save(imovel);
    }

}
