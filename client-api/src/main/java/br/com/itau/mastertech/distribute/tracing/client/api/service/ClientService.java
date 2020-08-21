package br.com.itau.mastertech.distribute.tracing.client.api.service;

import br.com.itau.mastertech.distribute.tracing.client.api.entity.ClientEntity;
import br.com.itau.mastertech.distribute.tracing.client.api.model.ClientModel;

public interface ClientService {

    ClientEntity save(ClientModel clientModel);
}
