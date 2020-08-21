package br.com.itau.mastertech.distribute.tracing.address.api.service;

import br.com.itau.mastertech.distribute.tracing.address.api.model.AddressModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws/")
public interface CepService {

    @GetMapping("/{cep}/json")
    AddressModel getCep(@PathVariable String cep);
}
