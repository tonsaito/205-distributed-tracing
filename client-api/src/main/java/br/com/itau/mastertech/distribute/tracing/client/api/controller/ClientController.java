package br.com.itau.mastertech.distribute.tracing.client.api.controller;

import br.com.itau.mastertech.distribute.tracing.client.api.entity.ClientEntity;
import br.com.itau.mastertech.distribute.tracing.client.api.model.ClientModel;
import br.com.itau.mastertech.distribute.tracing.client.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/v1/clients", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientEntity> saveClientV1(@RequestBody ClientModel clientModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(clientModel));
    }
}
