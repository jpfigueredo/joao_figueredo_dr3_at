package br.com.infnet.status_service.service;

import br.com.infnet.status_service.model.Status;
import br.com.infnet.status_service.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public boolean isAtivo(Long id) {
        Mono<Status> statusMono = statusRepository.findById(id);
        Status status = statusMono.block(); // Bloqueia a execução até o valor ser retornado
        return status != null && status.isOnOff();
    }
}
