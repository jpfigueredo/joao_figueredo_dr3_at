package br.com.infnet.imovel_service.controller;

import br.com.infnet.imovel_service.model.Imovel;
import br.com.infnet.imovel_service.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping()
    public Flux<Imovel> listar() {
        return imovelService.findAll();
    }

    @PostMapping()
    public Mono<Imovel> adicionar(@RequestBody Imovel imovel) {
        return imovelService.save(imovel);
    }
}
