package br.com.itau.mastertech.distribute.tracing.client.api.service;

import br.com.itau.mastertech.distribute.tracing.client.api.model.AddressModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("address-service")
public interface CepService {

    @GetMapping("/v1/addresses/{cep}")
    public AddressModel getAddress(@PathVariable String cep);
}
