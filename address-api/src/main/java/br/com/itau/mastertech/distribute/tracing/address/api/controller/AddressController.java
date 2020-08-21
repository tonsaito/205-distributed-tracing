package br.com.itau.mastertech.distribute.tracing.address.api.controller;

import br.com.itau.mastertech.distribute.tracing.address.api.model.AddressModel;
import br.com.itau.mastertech.distribute.tracing.address.api.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private CepService cepService;

    @GetMapping("/v1/addresses/{cep}")
    public AddressModel getAddressFromZipCodeV1(@PathVariable String cep){
        return cepService.getCep(cep);
    }

}
