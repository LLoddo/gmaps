package it.gmaps.service;

import it.gmaps.client.FeignClient;
import it.gmaps.model.Address;
import it.gmaps.model.FormattedAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressValidationService {

    @Autowired
    FeignClient client;

    public FormattedAddress postAddressValidation(Address address){
        //client.postValidateAddress()
        return null;
    }

}
