package br.com.infnet.status_service.repository;

import br.com.infnet.status_service.model.Status;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends ReactiveCrudRepository<Status, Long> {}
