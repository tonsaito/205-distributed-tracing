package br.com.itau.mastertech.distribute.tracing.client.api.wrapper;

import br.com.itau.mastertech.distribute.tracing.client.api.entity.AddressEntity;
import br.com.itau.mastertech.distribute.tracing.client.api.model.AddressModel;

public class AddressWrapper {

    private AddressWrapper(){}

    public static AddressEntity toAddressEntity(AddressModel addressModel){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setZipcode(addressModel.getCep());
        addressEntity.setStreet(addressModel.getLogradouro());
        addressEntity.setComplement(addressModel.getComplemento());
        addressEntity.setNeighborhood(addressModel.getBairro());
        addressEntity.setCity(addressModel.getLocalidade());
        addressEntity.setState(addressModel.getUf());
        return addressEntity;
    }


}
