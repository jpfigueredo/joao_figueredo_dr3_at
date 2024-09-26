package br.com.infnet.status_service.controller;

import br.com.infnet.status_service.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping({"id"})
    public ResponseEntity<String> getStatus(@PathVariable Long id) {
        if (!statusService.isAtivo(id)) {
            return ResponseEntity.notFound().build();
//            ????
        }
        return ResponseEntity.ok().body("Status: Ativo");
    }
}
