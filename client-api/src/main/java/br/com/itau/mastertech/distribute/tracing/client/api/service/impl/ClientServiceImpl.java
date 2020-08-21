package br.com.itau.mastertech.distribute.tracing.client.api.service.impl;

import br.com.itau.mastertech.distribute.tracing.client.api.entity.ClientEntity;
import br.com.itau.mastertech.distribute.tracing.client.api.model.ClientModel;
import br.com.itau.mastertech.distribute.tracing.client.api.repository.ClientRepository;
import br.com.itau.mastertech.distribute.tracing.client.api.service.CepService;
import br.com.itau.mastertech.distribute.tracing.client.api.service.ClientService;
import br.com.itau.mastertech.distribute.tracing.client.api.wrapper.AddressWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CepService cepService;

    @Override
    @Transactional
    @NewSpan("save-client")
    public ClientEntity save(@SpanTag("client-model") ClientModel clientModel) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setName(clientModel.getName());
        clientEntity.setAddress(AddressWrapper.toAddressEntity(cepService.getAddress(clientModel.getCep())));
        return clientRepository.save(clientEntity);
    }
}
