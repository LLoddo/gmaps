package it.gmaps.controller;

import it.gmaps.api.AddressApi;
import it.gmaps.model.Address;
import it.gmaps.model.FormattedAddress;
import it.gmaps.service.AddressValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements AddressApi {

    @Autowired
    AddressValidationService service;

    @Override
    public ResponseEntity<FormattedAddress> getFormattedAddress(Address address) {
        return null;
    }
}